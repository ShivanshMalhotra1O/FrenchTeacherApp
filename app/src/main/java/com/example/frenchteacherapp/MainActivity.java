package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blbtn , gnbtn , pebtn , rdbtn , ywbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blbtn = findViewById(R.id.button1);
        gnbtn = findViewById(R.id.button2);
        pebtn = findViewById(R.id.button3);
        rdbtn = findViewById(R.id.button4);
        ywbtn = findViewById(R.id.button5);

        blbtn.setOnClickListener(this);
        gnbtn.setOnClickListener(this);
        pebtn.setOnClickListener(this);
        rdbtn.setOnClickListener(this);
        ywbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

//        Find the button Id and play the sound

        int clickedBtnId = view.getId();

        if(clickedBtnId == R.id.button1){
            PlaySounds(R.raw.black);
        }
        else if (clickedBtnId == R.id.button2) {
            PlaySounds(R.raw.green);
        }
        else if (clickedBtnId == R.id.button3) {
            PlaySounds(R.raw.purple);
        }
        else if (clickedBtnId == R.id.button4) {
            PlaySounds(R.raw.red);
        }
        else if (clickedBtnId == R.id.button5) {
            PlaySounds(R.raw.yellow);
        }

    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}