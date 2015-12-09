package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina4 extends AppCompatActivity {
    private MediaPlayer reproductor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina4);
        reproductor4 = MediaPlayer.create(this,R.raw.rohan);
        reproductor4.setLooping(true);
        reproductor4.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor4.isPlaying()){
            reproductor4.stop();
            reproductor4.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor4.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor4.pause();

    }

    public void PulseButton5(View view) {
        Intent intent = new Intent(this,Pagina5.class);
        startActivity(intent);
    }

    public void PulseButton2(View view){
        Intent intent = new Intent(this,Pagina3.class);
        startActivity(intent);
    }
}
