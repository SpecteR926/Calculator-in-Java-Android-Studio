package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    int[] username = {1, 0, 0};

    String[] password = {"a","",""};
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent obj = getIntent();
        boolean res = obj.getBooleanExtra("3",false);
        Button btndb = (Button) findViewById(R.id.btndb);
        btndb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(getApplicationContext(),Signup_Login.class);
                startActivity(obj);
            }
        });


        if(res == true)
        {
            Regis();
        }
            try {
                Button btnlg = (Button) findViewById(R.id.btnnow);
                btnlg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText eti1 = (EditText) findViewById(R.id.etIdL);
                        EditText et2 = (EditText) findViewById(R.id.ettvpassL);
                        int a = Integer.parseInt(eti1.getText() + "");
                        String b = (et2.getText() + "");

                        for (int i = 0; i < username.length; i++) {
                            if (username[i] == a)

                            {
                                //Toast.makeText(getApplicationContext(), "username validated", Toast.LENGTH_LONG).show();
                                if (password[i].equals(b))
                                {
                                    Toast.makeText(getApplicationContext(), "Login Sucessfu11", Toast.LENGTH_LONG).show();
                                    Intent obj = new Intent(getApplicationContext(), Home.class);
                                    startActivity(obj);
                                    break;
                                }
                            }
                            else if(i+1 == username.length)
                            {
                                Toast.makeText(getApplicationContext(), "Wrong ID or assword", Toast.LENGTH_LONG).show();
                            }

                        }
                    }
                });
            }
            catch (Exception e)
            {
                Log.d("errun",e.getMessage());

            }

    }
    public void Regis() {

        Intent j = getIntent();
        int data = j.getIntExtra("1",500);
        String data2 = j.getStringExtra("2");;

        for (int i = 0; i < username.length; i++) {
            if (username[i] == 0)
            {
                username[i]=data;
                password[i]=data2;
                Toast.makeText(getApplicationContext(),"Regisration Sucessfull",Toast.LENGTH_SHORT).show();
               // Intent obj2= new Intent(getApplicationContext(),Signup_Login.class);

                // startActivity(obj2);
                break;
            }
            else if(i+1== username.length)
            {
                Toast.makeText(getApplicationContext(),"Regisration Full",Toast.LENGTH_SHORT).show();
                Intent obj3= new Intent(getApplicationContext(),Signup_Login.class);

                startActivity(obj3);
            }

        }

    }


}