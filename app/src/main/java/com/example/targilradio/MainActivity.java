package com.example.targilradio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    LinearLayout sc;
    RadioButton r, g, b;
    boolean b1=false;
    Switch switch1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        r = (RadioButton) findViewById(R.id.r);
        g = (RadioButton) findViewById(R.id.g);
        b = (RadioButton) findViewById(R.id.b);
        switch1 = (Switch) findViewById(R.id.switch1);
        rg = (RadioGroup) findViewById(R.id.rg);
        sc=(LinearLayout)findViewById(R.id.sc);

    }

    public void clicked(View view) {
        b1=switch1.isChecked();
    }


    public void go(View view) {
        if (b1==true){
            sc.setBackgroundColor(Color.YELLOW);
        }
    }

    public void BLUE(View view) {
        if (b1 == false) sc.setBackgroundColor(Color.BLUE);
    }

    public void RED(View view) {
        if (b1 == false)sc.setBackgroundColor(Color.RED);
    }

    public void BLACK(View view) {
        if (b1 == false) sc.setBackgroundColor(Color.BLACK);
    }

    public void GREEN(View view) {
        if (b1 == false) sc.setBackgroundColor(Color.GREEN);
    }
}

