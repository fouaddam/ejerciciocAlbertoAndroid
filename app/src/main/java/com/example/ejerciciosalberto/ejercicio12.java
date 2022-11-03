package com.example.ejerciciosalberto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ejercicio12 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12);

        radioGroup=findViewById(R.id.radioGroup);
        editTextResult=findViewById(R.id.EditText1);
        FunctionRB();

    }

    private void FunctionRB() {

        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);

        radioGroup.setOnCheckedChangeListener(((radioGroup, id) -> onAction( radioGroup,id)));

    }

    private void onAction(RadioGroup radioGroup, int id) {

        String mensaje="holaa";

        switch (id){
            case R.id.radioButton1:mensaje="has escrito 1";break;
            case R.id.radioButton2:mensaje="has escrito 2";break;
            case R.id.radioButton3:mensaje="has escrito 3";break;
            case R.id.radioButton4:mensaje="has escrito 4";break;
        }

        editTextResult.setText(mensaje);

    }


}