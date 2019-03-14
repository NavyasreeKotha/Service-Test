package com.example.navyasree.servicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //TODO 1: call service
    public void startService(View view) {
        Intent i=new Intent(MainActivity.this,MusicService.class);
        startService(i);
    }

    public void stopService(View view) {
        Intent i=new Intent(MainActivity.this,MusicService.class);
        stopService(i);
    }
}
