package com.example.myapplication;

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
    Button btnrem;

    TextView textResult;

    String num1,num2;
    Float result;


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
        btnrem = (Button)findViewById(R.id.btnrem);

        textResult = (TextView)findViewById(R.id.result);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast mytoast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    mytoast.show();
                }

                else{
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산결과:"+result.toString());
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast mytoast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    mytoast.show();
                }

                else{
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산결괴:"+result.toString());
                }
            }
        });



        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast mytoast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    mytoast.show();
                }

                else{
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산결과:"+result.toString());
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast mytoast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    mytoast.show();
                }else if(Float.parseFloat(num2) == 0){
                    Toast.makeText(getApplicationContext(),"0으로는 나눌수 없습니다.",Toast.LENGTH_SHORT).show();
                }

                else{
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산결과:"+result.toString());
                }
            }
        });

        btnrem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast mytoast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    mytoast.show();
                }

                else{
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산결과:"+result.toString());
                }
            }
        });







    }
}