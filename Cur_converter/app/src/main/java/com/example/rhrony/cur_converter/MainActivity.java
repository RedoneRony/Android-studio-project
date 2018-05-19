package com.example.rhrony.cur_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {

    EditText input;
    Button convert;
    TextView textView;

    /* public void Convert(View view){
         EditText input=(EditText) findViewById(R.id.input);
         Double DollerAmount=Double.parseDouble(input.getText().toString());
         Double poundAmount=DollerAmount * 0.012;
         Toast.makeText(getApplicationContext(), "$" + poundAmount.toString() + "Dollar" ,Toast.LENGTH_LONG).show();
     }
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(EditText) findViewById(R.id.input);
        convert=(Button) findViewById(R.id.convert);
        textView=(TextView) findViewById(R.id.textView);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=input.getText().toString();
                int amount=Integer.parseInt(str);
                Double tk= amount * .012;
                String showMessage="The Dollar Amount is :$"+String.valueOf(tk);
                textView.setText(showMessage);


            }
        });




    }
}


