package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina7 extends AppCompatActivity {
    private MediaPlayer reproductor7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina7);
        reproductor7 = MediaPlayer.create(this,R.raw.returnking);
        reproductor7.setLooping(true);
        reproductor7.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor7.isPlaying()){
            reproductor7.stop();
            reproductor7.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor7.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor7.pause();

    }

    public void PulseButton3(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
