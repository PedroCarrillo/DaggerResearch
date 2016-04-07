package com.pedrocarrillo.dagger2research;

/**
 * Created by PedroCarrillo on 4/7/16.
 */
public class Tweeter {

    private final TwitterApi api;
    private final String user;

    public Tweeter(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
    }

}
