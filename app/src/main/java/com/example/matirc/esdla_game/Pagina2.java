package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina2 extends AppCompatActivity {
    private MediaPlayer reproductor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        reproductor2 = MediaPlayer.create(this,R.raw.thewest);
        reproductor2.setLooping(true);
        reproductor2.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor2.isPlaying()){
            reproductor2.stop();
            reproductor2.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor2.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor2.pause();

    }

    public void PulseButton4(View view) {
        Intent intent = new Intent(this,Pagina4.class);
        startActivity(intent);
    }

    public void PulseButton2(View view){
        Intent intent = new Intent(this,Pagina3.class);
        startActivity(intent);
    }
}
