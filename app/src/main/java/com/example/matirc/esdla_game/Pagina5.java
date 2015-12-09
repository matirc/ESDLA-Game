package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina5 extends AppCompatActivity {
    private MediaPlayer reproductor5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina5);
        reproductor5 = MediaPlayer.create(this,R.raw.returnking);
        reproductor5.setLooping(true);
        reproductor5.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor5.isPlaying()){
            reproductor5.stop();
            reproductor5.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor5.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor5.pause();

    }

    public void PulseButton6(View view) {
        Intent intent = new Intent(this,Pagina6.class);
        startActivity(intent);
    }

    public void PulseButton2(View view){
        Intent intent = new Intent(this,Pagina3.class);
        startActivity(intent);
    }
}
