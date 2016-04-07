package com.pedrocarrillo.dagger2research;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PedroCarrillo on 4/7/16.
 */

@Module
public class NetworkModule {

    @Provides @Singleton
    String provideOkHttpClient() {
        return "OkHttpClient";
    }
//
//    @Provides
//    TwitterApi provideTwitterApi(String client) {
//        return new TwitterApi(client);
//    }

}
