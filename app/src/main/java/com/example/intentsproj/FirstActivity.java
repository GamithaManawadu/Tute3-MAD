package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText edit1;
    EditText edit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        OnClickButtonLister();
        edit1 = findViewById(R.id.num1);
        edit2 = findViewById(R.id.num2);
    }

    public void OnClickButtonLister(){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = getApplicationContext();
                    CharSequence message = "Loading";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, message, duration);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,-20);
                    toast.show();
                    Intent intent = new Intent(FirstActivity.this , SecondActivity.class);
                    intent.putExtra("n1",edit1.getText().toString());
                    intent.putExtra("n2",edit2.getText().toString());

                    startActivity(intent);

                }
            }
        );
    }
}