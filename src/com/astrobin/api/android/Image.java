package com.astrobin.api.android;

import java.util.ArrayList;

public class Image {

    // {"animated": false, "dec_center_dms": "+41:15:58.936", "description": "It was a clear sky so I thought...", "fieldh": "2.8220000000", "fieldunits": "degrees", "fieldw": "4.2370000000", "filename": "df1c3c7a-da1a-484c-9798-8eef318a911d", "h": 1896, "id": "57782", "imaging_cameras": ["Canon EOS 1100D / Rebel T3"], "imaging_telescopes": [" EF 75-300mm f/4-5.6"], "is_final": true, "is_solved": true, "license": 1, "link": "", "link_to_fits": "", "orientation": "94.4357310000", "original_ext": ".jpg", "ra_center_hms": "00:42:51.913", "rating_score": 4, "rating_votes": 2, "resource_uri": "/api/v1/image/57782/", "revisions": [], "subjects": ["M110", "M32", "M31"], "title": "Andromeda", "updated": "2013-09-26T15:40:18.828211", "uploaded": "2013-09-26T12:33:58.103845", "user": "micko", "w": 2848}

    /* Json fields:
     * 
     * animated
     * dec_center_dms
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
     * ra_center_hms
     * rating_score
     * rating_votes
     * resource_uri
     * revisions (array)
     * subjects (array)
     * title
     * updated
     * uploaded
     * user
     * w
     */
    
    public static final String USER = "user";
    public static final String RATING_SCORE = "rating_score";
    public static final String SUBJECTS = "subjects";
    public static final String SUBJECT = "subject";
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    
    private int mId;
    private boolean mAnimated;
    private String mDecCenterDms;
    private String mRaCenterDms;
    private String mDescription;
    private float mFieldHeight;
    private float mFieldWidth;
    private String mFieldUnits;
    private String mFileName;
    private int mHeight;
    private int mWidth;
    private boolean mIsFinal;
    private boolean mIsSolved;
    private int mLicense;
    private String mLink;
    private String mLinkToFits;
    private float mOrientation;
    private String mOriginalExtension;
    private int mRatingScore;
    private int mRatingVotes;
    private String mResourceUri;
    private String mTitle;
    private String mUpdated;
    private String mUploaded;
    private String mUser;
    private ArrayList<String> mRevisions;
    private ArrayList<String> mSubjects;
    private ArrayList<String> mImagingCameras;
    private ArrayList<String> mImagingTelescopes;
    
    public Image() {};    
    
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
