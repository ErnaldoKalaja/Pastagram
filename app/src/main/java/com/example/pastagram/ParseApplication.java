package com.example.pastagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LFvkcBOwqLkYnPOW2158Kn8PmpKAVKO43RtSffeg")
                .clientKey("7uKo0Rt2O2LKAlBN30tIi7xYELyHEgJ4z8m16xEO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
