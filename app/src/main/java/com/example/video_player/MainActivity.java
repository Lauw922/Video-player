package com.example.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaController mediaController = new MediaController(this);


        VideoView videoView_Auto = findViewById(R.id.vVAuto);

        String uriPath = ("android.resource://" + getPackageName() + "/raw/" + R.raw.mp_ts_drunk);
        Uri uri = Uri.parse(uriPath);
        videoView_Auto.setVideoURI(uri);


        mediaController.setAnchorView(videoView_Auto);
        videoView_Auto.setMediaController(mediaController);

        // videoView_Auto.start();  lancement automatique de la vidéo

    }



}