package com.example.son.lab5tkgd;

import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai2 extends AppCompatActivity {
    private Button btnProgressDialog;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        btnProgressDialog = findViewById(R.id.btnProgressDialog);

        btnProgressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog progressDialog = new ProgressDialog(Bai2.this);

                CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
                    @Override
                    public void onTick(long l) {
                        progressDialog.setMessage("Loading..");
                        progressDialog.show();
                    }

                    @Override
                    public void onFinish() {
                        progressDialog.dismiss();
                    }
                };
                countDownTimer.start();

            }
        });

    }
}
