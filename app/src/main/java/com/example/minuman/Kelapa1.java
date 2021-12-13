package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kelapa1 extends AppCompatActivity {
    Button btnBackKelapa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelapa1);
        btnBackKelapa1=(Button) findViewById(R.id.btn_klp2);

        btnBackKelapa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnKelapa1 = new Intent(Kelapa1.this,MainActivity.class);
                startActivity(pindahBtnKelapa1);
            }
        });
    }
}