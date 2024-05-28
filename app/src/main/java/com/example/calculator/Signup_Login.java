package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_login);

        Button btn1 = (Button) findViewById(R.id.btnlogin);
        Button btn2 = (Button) findViewById(R.id.btnsignup);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent obj= new Intent(getApplicationContext(),Login.class);

                    startActivity(obj);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e+"",Toast.LENGTH_LONG).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent obj= new Intent(getApplicationContext(),Register.class);

                    startActivity(obj);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e+"",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}