package com.example.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  void convert(View view){
        EditText currencyamount = (EditText) findViewById(R.id.CurrencyeditText);
        Double amount = Double.parseDouble(currencyamount.getText().toString());
        Double convertedamount =amount * .014;
        Toast.makeText(MainActivity.this, convertedamount.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
