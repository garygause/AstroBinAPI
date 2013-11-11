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

    /* Json fields:
     * 
     * animated
     * dec_center_dms
     * ra_center_hms
     * description
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
     * rating_score
     * rating_votes
     * resource_uri
     * revisions (array)
     * subjects (array)
     * title
     * updated
     * uploaded
     * user
     * url_thumb
     * url_gallery
     * url_regular
     * url_hd
     * url_real
     */
    
    public static final String ID = "id";
    public static final String HEIGHT = "h";
    public static final String WIDTH = "w";
    public static final String ANIMATED = "animated";
    public static final String DEC_CENTER_DMS = "dec_center_dms";
    public static final String RA_CENTER_DMS = "ra_center_dms";
    public static final String DESCRIPTION = "description";
    public static final String IS_SOLVED = "is_solved";
    public static final String IS_FINAL = "is_final";
    public static final String LICENSE = "license";
    public static final String LINK = "link";
    public static final String LINK_TO_FITS = "link_to_fits";
    public static final String ORIENTATION = "orientation";
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
    public static final String URL_THUMB = "url_thumb";
    public static final String URL_GALLERY = "url_gallery";
    public static final String URL_REGULAR = "url_regular";
    public static final String URL_HD = "url_hd";
    public static final String URL_REAL = "url_real";


    protected int mId;
    protected boolean mAnimated;
    protected String mDecCenterDms;
    protected String mRaCenterDms;
    protected String mDescription;
    protected int mHeight;
    protected int mWidth;
    protected boolean mIsFinal;
    protected boolean mIsSolved;
    protected int mLicense;
    protected String mLink;
    protected String mLinkToFits;
    protected float mOrientation;
    protected int mRatingScore;
    protected int mRatingVotes;
    protected String mResourceUri;
    protected String mTitle;
    protected String mUpdated;
    protected String mUploaded;
    protected String mUser;
    protected String mUrlThumb;
    protected String mUrlGallery;
    protected String mUrlRegular;
    protected String mUrlHd;
    protected String mUrlReal;
    protected ArrayList<String> mRevisions;
    protected ArrayList<String> mSubjects;
    protected ArrayList<String> mImagingCameras;
    protected ArrayList<String> mImagingTelescopes;
    
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
    
    public String getUrl_thumb() {
        return mUrlThumb;
    }
    
    public void setUrl_thumb(String url) {
        mUrlThumb = url;
    }
    
    public String getUrl_gallery() {
        return mUrlGallery;
    }
    
    public void setUrl_gallery(String url) {
        mUrlGallery = url;
    }
    
    public String getUrl_regular() {
        return mUrlRegular;
    }
    
    public void setUrl_regular(String url) {
        mUrlRegular = url;
    }
    
    public String getUrl_hd() {
        return mUrlHd;
    }
    
    public void setUrl_hd(String url) {
        mUrlHd = url;
    }
    
    public String getUrl_real() {
        return mUrlReal;
    }
    
    public void setUrl_real(String url) {
        mUrlReal = url;
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
