package com.example.son.lab5tkgd;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;

public class Bai1 extends AppCompatActivity {
    private Button  btnTimePicker;
    private Button  btnDatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        btnDatePicker=findViewById(R.id.btnDatePicker);
        btnTimePicker=findViewById(R.id.btnTimePicker);

        showDatePicker();
        showTimePicker();


    }
    public  void showDatePicker(){
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                DatePickerDialog datePickerDialog=new DatePickerDialog(Bai1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        int i3=i1+1;
                        Toast.makeText(Bai1.this, ""+i+":"+i3+":"+i2, Toast.LENGTH_SHORT).show();
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
                datePickerDialog.show();
            }
        });

    }
    public  void showTimePicker(){
        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                TimePickerDialog timePickerDialog=new TimePickerDialog(Bai1.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        Toast.makeText(Bai1.this, ""+i+":"+i1, Toast.LENGTH_SHORT).show();
                    }
                },calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true);
                timePickerDialog.show();
            }
        });
    }
}
