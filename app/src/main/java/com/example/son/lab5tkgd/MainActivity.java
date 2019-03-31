package com.example.son.lab5tkgd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bai1(View view) {
        Intent intent=new Intent(MainActivity.this,Bai1.class);
        startActivity(intent);
    }

    public void Bai2(View view) {
        Intent intent=new Intent(MainActivity.this,Bai2.class);
        startActivity(intent);
    }

    public void Bai3(View view) {
        Intent intent=new Intent(MainActivity.this,Bai3.class);
        startActivity(intent);
    }

    public void Bai4(View view) {
        Intent intent=new Intent(MainActivity.this,Bai4.class);
        startActivity(intent);
    }
}
