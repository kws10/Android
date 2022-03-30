package com.example.a4_5mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ImageView imgUp, imgDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnChange1);
        btn2 = findViewById(R.id.btnChange2);
        imgUp = findViewById(R.id.imgUp);
        imgDown = findViewById(R.id.imgDown);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUp.setImageResource(R.drawable.cat);
                imgDown.setImageResource(0);
                Toast.makeText(getApplicationContext(), "사진이 위로 이동했습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgDown.setImageResource(R.drawable.cat);
                imgUp.setImageResource(0);
                Toast.makeText(getApplicationContext(), "사진이 아래로 이동했습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}