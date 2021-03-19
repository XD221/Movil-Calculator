package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

import com.example.calculadora.controller.Calculadora;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.letsGo);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent letsGo = new Intent(MainActivity.this, Calculadora.class);
                startActivity(letsGo);
            }
        });
    }
}