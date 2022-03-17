package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>(); // 스트링 형태로 넣을것이다 리스트에 데이터를

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data); // 중간 다리 역할
        list.setAdapter(adapter); // 리스트에 다리역할 하는놈 연결

        data.add("이상호의 안드로이드");
        data.add("손흥민의 토트넘");
        data.add("사과");
        adapter.notifyDataSetChanged(); // 이거 해줘야 저장됨

    }


}