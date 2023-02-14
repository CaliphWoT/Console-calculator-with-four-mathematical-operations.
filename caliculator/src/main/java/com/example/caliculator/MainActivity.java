package com.example.caliculator;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText etNum1;
    Button btnAdd;
    TextView tvResult;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String input = etNum1.getText().toString();
        float firstDigit = 0;
        float secondDigit = 0;
        String operator = " ";
        char foo = input.charAt(0);
        Character.isDigit(foo);
        char voo = input.charAt(2);
        Character.isDigit(voo);
        for (int i = 0; i < input.length(); i++) {
            char opo = input.charAt(i);
            if (!Character.isDigit(opo)) {
                firstDigit = Float.parseFloat(input.substring(0, i));
                operator = String.valueOf(input.charAt(i));
                secondDigit = Float.parseFloat(input.substring(i + 1));
                break;
            }
        }

        switch (operator) {
            case "+":
                tvResult.setText(String.valueOf(firstDigit + secondDigit));
                break;
            case "-":
                tvResult.setText(String.valueOf(firstDigit - secondDigit));
                break;
            case "*":
                tvResult.setText(String.valueOf(firstDigit * secondDigit));
                break;
            case "/":
                tvResult.setText(String.valueOf(firstDigit / secondDigit));
                break;

            default:
                tvResult.setText("Something wrong!");
                break;
        }

    }

}




