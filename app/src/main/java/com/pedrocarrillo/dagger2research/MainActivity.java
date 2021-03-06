package com.pedrocarrillo.dagger2research;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TwitterComponent component = DaggerTwitterComponent.builder()
                .twitterModule(new TwitterModule("pter9"))
                .build();

        Tweeter tweeter = component.tweeter();
        tweeter.tweet("this is a tweet");
    }
}
