package com.example.rhrony.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button bus, train, air, bike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edt);
        textView = (TextView) findViewById(R.id.show);
        bus = (Button) findViewById(R.id.bus);
        train = (Button) findViewById(R.id.train);
        air = (Button) findViewById(R.id.air);
        bike = (Button) findViewById(R.id.bike);

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = editText.getText().toString();
                int km = Integer.parseInt(str);

                int busrent = 5;

                int totalrent = km * 5;

                String showMessage = "Total rent" +" "+String.valueOf(totalrent)+"TK";
                textView.setText(showMessage);
            }
        });

        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = editText.getText().toString();
                int km = Integer.parseInt(str);

                int busrent = 2;

                int totalrent = km * 2;

                String showMessage = "Total rent" +" "+String.valueOf(totalrent)+"TK";
                textView.setText(showMessage);
            }
        });
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = editText.getText().toString();
                int km = Integer.parseInt(str);

                int busrent = 200;

                int totalrent = km * 200;

                String showMessage = "Total rent" +" "+String.valueOf(totalrent)+"TK";
                textView.setText(showMessage);
            }
        });
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = editText.getText().toString();
                int km = Integer.parseInt(str);

                int busrent = 5;

                int totalrent = km * 5;

                String showMessage = "Total rent" +" "+String.valueOf(totalrent)+"TK";
                textView.setText(showMessage);
            }
        });

    }




}
