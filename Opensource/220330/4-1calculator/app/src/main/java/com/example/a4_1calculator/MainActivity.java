package com.example.a4_1calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Edit1;
    EditText Edit2;

    Button btnadd;
    Button btnsub;
    Button btnmul;
    Button btndiv;

    TextView textResult;

    String num1,num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        setTitle("초간단 계산기");

        Edit1 = (EditText)findViewById(R.id.Edit1);
        Edit2 = (EditText)findViewById(R.id.Edit2);

        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndiv = (Button)findViewById(R.id.btndiv);

        textResult = (TextView)findViewById(R.id.result);

        btnadd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= Edit1.getText().toString();
                num2= Edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과:"+result.toString());
                return false;
            }
        });

        btnsub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= Edit1.getText().toString();
                num2= Edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과:"+result.toString());
                return false;
            }
        });

        btnmul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= Edit1.getText().toString();
                num2= Edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과:"+result.toString());
                return false;
            }
        });

        btndiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= Edit1.getText().toString();
                num2= Edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과:"+result.toString());
                return false;
            }
        });





    }
}