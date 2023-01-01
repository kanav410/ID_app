package com.example.finalidcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //for name
    EditText name;
    public static final String EXTRA_NAME="com.example.finalidcardapp.extra.NAME";
    //for registration number
    EditText reg;
    public static final String EXTRA_REG="com.example.finalidcardapp.extra.REG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
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
}
