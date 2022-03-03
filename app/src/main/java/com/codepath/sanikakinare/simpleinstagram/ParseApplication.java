package com.codepath.sanikakinare.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4618qy8OuWXybb0pxguofxVEnGhQMOMnoCicwT1A")
                .clientKey("QKppukvlNcBaag2YTURGP5pf0qljQLNzDdKAXyCE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
