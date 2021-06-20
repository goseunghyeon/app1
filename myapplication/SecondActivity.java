package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        Button btnbeach = (Button) findViewById(R.id.btnBeach);
        Button btndesert = (Button) findViewById(R.id.btnDesrt);
        Button btnforest = (Button) findViewById(R.id.btnForest);

        //되돌아가기
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        //사막버튼 클릭시
        btndesert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,
                        DesertActivity.class);
                startActivity(intent);
            }
        });

        //숲 버튼 클릭시
        btnforest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,
                        ForestActivity.class);
                startActivity(intent);
            }
        });

        //해변 버튼 클릭시
        btnbeach.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,
                        BeachActivity.class);
                startActivity(intent);
            }
        });

    }



}