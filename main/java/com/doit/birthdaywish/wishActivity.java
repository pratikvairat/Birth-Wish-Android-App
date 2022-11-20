package com.doit.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class wishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);
        TextView personName=(TextView) findViewById(R.id.personName);
        ImageView img=(ImageView) findViewById(R.id.wishImg);
        Bundle bundle=getIntent().getExtras();
        String Name=bundle.getString("Name");
        personName.setText(Name);
        Random rad=new Random();
        int n=rad.nextInt(11);
        switch (n){
            case 0:
                img.setImageResource(R.drawable.wishbd);
                break;
            case 1:
                img.setImageResource(R.drawable.wishbd_1);
                break;
            case 2:
                img.setImageResource(R.drawable.wishbd_2);
                break;
            case 3:
                img.setImageResource(R.drawable.wishbd_3);
                break;
            case 4:
                img.setImageResource(R.drawable.wishbd_4);
                break;
            case 5:
                img.setImageResource(R.drawable.wishbd_5);
                break;
            case 6:
                img.setImageResource(R.drawable.wishbd_6);
                break;
            case 7:
                img.setImageResource(R.drawable.wishbd_7);
                break;
            case 8:
                img.setImageResource(R.drawable.wishbd_8);
                break;
            case 9:
                img.setImageResource(R.drawable.wishbd_9);
                break;
            default:
                img.setImageResource(R.drawable.wishbd_10);
                break;
        }

    }
}