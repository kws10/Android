package com.example.res_list;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Res_Detail extends AppCompatActivity {

    Res_class selectedRestaurant;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_detail);

        getSelectedRestaurant();

        setValues();
    }

    private void setValues(){
        TextView tv = findViewById(R.id.res_detail_name);
        ImageView iv = findViewById(R.id.res_detail_img);

        tv.setText(selectedRestaurant.getRes_name());
        iv.setImageResource(selectedRestaurant.getRes_img());
    }

    private void getSelectedRestaurant(){

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        selectedRestaurant = Restaurant.res_list.get(Integer.valueOf(id));
    }


}