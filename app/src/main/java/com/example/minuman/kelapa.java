package com.example.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kelapa extends AppCompatActivity {
    Button btnkelapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelapa);
        btnkelapa=(Button) findViewById(R.id.btn_klp);

        btnkelapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnkelapa = new Intent(kelapa.this,Kelapa1.class);
                startActivity(pindahBtnkelapa);
            }
        });
    }
}