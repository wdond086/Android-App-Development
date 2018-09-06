package com.tdondjiwilfried.demoapp;

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

    /**
     * Collects text from the text field and prints in the log.
     * @param view
     */
    public void logFunction(View view) {
        // Used to get information from the user. To access that info we use an EditText
        EditText logInfo = findViewById(R.id.logInfo);
        // To post a small message for a certain amount of time we use a Toast.
        // Toast's makeText function requires the context(The page where to display it)
        // the text to be displayed, and the length of display time.
        Toast.makeText(MainActivity.this, logInfo.getText().toString(), Toast.LENGTH_LONG).show();
        Log.i("Info", logInfo.getText().toString());
    }
}
