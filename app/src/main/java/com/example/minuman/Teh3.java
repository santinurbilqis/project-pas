package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teh3 extends AppCompatActivity {
    Button btnBackTeh3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teh3);
        btnBackTeh3=(Button) findViewById(R.id.btn_th2);

        btnBackTeh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnTeh3 = new Intent(Teh3.this,MainActivity.class);
                startActivity(pindahBtnTeh3);
            }
        });
    }
}