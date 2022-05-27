package com.example.res_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Research extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3); //3개까지 caching

        fragmentadapter adapter = new fragmentadapter(getSupportFragmentManager(), 1);

        fragment1 fragment1 = new fragment1();
        adapter.addItem(fragment1);

        fragment2 fragment2 = new fragment2();
        adapter.addItem(fragment2);

        fragment3 fragment3 = new fragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);
    }

}
