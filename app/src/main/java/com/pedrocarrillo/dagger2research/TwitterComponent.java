package com.pedrocarrillo.dagger2research;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by PedroCarrillo on 4/7/16.
 */
@Singleton
@Component(
        modules = {
                NetworkModule.class,
                TwitterModule.class
        }
)
public interface TwitterComponent {

    Tweeter tweeter();
    Timeline timeline();
//    void inject(MainActivity mainActivity);

}
