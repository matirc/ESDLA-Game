package com.example.matirc.esdla_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reproductor = MediaPlayer.create(this,R.raw.hobbitsong);
        reproductor.setLooping(true);
        reproductor.start();
    }

    @Override

    protected void onDestroy(){
    super.onDestroy();
        if (reproductor.isPlaying()){
            reproductor.stop();
            reproductor.release();
        }
    }

    @Override

    protected void onResume(){
        super.onResume();
        reproductor.start();

    }

    @Override

    protected void onPause(){
        super.onPause();
        reproductor.pause();

    }

    public void onClick(View v){
        Intent intent = new Intent(this,Pagina1.class);
        startActivity(intent);
    }

    public void extra(View v){
        Intent browserIntent =
                new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://tolkien.chez.com/enciclopedia/"));
        startActivity(browserIntent);
    }


}
