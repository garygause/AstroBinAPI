/*
 * Copyright (C) 2013 Gary Gause, Salvatore Iovene, see LICENSE for details.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Gary Gause
 * 
 */
package com.astrobin.api.android;

import java.util.ArrayList;

public class Image {

    // {"animated": false, "dec_center_dms": "+41:15:58.936", "description": "It was a clear sky so I thought...", "fieldh": "2.8220000000", "fieldunits": "degrees", "fieldw": "4.2370000000", "filename": "df1c3c7a-da1a-484c-9798-8eef318a911d", "h": 1896, "id": "57782", "imaging_cameras": ["Canon EOS 1100D / Rebel T3"], "imaging_telescopes": [" EF 75-300mm f/4-5.6"], "is_final": true, "is_solved": true, "license": 1, "link": "", "link_to_fits": "", "orientation": "94.4357310000", "original_ext": ".jpg", "ra_center_hms": "00:42:51.913", "rating_score": 4, "rating_votes": 2, "resource_uri": "/api/v1/image/57782/", "revisions": [], "subjects": ["M110", "M32", "M31"], "title": "Andromeda", "updated": "2013-09-26T15:40:18.828211", "uploaded": "2013-09-26T12:33:58.103845", "user": "micko", "w": 2848}

    /* Json fields:
     * 
     * animated
     * dec_center_dms
     * ra_center_hms
     * description
     * fieldh
     * fieldw
     * fieldunits
     * filename
     * h
     * w
     * id
     * imaging_cameras (array)
     * imaging_telescopes (array)
     * is_final
     * is_solved
     * license
     * link
     * link_to_fits
     * orientation
     * original_ext
     * rating_score
     * rating_votes
     * resource_uri
     * revisions (array)
     * subjects (array)
     * title
     * updated
     * uploaded
     * user
     */
    
    public static final String ID = "id";
    public static final String HEIGHT = "h";
    public static final String WIDTH = "w";
    public static final String FIELDH = "fieldh";
    public static final String FIELDW = "fieldw";
    public static final String FIELDUNITS = "fieldunits";
    public static final String ANIMATED = "animated";
    public static final String DEC_CENTER_DMS = "dec_center_dms";
    public static final String RA_CENTER_DMS = "ra_center_dms";
    public static final String DESCRIPTION = "description";
    public static final String IS_SOLVED = "is_solved";
    public static final String IS_FINAL = "is_final";
    public static final String FILENAME = "filename";
    public static final String LICENSE = "license";
    public static final String LINK = "link";
    public static final String LINK_TO_FITS = "link_to_fits";
    public static final String ORIENTATION = "orientation";
    public static final String ORIGINAL_EXT = "original_ext";
    public static final String USER = "user";
    public static final String RATING_SCORE = "rating_score";
    public static final String RATING_VOTES = "rating_votes";
    public static final String RESOURCE_URI = "resource_uri";
    public static final String REVISIONS = "revisions";
    public static final String SUBJECTS = "subjects";
    public static final String TITLE = "title";
    public static final String UPLOADED = "uploaded";
    public static final String UPDATED = "updated";
    public static final String IMAGING_CAMERAS = "imaging_cameras";
    public static final String IMAGING_TELESCOPES = "imaging_telescopes";
    public static final String SUBJECT = "subject";

    protected int mId;
    protected boolean mAnimated;
    protected String mDecCenterDms;
    protected String mRaCenterDms;
    protected String mDescription;
    protected float mFieldHeight;
    protected float mFieldWidth;
    protected String mFieldUnits;
    protected String mFileName;
    protected int mHeight;
    protected int mWidth;
    protected boolean mIsFinal;
    protected boolean mIsSolved;
    protected int mLicense;
    protected String mLink;
    protected String mLinkToFits;
    protected float mOrientation;
    protected String mOriginalExtension;
    protected int mRatingScore;
    protected int mRatingVotes;
    protected String mResourceUri;
    protected String mTitle;
    protected String mUpdated;
    protected String mUploaded;
    protected String mUser;
    protected ArrayList<String> mRevisions;
    protected ArrayList<String> mSubjects;
    protected ArrayList<String> mImagingCameras;
    protected ArrayList<String> mImagingTelescopes;
    
    public Image() {};    
    
    public String getImageThumb() {
        String url = null;
        if (mFileName != null && mFileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + mFileName + "_thumb.png";
        }
        return url;
    }
    
    public static String getImageThumb(String fileName) {
        String url = null;
        if (fileName != null && fileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + fileName + "_thumb.png";
        }
        return url;
    }
    
    public String getImageResized() {
        String url = null;
        if (mFileName != null && mFileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + mFileName + "_resized" + mOriginalExtension;
        }
        return url;
    }
    
    public static String getImageResized(String fileName, String extension) {
        String url = null;
        if (fileName != null && fileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + fileName + "_resized" + extension;
        }
        return url;
    }
    
    public String getImageHd() {
        String url = null;
        if (mFileName != null && mFileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + mFileName + mOriginalExtension;
        }
        return url;
    }
    
    public static String getImageHd(String fileName, String extension) {
        String url = null;
        if (fileName != null && fileName.length() > 0) {
            // TODO: have server send file paths
            url = AstroBinApi.CDN_HOST + "/images/" + fileName + extension;
        }
        return url;
    }    
    
    public int getId() {
        return mId;
    }
    
    public void setId(int id) {
        mId = id;
    }
    
    public boolean getAnimated() {
        return mAnimated;       
    }
    
    public void setAnimated(boolean animated) {
        mAnimated = animated;
    }
    
    // method names must match json fields exactly
    // for parser to work automagically.
    
    public String getDec_center_dms() {
        return mDecCenterDms;
    }
    
    public void setDec_center_dms(String dec) {
        mDecCenterDms = dec;
    }    

    public String getRa_center_dms() {
        return mRaCenterDms;
    }
        
    public void setRa_center_dms(String ra) {
        mRaCenterDms = ra;
    }

    public String getDescription() {
        return mDescription;
    }
    
    public void setDescription(String desc) {
        mDescription = desc;
    }

    public float getFieldh() {
        return mFieldHeight;
    }
    
    public void setFieldh(float fieldHeight) {
        mFieldHeight = fieldHeight;
    }
    
    public float getFieldw() {
        return mFieldWidth;
    }
    
    public void setFieldw(float fieldWidth) {
        mFieldWidth = fieldWidth;
    }
    
    public String getFieldunits() {
        return mFieldUnits;
    }
    
    public void setFieldunits(String units) {
        mFieldUnits = units;
    }

    public String getFilename() {
        return mFileName;
    }
    
    public void setFilename(String fileName) {
        mFileName = fileName;
    }

    public int getH() {
        return mHeight;
    }

    public void setH(int height) {
        mHeight = height;
    }
    
    public int getW() {
        return mWidth;
    }
    
    public void setW(int width) {
        mWidth = width;
    }
    
    public boolean getIs_final() {
        return mIsFinal;
    }
    
    public void setIs_final(boolean isFinal) {
        mIsFinal = isFinal;
    }
    
    public boolean getIs_solved() {
        return mIsSolved;
    }
    
    public void setIs_solved(boolean isSolved) {
        mIsSolved = isSolved;
    }
    
    public int getLicense() {
        return mLicense;
    }

    public void setLicense(int license) {
        mLicense = license;
    }
    
    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getLink_to_fits() {
        return mLinkToFits;
    }

    public void setLink_to_fits(String link) {
        mLinkToFits = link;
    }
    
    public float getOrientation() {
        return mOrientation;
    }

    public void setOrientation(float value) {
        mOrientation = value;
    }
    
    public String getOriginal_ext() {
        return mOriginalExtension;
    }

    public void setOriginal_ext(String extension) {
        mOriginalExtension = extension;
    }

    public int getRating_score() {
        return mRatingScore;
    }
    
    public void setRating_score(int score) {
        mRatingScore = score;
    }
    
    public int getRating_votes() {
        return mRatingVotes;
    }
    
    public void setRating_votes(int votes) {
        mRatingVotes = votes;
    }
    
    public String getResource_uri() {
        return mResourceUri;
    }
    
    public void setResource_uri(String uri) {
        mResourceUri = uri;
    }
    
    public String getUpdated() {
        return mUpdated;
    }
    
    public void setUpdated(String date) {
        mUpdated = date;
    }
    
    public String getUploaded() {
        return mUploaded;
    }
    
    public void setUploaded(String date) {
        mUploaded = date;
    }
    
    public String getUser() {
        return mUser;
    }
    
    public void setUser(String user) {
        mUser = user;
    }
    
    public String getTitle() {
        return mTitle;
    }
    
    public void setTitle(String title) {
        mTitle = title;
    }
    
    public ArrayList<String> getImaging_cameras() {
        return mImagingCameras;
    }
    
    public void setImaging_cameras(ArrayList<String> cameras) {
        mImagingCameras = cameras;
    }
    
    public ArrayList<String> getImaging_telescopes() {
        return mImagingTelescopes;
    }
    
    public void setImaging_telescopes(ArrayList<String> telescopes) {
        mImagingTelescopes = telescopes;
    }
    
    public ArrayList<String> getRevisions() {
        return mRevisions;
    }
    
    public void setRevisions(ArrayList<String> revisions) {
        mRevisions = revisions;
    }
    
    public ArrayList<String> getSubjects() {
        return mSubjects;
    }
    
    public void setSubjects(ArrayList<String> subjects) {
        mSubjects = subjects;
    }
 
}
