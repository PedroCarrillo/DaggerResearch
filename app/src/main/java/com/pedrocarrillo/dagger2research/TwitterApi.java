package com.pedrocarrillo.dagger2research;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by PedroCarrillo on 4/7/16.
 */
@Singleton
public class TwitterApi {

    private final String client;

    @Inject
    public TwitterApi(String client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {
        //this should create an http client
        Log.e("post tweet", client.concat(" ").concat(user).concat(" ").concat(tweet));
    }

}
