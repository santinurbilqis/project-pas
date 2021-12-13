package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teh extends AppCompatActivity {
    Button btnteh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teh2);
        btnteh=(Button) findViewById(R.id.btn_th);

        btnteh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnteh = new Intent(teh.this,Teh3.class);
                startActivity(pindahBtnteh);

            }
        });
    }
}