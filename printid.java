package com.example.finalidcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class printid extends AppCompatActivity {
    /*
    TextView printname;
    TextView printreg;
     */
    TextView printname,printreg,print_collegename,print_collegecity,print_address,print_bloodgrp,print_mob,print_branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printid);
        /*
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
         */

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String reg=intent.getStringExtra("reg");
        String collegename=intent.getStringExtra("collegename");
        String collegecity=intent.getStringExtra("collegecity");
        String address=intent.getStringExtra("address");
        String bloodgrp=intent.getStringExtra("bloodgrp");
        String mob=intent.getStringExtra("mob");
        String branch=intent.getStringExtra("branch");



        printname=findViewById(R.id.print_name);
        printreg=findViewById(R.id.print_reg);
        print_collegename=findViewById(R.id.print_collegename);
        print_collegecity=findViewById(R.id.print_collegecity);
        print_address=findViewById(R.id.print_address);
        print_bloodgrp=findViewById(R.id.print_bloodgrp);
        print_mob=findViewById(R.id.print_mob);
        print_branch=findViewById(R.id.print_branch);



        printname.setText("name: "+name);
        printreg.setText("registration number: "+reg);
        print_collegename.setText(collegename);
        print_collegecity.setText(collegecity);
        print_address.setText("address: "+address);
        print_bloodgrp.setText("bloodgrp: "+bloodgrp);
        print_mob.setText("mobile number: "+mob);
        print_branch.setText("branch: "+branch);


    }
}