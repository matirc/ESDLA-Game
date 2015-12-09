package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pagina1 extends AppCompatActivity {

    private ImageView img;
    private TextView txt;
    private MediaPlayer reproductor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);
        img = (ImageView)findViewById(R.id.imgprincipal);
        txt = (TextView)findViewById(R.id.textoprincipal);
        reproductor1 = MediaPlayer.create(this,R.raw.misty);
        reproductor1.setLooping(true);
        reproductor1.start();
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        if (reproductor1.isPlaying()){
            reproductor1.stop();
            reproductor1.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor1.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor1.pause();

    }

    public void PulseButton2(View view) {
        Intent intent = new Intent(this,Pagina3.class);
        startActivity(intent);
    }

    public void PulseButton1(View view){
        Intent intent = new Intent(this,Pagina2.class);
        startActivity(intent);
        }
    }

