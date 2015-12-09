package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pagina6 extends AppCompatActivity {
    private MediaPlayer reproductor6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina6);
        reproductor6 = MediaPlayer.create(this,R.raw.hobbitsong);
        reproductor6.setLooping(true);
        reproductor6.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor6.isPlaying()){
            reproductor6.stop();
            reproductor6.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor6.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor6.pause();

    }

    public void PulseButton7(View view) {
        Intent intent = new Intent(this,Pagina7.class);
        startActivity(intent);
    }

    public void PulseButton2(View view){
        Intent intent = new Intent(this,Pagina3.class);
        startActivity(intent);
    }
}
