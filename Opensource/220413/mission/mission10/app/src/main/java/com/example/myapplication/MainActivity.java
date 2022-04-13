package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        //툴바와 네비게이션 뷰 연결
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //맨 처음은 메인프래그먼트로 시작

        getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        //중략..
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu1){
            toolbar.setTitle("첫 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        }
        else if(id == R.id.menu2){
            toolbar.setTitle("두 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
        }
        else if(id == R.id.menu3){
            toolbar.setTitle("세 번째 화면");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}