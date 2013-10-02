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
