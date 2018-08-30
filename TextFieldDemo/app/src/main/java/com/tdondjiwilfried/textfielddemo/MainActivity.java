package com.tdondjiwilfried.textfielddemo;

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

    public void logInFunction(View view) {
        EditText userName = findViewById(R.id.userName);
        EditText password = findViewById(R.id.password);
        Log.i("Username", userName.getText().toString());
        Log.i("Password", password.getText().toString());
    }
}
