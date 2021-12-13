package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jeruk1 extends AppCompatActivity {
    Button btnBackJeruk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeruk1);
        btnBackJeruk1 = (Button) findViewById(R.id.btn_jrk2);

        btnBackJeruk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnJeruk1 = new Intent(Jeruk1.this,MainActivity.class);
                startActivity(pindahBtnJeruk1);
            }
        });
    }
}