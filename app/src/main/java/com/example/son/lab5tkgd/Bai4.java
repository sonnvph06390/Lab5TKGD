package com.example.son.lab5tkgd;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai4 extends AppCompatActivity {
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        btnLogin=findViewById(R.id.btnLogin);
//        edUserName=findViewById(R.id.edUserName);
//        edPassword=findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Bai4.this);
                LayoutInflater inflater=Bai4.this.getLayoutInflater();
                View view1=inflater.inflate(R.layout.dialog44,null);
                builder.setView(view1);
                final EditText editText1=view1.findViewById(R.id.edUserName);
                final EditText editText2=view1.findViewById(R.id.edPassword);
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        String chuoi=edUserName.getText().toString();
//                        Toast.makeText(Bai4.this, "Ten tai khoan la"+chuoi, Toast.LENGTH_SHORT).show();
                        if (editText1.getText().toString().equals("abc") && editText2.getText().toString().equals("123")){
                            Toast.makeText(Bai4.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(Bai4.this, "Sai tai khoan hoac mat khau", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                builder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Bai4.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }
}
