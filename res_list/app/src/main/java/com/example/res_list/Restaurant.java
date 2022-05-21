package com.example.res_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;


import java.util.ArrayList;

public class Restaurant extends AppCompatActivity  {
    // 식당 리스트 생성
    public static ArrayList <Res_class> res_list = new ArrayList<Res_class>();
    public static ArrayList <Menu_Class> budae_menu_list = new ArrayList<>();
    public static ArrayList <Menu_Class> lotte_menu_list = new ArrayList<>();

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_main);
        Button find_btn = findViewById(R.id.find_btn);


        User_Class user = new User_Class("id","1234","이상호",1,0);

        search_res();

        setUpdata();

        setUpList();

        setUpOnclickListener();

        find_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Res_class> filterRes = new ArrayList<>();
                for (int i = 0; i< res_list.size(); i++){
                    Res_class res = res_list.get(i);

                    if(res.getGenre() == user.getGenre() ) {
                        if(res.getSpicy() == user.getSpicy() )
                            filterRes.add(res);
                    }
                }



                Res_Adapter adapter = new Res_Adapter(getApplicationContext(),0,filterRes);
                listView.setAdapter(adapter);
            }
        });


    }

    // 식당 데이터 삽입 함수
    private void setUpdata(){

        Menu_Class budae_menu = new Menu_Class(1,"부대찌개",R.drawable.budae);
        Menu_Class budae_menu2 = new Menu_Class(1,"제육볶음",R.drawable.budae);
        budae_menu_list.add(budae_menu);
        budae_menu_list.add(budae_menu2);
        Res_class budae = new Res_class("0","부대통령 부대찌개",R.drawable.budae,37.541,126.986,1,0,budae_menu_list);
        res_list.add(budae);

        Menu_Class lotte_menu = new Menu_Class(1,"데리버거",R.drawable.budae);
        Menu_Class lotte_menu2 = new Menu_Class(1,"치즈버거",R.drawable.budae);
        lotte_menu_list.add(lotte_menu);
        lotte_menu_list.add(lotte_menu2);
        Res_class lotte = new Res_class("1","롯데리아",R.drawable.ic_launcher_background,37.6411,126.986,1,0,lotte_menu_list);
        res_list.add(lotte);


        User_Class user = new User_Class("id","1234","이상호",1,0);
    }

    //리스트 셋업
    private void setUpList(){
        listView = findViewById(R.id.res_listView);

        //어댑터를 통하여
        Res_Adapter adapter = new Res_Adapter(getApplicationContext(), 0 , res_list);
        listView.setAdapter(adapter);
    }

    //검색창 구현
    private void search_res(){
        SearchView searchView = findViewById(R.id.res_search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                ArrayList<Res_class> filterRes = new ArrayList<>();
                for (int i = 0; i< res_list.size(); i++){
                    Res_class res = res_list.get(i);

                    if(res.getRes_name().toLowerCase().contains(newText.toLowerCase())) {
                        filterRes.add(res);
                       }
                    }

                Res_Adapter adapter = new Res_Adapter(getApplicationContext(),0,filterRes);
                listView.setAdapter(adapter);
                return false;
            }
        });
    }

    //리스트의 아이템을 눌렀을때 식당 디테일 출력
    private void setUpOnclickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Res_class selectRestaurant = (Res_class) listView.getItemAtPosition(position);
                Intent showDetail = new Intent(getApplicationContext(), Res_Detail.class);
                showDetail.putExtra("id",selectRestaurant.getRes_id());
                startActivity(showDetail);
            }
        });
    }

}