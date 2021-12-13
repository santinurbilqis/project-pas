package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgBoba,imgJeruk,imgKelapa,imgTeh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgTeh = (CircleImageView) findViewById(R.id.circleImageView);
        imgJeruk = (CircleImageView) findViewById(R.id.circleImageView2);
        imgKelapa = (CircleImageView) findViewById(R.id.circleImageView4);
        imgBoba = (CircleImageView) findViewById(R.id.circleImageView5);

        imgTeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTeh = new Intent(MainActivity.this,boba.class);
                startActivity(pindahTeh);
            }
        });
        imgJeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahJeruk = new Intent(MainActivity.this,jeruk.class);
                startActivity(pindahJeruk);
            }
        });
        imgKelapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKelapa = new Intent(MainActivity.this,kelapa.class);
                startActivity(pindahKelapa);
            }
        });
        imgBoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBoba = new Intent(MainActivity.this,teh.class);
                startActivity(pindahBoba);
            }
        });
    }
}