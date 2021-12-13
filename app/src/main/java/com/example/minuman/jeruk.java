package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jeruk extends AppCompatActivity {
    Button btnjeruk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeruk);
        btnjeruk =(Button) findViewById(R.id.btn_jrk);

        btnjeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnjeruk = new Intent(jeruk.this,Jeruk1.class);
                startActivity(pindahBtnjeruk);
            }
        });
    }
}