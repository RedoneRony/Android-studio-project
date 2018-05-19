package com.example.user.temperatureconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText1);
    }

    public void onClickButton (View view) {
        switch (view.getId()) {
            case R.id.button1 :
                RadioButton celsiusBtn = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitBtn = (RadioButton) findViewById(R.id.radio1);

                if (editText.getText().length() == 0) {
                    Toast.makeText(this, "Please inter some valid number ", Toast.LENGTH_LONG).show();
                    return;
                }

                float getValue = Float.parseFloat(editText.getText().toString());
                if (celsiusBtn.isChecked()) {
                    editText.setText(String.valueOf(String.valueOf(CFtC(getValue))));
                    celsiusBtn.setChecked(false);
                    fahrenheitBtn.setChecked(true);

                }else {
                    editText.setText(String.valueOf(CCtF(getValue)));
                    fahrenheitBtn.setChecked(false);
                    celsiusBtn.setChecked(true);

                }
            break;
        }
    }

    private float CFtC(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }
    private float CCtF(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }


}
