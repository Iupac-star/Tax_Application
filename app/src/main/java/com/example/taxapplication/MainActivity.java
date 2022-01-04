package com.example.taxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText inputPrice;
    TextView stateTax, countryTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputPrice = findViewById(R.id.editPrice);
        stateTax = findViewById(R.id.stateTax);
        countryTax = findViewById(R.id.countryTax);


        inputPrice.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if(!inputPrice.getText().toString().isEmpty()){
            double userInput = Double.parseDouble(inputPrice.getText().toString());
            double state = userInput * 0.04;
            double country = userInput * 0.02;
            stateTax.setText(String.valueOf(state));
            countryTax.setText(String.valueOf(country));
        }
    }
}