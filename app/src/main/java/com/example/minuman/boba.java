package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class boba extends AppCompatActivity {
    Button btnboba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boba);
        btnboba = (Button) findViewById(R.id.btn_bb);

        btnboba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnboba = new Intent(boba.this,Boba1Activity.class);
                startActivity(pindahBtnboba);
            }
        });
    }
}