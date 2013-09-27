package com.astrobin.api.android;

public class Meta {
    
    // matches meta data from json response
    /* json fields:
     * limit
     * next
     * offset
     * previous
     * total_count
     */
    
    private int mLimit;
    private int mOffset;
    private int mTotalCount;
    private String mNext;
    private String mPrevious;
    
    public int getTotal_count() {
        return mTotalCount;
    }
    
    public void setTotal_count(int count) {
        mTotalCount = count;
    }
    
    public int getLimit() {
        return mLimit;
    }
    
    public void setLimit(int limit) {
        mLimit = limit;
    }
    
    public int getOffset() {
        return mOffset;
    }
    
    public void setOffset(int offset) {
        mOffset = offset;
    }    
    
    public String getNext() {
        return mNext;
    }
    
    public void setNext(String next) {
        mNext = next;
    }
    
    public String getPrevious() {
        return mPrevious;
    }
    
    public void setPrevious(String previous) {
        mPrevious = previous;
    }
    
}
