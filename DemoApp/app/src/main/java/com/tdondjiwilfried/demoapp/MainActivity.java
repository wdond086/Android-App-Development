package com.tdondjiwilfried.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Collects text from the text field and prints in the log.
     * @param view
     */
    public void logFunction(View view) {
        EditText logInfo = findViewById(R.id.logInfo);
        Log.i("Info", logInfo.getText().toString());
    }
}
