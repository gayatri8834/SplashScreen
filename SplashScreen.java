package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );


        startActivity( new Intent( this, MainActivity.class ) );

        Thread s = new Thread() {
            @Override
            public void run() {
                try {
                    sleep( 10000 );
                } catch (Exception e) {
                }
            }
        };
        s.start();
    }
}
