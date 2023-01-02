package com.example.finalidcardapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView dp;
    private final int CAMERA_REQ_CODE=100;
    //////////
    /*
    //for name
    EditText name;
    public static final String EXTRA_NAME="com.example.finalidcardapp.extra.NAME";
    //for registration number
    EditText reg;
    public static final String EXTRA_REG="com.example.finalidcardapp.extra.REG";
     */
    Button submitbtn;
    EditText nameinp,reginp,collegenameinp,collegecityinp,addressinp,bloodgrpinp,mobinp,branchinp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.mypic);
        Button btn=findViewById(R.id.camerabtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icamera =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(icamera,CAMERA_REQ_CODE);

            }
        });
        ///////

        nameinp=findViewById(R.id.name);
        reginp=findViewById(R.id.reg);
        collegenameinp=findViewById(R.id.college);
        collegecityinp=findViewById(R.id.collegecity);
        addressinp=findViewById(R.id.address);
        bloodgrpinp=findViewById(R.id.bloodgrp);
        mobinp=findViewById(R.id.mob);
        branchinp=findViewById(R.id.branch);




        submitbtn=findViewById(R.id.submitbtn);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameinp.getText().toString();
                String reg=reginp.getText().toString();
                String collegename=collegenameinp.getText().toString();
                String collegecity=collegecityinp.getText().toString();
                String address=addressinp.getText().toString();
                String bloodgrp=bloodgrpinp.getText().toString();
                String mob=mobinp.getText().toString();
                String branch=branchinp.getText().toString();

                Intent intent=new Intent(MainActivity.this,printid.class);
                intent.putExtra("name",name);
                intent.putExtra("reg",reg);
                intent.putExtra("collegename",collegename);
                intent.putExtra("collegecity",collegecity);
                intent.putExtra("address",address);
                intent.putExtra("bloodgrp",bloodgrp);
                intent.putExtra("mob",mob);
                intent.putExtra("branch",branch);

                startActivity(intent);
            }
        });

    }
    /*
    public void openActivity(View view){
        Toast.makeText(this, "Opening your ID card", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,printid.class);

        //1
        name=findViewById(R.id.name);
        String nametext=name.getText().toString();
        intent.putExtra(EXTRA_NAME,nametext);
        startActivity(intent);
        //

        //2
        Intent intent_reg=new Intent(this,printid.class);
        reg=findViewById(R.id.reg);
        String regtext=reg.getText().toString();
        intent_reg.putExtra(EXTRA_REG,regtext);
        //
        startActivity(intent_reg);
    }

     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode==RESULT_OK){
            if (requestCode==CAMERA_REQ_CODE){
                //for camera
                Bitmap img=(Bitmap)(data.getExtras().get("data"));
                dp.setImageBitmap(img);

            }
        }
    }
}