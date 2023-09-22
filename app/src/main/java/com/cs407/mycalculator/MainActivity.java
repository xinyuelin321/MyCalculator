package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        Log.i("INFO", "Button Pressed");
        EditText num1 =(EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());

        String result = "" + (a + b);
        goToActivity(result);
    }

    public void minus(View view){
        Log.i("INFO", "Button Pressed");
        EditText num1 =(EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());

        String result = "" + (a - b);
        goToActivity(result);
    }

    public void multiply(View view){
        Log.i("INFO", "Button Pressed");
        EditText num1 =(EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());

        String result = "" + (a * b);
        goToActivity(result);
    }

    public void divide(View view){
        Log.i("INFO", "Button Pressed");
        EditText num1 =(EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());

        double c = a/b;

        if(Double.isInfinite(c)){
            CharSequence text = "Inability to divide by 0.";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(this,text, duration).show();
        }else{
            String result = "" + c;
            goToActivity(result);

        }
    }

    private void goToActivity(String s) {
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}