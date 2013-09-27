package com.astrobin.api.android;

import java.util.ArrayList;

public class SearchImageResponse {
    
    private Meta mMeta;
    private ArrayList<Image> mObjects;
    
    public Meta getMeta() {
        return mMeta;
    }
    
    public void setMeta(Meta meta) {
        mMeta = meta;
    }
    
    public ArrayList<Image> getObjects() {
        return mObjects;
    }
    
    public void setObjects(ArrayList<Image> objects) {
        mObjects = objects;
    }
    
}
