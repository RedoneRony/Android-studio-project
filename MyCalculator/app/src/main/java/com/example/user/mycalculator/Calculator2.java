package com.example.user.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class Calculator2 extends AppCompatActivity {

    TextView output;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,dot,btnPlus,btnMinus,btnMul,btnDiv,c,btnEqual,btnMod,btnRoot;
    double val1=0,val2=0;
    boolean add,sub,mul,div,mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        output= (TextView) findViewById(R.id.tvOutput);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btn0= (Button) findViewById(R.id.btn0);
        dot= (Button) findViewById(R.id.btnPoint);
        btnMod= (Button) findViewById(R.id.btnMod);
        btnRoot= (Button) findViewById(R.id.btnRoot);
        btnPlus= (Button) findViewById(R.id.btnPlus);
        btnMinus= (Button) findViewById(R.id.btnMinus);
        btnMul= (Button) findViewById(R.id.btnMul);
        btnDiv= (Button) findViewById(R.id.btnDiv);
        c= (Button) findViewById(R.id.btnC);
        btnEqual= (Button) findViewById(R.id.btnE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"0");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+".");
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    val1=Double.parseDouble(output.getText().toString());
                    output.setText(null);
                    mod=true;
                }catch (Exception e){}

            }
        });
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    val1=Double.parseDouble(output.getText().toString().trim());

                    output.setText(String.format("%.4f",sqrt(val1)));
                }catch (Exception e){}

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    val1=Double.parseDouble(output.getText().toString().trim());
                    output.setText(null);
                    add=true;
                }catch (Exception e){}
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    val1 = Double.parseDouble(output.getText().toString().trim());
                    output.setText(null);
                    sub = true;
                }catch (Exception e){}
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    val1=Double.parseDouble(output.getText().toString().trim());
                    output.setText(null);
                    div=true;
                }catch (Exception e){}
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    val1=Double.parseDouble(output.getText().toString().trim());
                    output.setText(null);
                    mul=true;
                }catch (Exception e){}
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    val2=Double.parseDouble(output.getText().toString().trim());
                    if (add ==true) {
                        output.setText(val1 + val2+"");
                        add =false;
                    }
                    if (sub ==true) {
                        output.setText(val1 - val2+"");
                        sub =false;
                    }
                    if (mul ==true) {
                        output.setText(val1 * val2+"");
                        mul =false;
                    }
                    if (div ==true) {
                        output.setText(String.format("%.4f",val1/val2));
                        div =false;
                    }
                    if (mod ==true) {
                        output.setText(val1 % val2+"");
                        mod =false;
                    }

                }catch (Exception e){}

            }

        });
    }
}