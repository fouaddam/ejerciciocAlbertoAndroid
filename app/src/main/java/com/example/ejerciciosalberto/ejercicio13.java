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


    }

    private void AsociarComponents(){

        radioGroup=findViewById(R.id.radioGroupejer13);

        checkBox1=findViewById(R.id.checkBox1);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox2=findViewById(R.id.checkBox3);

        textViewResult=findViewById(R.id.textView3);



    }

    private void ControllerListenner(){

        radioGroup.setOnCheckedChangeListener(((radioGroup1, i) -> ActualizarTextView()));

        checkBox1.setOnCheckedChangeListener((checkBox1,k)->ActualizarTextView());
        checkBox2.setOnCheckedChangeListener((checkBox2,k)->ActualizarTextView());
        checkBox3.setOnCheckedChangeListener((checkBox3,k)->ActualizarTextView());
        checkBox4.setOnCheckedChangeListener((checkBox4,k)->ActualizarTextView());

    }

        private void ActualizarTextView() {

        int calorias=0;

        calorias+=checkBox1.isChecked()?100:0;
        calorias+=checkBox2.isChecked()?500:0;
        calorias+=checkBox3.isChecked()?1000:0;
        calorias+=checkBox4.isChecked()?2000:0;

        int min=0,max=0;


        switch (radioGroup.getCheckedRadioButtonId()){

            case R.id.radioButton1:min=0;max=1000;break;
            case R.id.radioButton2:min=1000;max=2000;break;
            case R.id.radioButton3:min=2000;max=6000;break;

        }


        String mensage="";

        mensage+=(calorias>=min&&calorias<max)?"OK":"Fatal";

        mensage+="te has enchufado %1$d calorias";

        mensage=String.format(mensage,calorias);

        this.textViewResult.setText(mensage);










        }

}