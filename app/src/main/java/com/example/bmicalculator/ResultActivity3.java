package com.example.bmicalculator;

import static java.lang.String.format;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity3 extends AppCompatActivity {
    TextView BMI,Ans;
    float bmi;
    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        getSupportActionBar().hide();
        BMI = findViewById(R.id.res);
        Ans = findViewById(R.id.Ans);

        float ans = getIntent().getFloatExtra("BMI",bmi);

        BMI.setText("" +String.format("%.2f",ans));

        if (ans < 18.5){
            Ans.setText("You are Underweight person, you want to do more exercise to become fit");
        }
        else if(ans > 18.5 && ans <= 24.9){
            Ans.setText("You are Healthy and Normal person, but you have to do exercise regularly");
        }
        else if (ans > 25.0 && ans <= 29.9){
            Ans.setText("You are Overweight person, you have to do exercise that reduces weight");
        }
        else if (ans > 30.0 && ans <= 34.9){
            Ans.setText("You are Obese class I person, you are more overweight, start doing weight reducing exercises daily");
        }
        else {
            Ans.setText("You are More Obese person, you are more overweight, start doing weight reducing exercises on daily basis");
        }
    }
}