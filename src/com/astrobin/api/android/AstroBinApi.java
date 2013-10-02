package com.astrobin.api.android;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;

import android.util.Log;

public class AstroBinApi extends RestApiBase {

    private static final String TAG = "AstroBinApi";

    // api params
    private static final String LIMIT = "limit";
    private static final String OFFSET = "offset";
    private static final String ORDERBY = "order_by";
    private static final String APIKEY = "api_key";
    private static final String APISECRET = "api_secret";
    private static final String FORMAT = "format";
    private static final String CONTAINS = "__icontains";

    // api resources
    public static final String CDN_HOST = "http://cdn.astrobin.com";
    public static final String API_HOST = "http://astrobin.com";
    public static final String API_BASE = API_HOST + "/api/v1";
    public static final String API_IMAGE = API_BASE + "/image";
    public static final String API_DAILYIMAGE = API_BASE + "/imageoftheday";

    // member variables
    private String mApiKey;
    private String mApiSecret;

    /**
     * Constructor for AstroBinApi.
     * 
     * @param apiKey
     * @param apiSecret
     */
    public AstroBinApi(String apiKey, String apiSecret) {
        super();
        // api authentication is inline, we will handle locally
        mApiKey = apiKey;
        mApiSecret = apiSecret;
    }

    /**
     * Initialize the default url parameter string with apikey,
     * apisecret, and format (json).
     * 
     * @return Map<String, String>
     */
    public Map<String, String> initParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put(APIKEY, mApiKey);
        params.put(APISECRET, mApiSecret);
        params.put(FORMAT, "json");
        return params;
    }

    /**
     * Get image by uri.
     * 
     * @param String uri
     * @return Image
     */
    public Image getImage(String uri) {
        Image image = null;

        Map<String, String> params = initParams();
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;version=1");

        HttpURLConnection conn = sendHttpRequest(API_HOST + uri, "GET", params, headers);
        if (conn != null) {
            try {
                InputStream istream = conn.getInputStream();
                if (istream != null) {
                    JsonFactory jf = new JsonFactory();
                    JsonParser jp = jf.createJsonParser(istream);
                    image = mMapper.readValue(jp, Image.class);
                    Log.i(TAG, "getImage result (id): " + image.getId());
                }
            } catch (JsonParseException e) {
                Log.e(TAG, "getImage: JSON parse error " + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "getImage: Server I/O error " + e.getMessage());
            }
        }
        return image;
    }

    /**
     * Get image by id.
     * 
     * @param int id
     * @return Image
     */
    public Image getImage(int id) {
        Image image = null;

        Map<String, String> params = initParams();
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;version=1");

        HttpURLConnection conn = sendHttpRequest(API_IMAGE + "/" + id + "/", "GET", params, headers);
        if (conn != null) {
            try {
                InputStream istream = conn.getInputStream();
                if (istream != null) {
                    JsonFactory jf = new JsonFactory();
                    JsonParser jp = jf.createJsonParser(istream);
                    image = mMapper.readValue(jp, Image.class);
                    Log.i(TAG, "getImage result (id): " + image.getId());
                }
            } catch (JsonParseException e) {
                Log.e(TAG, "getImage: JSON parse error " + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "getImage: Server I/O error " + e.getMessage());
            }
        }
        return image;
    }

    /**
     * Get image of the day.
     * 
     * @param Map<String, String> where
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImageOfTheDay(Map<String, String> where, Integer limit, Integer offset, String orderby) {
        ArrayList<Image> images = null;

        Map<String, String> params = initParams();
        if (where != null) {
            for (String key : where.keySet()) {
                params.put(key, where.get(key));
            }
        }
        if (limit != null) params.put(LIMIT, String.valueOf(limit));
        if (offset != null) params.put(OFFSET, String.valueOf(offset));
        if (orderby != null) params.put(ORDERBY, orderby);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;version=1");

        HttpURLConnection conn = sendHttpRequest(API_DAILYIMAGE, "GET", params, headers);
        if (conn != null) {
            try {
                InputStream istream = conn.getInputStream();
                if (istream != null) {
                    JsonFactory jf = new JsonFactory();
                    JsonParser jp = jf.createJsonParser(istream);
                    SearchImageResponse response = mMapper.readValue(jp, SearchImageResponse.class);
                    images = response.getObjects();
                    Log.i(TAG, "getImageOfTheDay result: " + images.size() + " image(s)");
                }
            } catch (JsonParseException e) {
                Log.e(TAG, "getImageOfTheDay: JSON parse error " + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "getImageOfTheDay: Server I/O error " + e.getMessage());
            }
        }
        return images;
    }
    
    public Image getImageOfTheDay() {
        ArrayList<Image> images = getImageOfTheDay(null, 1, null, null);
        return images.get(0);
    }
    
    
    /**
     * Get images.
     * 
     * @param Map<String, String> where
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImages(Map<String, String> where, Integer limit, Integer offset, String orderby) {
        ArrayList<Image> images = null;

        Map<String, String> params = initParams();
        if (where != null) {
            for (String key : where.keySet()) {
                params.put(key, where.get(key));
            }
        }
        if (limit != null) params.put(LIMIT, String.valueOf(limit));
        if (offset != null) params.put(OFFSET, String.valueOf(offset));
        if (orderby != null) params.put(ORDERBY, orderby);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json;version=1");

        HttpURLConnection conn = sendHttpRequest(API_IMAGE, "GET", params, headers);
        if (conn != null) {
            try {
                InputStream istream = conn.getInputStream();
                if (istream != null) {
                    JsonFactory jf = new JsonFactory();
                    JsonParser jp = jf.createJsonParser(istream);
                    SearchImageResponse response = mMapper.readValue(jp, SearchImageResponse.class);
                    images = response.getObjects();
                    Log.i(TAG, "getImages result: " + images.size() + " image(s)");
                }
            } catch (JsonParseException e) {
                Log.e(TAG, "getImages: JSON parse error " + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "getImages: Server I/O error " + e.getMessage());
            }
        }
        return images;
    }

    /**
     * Get images by subject.
     * 
     * @param String subject
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImagesBySubject(String subject, Integer limit, Integer offset, String orderby) {
        Map<String, String> where = new HashMap<String, String>();
        where.put(Image.SUBJECT, subject);
        return getImages(where, limit, offset, orderby);
    }

    /**
     * Get images by user.
     * 
     * @param String user
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImagesByUser(String user, Integer limit, Integer offset, String orderby) {
        Map<String, String> where = new HashMap<String, String>();
        where.put(Image.USER, user);
        return getImages(where, limit, offset, orderby);
    }
    
    /**
     * Get images by partial title.
     * 
     * @param String title
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImagesByTitle(String title, Integer limit, Integer offset, String orderby) {
        Map<String, String> where = new HashMap<String, String>();
        where.put(Image.TITLE + CONTAINS, title);
        return getImages(where, limit, offset, orderby);
    }
    
    /**
     * Get images by partial description.
     * 
     * @param String keyword
     * @param Integer limit
     * @param Integer offset
     * @param String orderby
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getImagesByDescription(String keyword, Integer limit, Integer offset, String orderby) {
        Map<String, String> where = new HashMap<String, String>();
        where.put(Image.DESCRIPTION + CONTAINS, keyword);
        return getImages(where, limit, offset, orderby);
    }

    /**
     * Get top images.
     * 
     * @param Integer limit
     * 
     * @return ArrayList<Image>
     */
    public ArrayList<Image> getTopImages(Integer limit) {
        String orderby = Image.RATING_SCORE;
        if (limit == null) limit = 5;
        return getImages(null, limit, null, orderby);
    }
    
}
