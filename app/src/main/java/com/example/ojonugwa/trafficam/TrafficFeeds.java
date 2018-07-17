package com.example.ojonugwa.trafficam;

public class TrafficFeeds {

    // Name of the user
    private String mUsername;

    // User Traffic feed
    private String mDescr;

    // User drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new TrafficFeed object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public TrafficFeeds(String username, String description, int imageResourceId){
        mUsername = username;
        mDescr = description;
        mImageResourceId = imageResourceId;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getDescr() {
        return mDescr;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}