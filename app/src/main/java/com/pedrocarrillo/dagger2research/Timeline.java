package com.pedrocarrillo.dagger2research;

/**
 * Created by PedroCarrillo on 4/7/16.
 */
public class Timeline {

    private final TwitterApi api;
    private final String user;

    public Timeline(TwitterApi api, String user) {
        this.api = api;
        this.user = user;
    }

    public void loadMore(int page) {
        System.out.println("this is a timeline request");
    }

}
