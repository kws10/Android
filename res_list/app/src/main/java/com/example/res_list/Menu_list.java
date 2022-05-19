package com.example.res_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ListView;


import java.util.ArrayList;

public class Menu_list extends AppCompatActivity  {
    // 식당 리스트 생성
    public static ArrayList <Res_class> res_list = new ArrayList<Res_class>();

    Res_class selectedRestaurant;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        getSelectedRestaurant();

        setUpList();

    }


    //리스트 셋업
    private void setUpList(){
        listView = findViewById(R.id.menu_listView);

        //어댑터를 통하여
        Menu_Adapter adapter = new Menu_Adapter(getApplicationContext(), 0 , selectedRestaurant.getMenu_list());
        listView.setAdapter(adapter);
    }


    private void getSelectedRestaurant() {

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        selectedRestaurant = Restaurant.res_list.get(Integer.valueOf(id));
    }

}