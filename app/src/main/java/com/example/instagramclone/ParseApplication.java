package com.example.instagramclone;

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
                .applicationId("1SNNqKlTcGBCuM7aviMdS5uuBdGTO9vekyqbIqIq")
                .clientKey("bQeiVo69aBAbtQrenfihaGDzoMGi1kkoTCotyQGe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
