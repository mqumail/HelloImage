package com.example.mqumail.helloimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView a = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this).load("http://i.imgur.com/Dvpvk.png").into(a);

        ImageView b =(ImageView) findViewById(R.id.imageView2);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(b);



    }
}
