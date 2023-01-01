package com.example.finalidcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class printid extends AppCompatActivity {
    TextView printname;
    TextView printreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printid);
        //printing name
        printname=findViewById(R.id.print_name);
        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.EXTRA_NAME);
        printname.setText("hi" + name);

        // printing reg number
        printreg=findViewById(R.id.print_reg);
        Intent intent_reg=getIntent();
        String reg=intent_reg.getStringExtra(MainActivity.EXTRA_REG);
        printreg.setText("hi" + reg);
    }
}