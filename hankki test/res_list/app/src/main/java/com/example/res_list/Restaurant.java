package com.example.res_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Locale;

public class Restaurant extends AppCompatActivity {

    public static ArrayList <Res_class> res_list = new ArrayList<Res_class>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_main);

        search_res();

        setUpdata();

        setUpList();

        setUpOnclickListener();
    }

    private void setUpdata(){

        Res_class budae = new Res_class("0","budae",R.drawable.ic_launcher_background);
        Res_class budae2 = new Res_class("1","sax",R.drawable.ic_launcher_background);
        res_list.add(budae);
        res_list.add(budae2);
    }

    private void setUpList(){
        listView = findViewById(R.id.res_listView);

        Res_Adapter adapter = new Res_Adapter(getApplicationContext(), 0 , res_list);
        listView.setAdapter(adapter);
    }

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