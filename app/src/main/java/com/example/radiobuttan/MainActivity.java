package com.example.radiobuttan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Switch mSwitch;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
      l=findViewById(R.id.linearlayout);
        mSwitch = findViewById(R.id.switch1);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mSwitch.isChecked()) {
                    l.setBackgroundColor(Color.GREEN);
                    textView.setText("ON_switch");
                }
                else
                {
                  l.setBackgroundColor(Color.RED);

                    textView.setText("OFF_switch");
                }

            }
        });
    }
}