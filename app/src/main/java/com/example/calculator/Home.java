package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    int n1=0;
    int n2=0;
    String tem = "";
    boolean omul = false;
    boolean oadd = false;
    boolean osub = false;

    boolean odiv = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        TextView et1 = (TextView) findViewById(R.id.tvResults);
        Button btn9 = (Button) findViewById(R.id.button9);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn0 = (Button) findViewById(R.id.button0);
        Button btnAdd = (Button) findViewById(R.id.buttonadd);
        Button btnSub = (Button) findViewById(R.id.buttonsub);
        Button btnMul = (Button) findViewById(R.id.buttonmul);
        Button btndiv = (Button) findViewById(R.id.buttondiv);
        Button btnEq = (Button) findViewById(R.id.buttoneq);
        Button btnClear = (Button) findViewById(R.id.buttoncls);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(tem+btn0.getText()+"");
                tem = et1.getText()+"";

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn1.getText()+"");
                tem = et1.getText()+"";
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn2.getText()+"");
                tem = et1.getText()+"";
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn3.getText()+"");
                tem = et1.getText()+"";
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn4.getText()+"");
                tem = et1.getText()+"";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn5.getText()+"");
                tem = et1.getText()+"";
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn6.getText()+"");
                tem = et1.getText()+"";
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn7.getText()+"");
                tem = et1.getText()+"";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn8.getText());
                tem = et1.getText()+"";

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(tem+btn9.getText()+"");
                tem = et1.getText()+"";
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oadd = true;
                n1 = Integer.parseInt(et1.getText()+"");
                et1.setText("");
                tem = "";
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                osub = true;
                n1 = Integer.parseInt(et1.getText()+"");
                et1.setText("");
                tem = "";
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                omul = false;
                oadd = false;
                osub = false;
                et1.setText("");
                n1 = 0;
                n2 = 0;
                tem = "";
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                omul = true;
                n1 = Integer.parseInt(et1.getText()+"");
                et1.setText("");
                tem = "";


            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                odiv = true;
                n1 = Integer.parseInt(et1.getText()+"");
                et1.setText("");
                tem = "";


            }
        });
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    n2 = Integer.parseInt(et1.getText() + "");
                    if (omul == true) {
                        int sum = n1 * n2;
                        et1.setText(sum+"");
                    } else if (oadd == true) {
                        int sum = n1 + n2;
                        et1.setText(sum+"");

                    } else if (osub == true) {
                        int sum = n1 - n2;
                        et1.setText(sum+"");
                    }
                    else if (odiv == true) {
                        double sum = n1 / n2;
                        et1.setText(sum+"");
                    }
                    omul = false;
                    oadd = false;
                    osub = false;
                    n1 = 0;
                    n2 = 0;
                    tem = "";
                }
                catch(Exception e) {
                    Toast.makeText(getApplicationContext(),e+"",Toast.LENGTH_LONG).show();

                    String msg = (e+"");




                }

            }
        });

    }
}