package com.tdondjiwilfried.currencyconverter;

import android.support.v7.app.AppCompatActivity;
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

    public void convert(View view) {
        EditText dollarAmount = findViewById(R.id.amount);
        double dollarNumber = Double.parseDouble(dollarAmount.getText().toString());
        Toast.makeText(MainActivity.this, String.valueOf(dollarNumber*429.65) + " FRS CFA", Toast.LENGTH_LONG).show();
        Log.i("Test", "Conversion occurred!");
    }
}