package com.example.ojonugwa.trafficam;

public class feeds {
    private String mUsername;

    private String mDescr;

    public feeds(String username, String description){
        mUsername = username;
        mDescr = description;
    }

    public String getmUsername() {
        return mUsername;
    }

    public String getmDescr() {
        return mDescr;
    }

}