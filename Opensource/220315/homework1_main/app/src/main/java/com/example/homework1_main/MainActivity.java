package com.example.homework1_main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button button_text;
    Button button_hmpg;
    ImageView android;
    RadioGroup group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.apple);

        text = (EditText)findViewById(R.id.text);
        button_text = (Button)findViewById(R.id.button_text);
        button_hmpg = (Button)findViewById(R.id.button_hmpg);

        android = (ImageView)findViewById(R.id.android);
        group = (RadioGroup)findViewById(R.id.group);

        button_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),text.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        button_hmpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(text.getText().toString()));
                startActivity(intent);

            }
        });

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.button_1){
                    android.setImageResource(R.drawable.android);
                }else if(i == R.id.button_2){
                    android.setImageResource(R.drawable.apple);
                }

            }
        });




    }
}