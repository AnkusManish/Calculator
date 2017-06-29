package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Myjava extends AppCompatActivity {
   private TextView screen;
    private String str1, str2, result, str, sign;
    private double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myjava);
        screen = (TextView) findViewById(R.id.textView4);


    }
    public void onClick(View v){
        Button button =(Button)v;
        str+=button.getText().toString();
        screen.setText(str);
        a=Double.parseDouble(str);
    }
    public void onClick1(View v){
        Button button =(Button)v;
        str+=button.getText().toString();
        screen.setText(str1);
        b=Double.parseDouble(str1);
    }
    public void onClickSigns(View v){
        Button button=(Button) v;
        sign=button.getText().toString();
        screen.setText(sign);
        str="";
    }
    public void calculate(View v){
        Button button=(Button)v;
        str2=screen.getText().toString();
        b=Double.parseDouble(str2);
        if(sign.equals("+")) {
            result = a + b + "";
        }
        else if(sign.equals("-")){
            result=a-b+"";
        }
        else if(sign.equals("*")){
            result=a*b+"";
        }
        else if(sign.equals("/")){
            result=a/b+"";
        }
        else{
            screen.setText("k");
        }
        screen.setText(result);
    }
}




