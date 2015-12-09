package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina3 extends AppCompatActivity {
    private MediaPlayer reproductor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);
        reproductor3 = MediaPlayer.create(this,R.raw.dark);
        reproductor3.setLooping(true);
        reproductor3.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor3.isPlaying()){
            reproductor3.stop();
            reproductor3.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor3.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor3.pause();

    }

    public void PulseButton3(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
