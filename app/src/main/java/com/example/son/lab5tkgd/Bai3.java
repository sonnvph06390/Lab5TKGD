package com.example.son.lab5tkgd;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bai3 extends AppCompatActivity {
    public Button btnAlert1;
    public Button btnAlert2;
    public Button btnAlert3;
    public Button btnAlert4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        btnAlert1 = findViewById(R.id.btnAlert1);
        btnAlert2 = findViewById(R.id.btnAlert2);
        btnAlert3 = findViewById(R.id.btnAlert3);
        btnAlert4 = findViewById(R.id.btnAlert4);

        btnAlert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Bai3.this);
                builder.setTitle("Tieu de Dialog");
                builder.setMessage("Hello world");
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
        btnAlert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Bai3.this);
                builder.setTitle("Chon mau");
                LayoutInflater inflater=Bai3.this.getLayoutInflater();
                View view1=inflater.inflate(R.layout.dialog2,null);
                builder.setView(view1);
                builder.show();
            }
        });
        btnAlert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Bai3.this);
                builder.setTitle("Chon mau");
                LayoutInflater inflater=Bai3.this.getLayoutInflater();
                View view3=inflater.inflate(R.layout.dialog3,null);
                builder.setView(view3);
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
        btnAlert4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Bai3.this);
                builder.setTitle("Chon mau");
                LayoutInflater inflater=Bai3.this.getLayoutInflater();
                View view4=inflater.inflate(R.layout.dialog4, null);
                builder.setView(view4);
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai3.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

    }
}
