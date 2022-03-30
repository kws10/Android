package com.example.a4_4android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch switch1;
    RadioGroup radioGroup;
    RadioButton oreo,pie,q;
    ImageView image;
    Button end,start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("안드로이드 사진보기");

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        switch1 = (Switch) findViewById(R.id.switch1);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        oreo = (RadioButton) findViewById(R.id.oreo);
        pie = (RadioButton) findViewById(R.id.pie);
        q = (RadioButton) findViewById(R.id.q);
        end = (Button) findViewById(R.id.end);
        start = (Button) findViewById(R.id.start);
        image = (ImageView) findViewById(R.id.image);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    end.setVisibility(View.VISIBLE);
                    start.setVisibility(View.VISIBLE);
                    image.setVisibility(View.VISIBLE);
                }

                else{
                    text2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    end.setVisibility(View.INVISIBLE);
                    start.setVisibility(View.INVISIBLE);
                    image.setVisibility(View.INVISIBLE);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(radioGroup.getCheckedRadioButtonId()){
                    case R.id.oreo:
                        image.setImageResource(R.drawable.oreo);
                        break;
                    case R.id.pie:
                        image.setImageResource(R.drawable.pie);
                        break;
                    case R.id.q:
                        image.setImageResource(R.drawable.q);
                        break;
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1.setChecked(false);
            }
        });

    }
}