package com.pedrocarrillo.dagger2research;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PedroCarrillo on 4/7/16.
 */
@Module
public class TwitterModule {

    private final String user;

    public TwitterModule(String user) {
        this.user = user;
    }

    @Provides @Singleton
    Tweeter provideTweeter(TwitterApi api) {
        return new Tweeter(api, user);
    }

    @Provides @Singleton
    Timeline provideTimeline(TwitterApi api) {
        return new Timeline(api, user);
    }

}
