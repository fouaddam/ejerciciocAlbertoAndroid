package com.example.ejerciciosalberto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn12,bt13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn12=findViewById(R.id.btnejer12);
        bt13=findViewById(R.id.btneje13);

        FuncionButtones();
    }

    private void FuncionButtones() {

        btn12.setOnClickListener(view -> onclick12(view));
        bt13.setOnClickListener(view -> onclick13(view));

    }

            private void onclick12(View view) {
                Intent intent=new Intent(this,ejercicio12.class);
                startActivity(intent);

            }
            private void onclick13(View view) {
                Intent intent=new Intent(this,ejercicio13.class);
                startActivity(intent);

            }
}