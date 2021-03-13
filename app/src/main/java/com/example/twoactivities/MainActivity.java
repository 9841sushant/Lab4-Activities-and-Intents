package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button para1;
    private Button para2;
    private Button para3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        para1=findViewById(R.id.btn_1st);
        para2=findViewById(R.id.btn_2nd);
        para3=findViewById(R.id.btn_3rd);
        para1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title);
                String article = getResources().getString(R.string.article_pedro);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );

                startActivity(intent);
            }
        });
        para2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title1);
                String article = getResources().getString(R.string.article_messi);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );
                startActivity(intent);
            }
        });
        para3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title2);
                String article = getResources().getString(R.string.article_villa);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );
                startActivity(intent);
            }
        });
    }
}