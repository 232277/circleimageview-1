package com.example.ly.circleimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.liji.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleImageView circleimageview=(CircleImageView)findViewById(R.id.circleimageview);
        Glide.with(MainActivity.this).load("http://s15.sinaimg.cn/mw690/bf131490gd817c13a0dfe&690").into(circleimageview);

    }
}
