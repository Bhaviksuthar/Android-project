package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText height , weight;
    Button Calc, resetBtn;
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        Calc= findViewById(R.id.Calc);
        resetBtn = findViewById(R.id.ResetBtn);
//        textView = findViewById(R.id.textView2);
        Calc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                try {
                    float h, w;
                    h = Integer.parseInt(height.getText().toString());
                    w = Integer.parseInt(weight.getText().toString());
                    float bmi = (w/h/h)*10000;
                    // textView.setText(bmi+"");
                    if (height.getText().toString().isEmpty() && weight.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "First Enter value", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, ResultActivity3.class);
                        intent.putExtra("BMI", bmi);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "First Enter value", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height.setText(null);
                weight.setText(null);
            }
        });

    }
}