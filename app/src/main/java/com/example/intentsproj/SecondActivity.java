package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    TextView txt;

    int n1;
    int n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edit1 =findViewById(R.id.num1);
        edit2=findViewById(R.id.num2);
        txt  =findViewById(R.id.txt);

        Intent intent = getIntent();

        String num1 = intent.getStringExtra("n1");
        String num2 = intent.getStringExtra("n2");

        edit1.setText(num1);
        edit2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public void add(View view){

        txt.setText(n1 + " + " +n2 +" = " +(n1+n2));


    }

    public void substract(View view){

        txt.setText(n1 + " - " +n2+ " = " +(n1-n2));

    }

    public void multiply(View view){

        txt.setText(n1 + " * " +n2+" = " +(n1*n2));

    }

    public void devide(View view){

        txt.setText(n1 + " / " +n2+" 2 "+" = " +(n1/n2));

    }
}