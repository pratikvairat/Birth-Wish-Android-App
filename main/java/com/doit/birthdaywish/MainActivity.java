package com.doit.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Name= (EditText) findViewById(R.id.name);
        Button btn= (Button)  findViewById(R.id.wishMe);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,wishActivity.class);
            String personName=(Name.getText()).toString();
            i.putExtra("Name",personName);
            startActivity(i);
        });

    }
}