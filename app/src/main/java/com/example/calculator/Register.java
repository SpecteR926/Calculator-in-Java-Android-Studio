package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnR = (Button) findViewById(R.id.buttonreggis);
        Button bt2 = (Button) findViewById(R.id.button12);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(getApplicationContext(),Signup_Login.class);
                startActivity(obj);
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.tvIdReg);
                EditText et2 = (EditText) findViewById(R.id.tvpassReg);
                Button btregis = (Button) findViewById(R.id.buttonreggis);
                int s1 = Integer.parseInt(et1.getText()+"");
                String s2 = (et2.getText()+"");
                boolean reg = true;
                Intent obj2= new Intent(getApplicationContext(),Login.class);
                obj2.putExtra("1",s1);
                obj2.putExtra("2",s2);
                obj2.putExtra("3",reg);
                startActivity(obj2);
            }
        });



    }
}