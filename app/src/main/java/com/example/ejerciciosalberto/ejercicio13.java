package com.example.ejerciciosalberto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Arrays;

public class ejercicio13 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2,radioButton3;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13);

            FunctionListenner();
    }

    private void FunctionListenner() {
        radioGroup=findViewById(R.id.radioGroupejer13);
        checkBox1=findViewById(R.id.checkBox1);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox2=findViewById(R.id.checkBox3);
        radioGroup.setOnCheckedChangeListener(((radioGroup, id) -> onAction(id)));
    }

    private void onAction(int id) {
        int [] cal={1000,2000};
        int calnum=0;
        switch (id){
            case R.id.RB1:Comprobacion(0,cal[0]);break;
            case R.id.RB2:Comprobacion(cal[0],cal[1]);break;
            case R.id.RB3:Comprobacion(0,cal[1]);break;
        }

    }

    private void Comprobacion(int min, int max) {

        int sumCalorias=SumaCalorias();
        if(sumCalorias<min){

        }else if(sumCalorias>min && sumCalorias<max){

        }else {

        }


    }

    private int SumaCalorias() {
        int []calorias={100,500,1000,2000};
        int sumaCalorias=0;
        if(checkBox1.isChecked()&& checkBox2.isChecked()&&
                checkBox3.isChecked()&& checkBox4.isChecked()){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                sumaCalorias= Arrays.stream(calorias).sum();
            }

        }

        return sumaCalorias;
    }
}