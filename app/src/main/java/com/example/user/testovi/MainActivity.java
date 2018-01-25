package com.example.user.testovi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button pitanjaTeorija;
    private Button pitanjaZnakovi;
    private Button pitanjaRaskrsnice;
    private Button testovi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pitanjaTeorija = (Button) findViewById(R.id.pitanja_teorija);
        pitanjaTeorija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        pitanjaZnakovi = (Button) findViewById(R.id.pitanja_znakovi);
        pitanjaZnakovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main22Activity.class);
                startActivity(intent);
            }
        });

        pitanjaRaskrsnice = (Button) findViewById(R.id.pitanja_raskrsnice);
        pitanjaRaskrsnice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main23Activity.class);
                startActivity(intent);
            }
        });
        testovi = (Button)findViewById(R.id.testovi);
        testovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestoviActivity.class);
                startActivity(intent);
            }
        });
    }
}
