package com.tdondjiwilfried.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newCat(View view) {
        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cat_pic_2);
        Log.i("Test", "Image was changed!");
    }
}
