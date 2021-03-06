package com.users.banner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ViewPager pager;
    BannerAdapter adapter;
    ArrayList<Status> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        loadcard();
        Toast.makeText(MainActivity.this, "abc message", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "dfg message", Toast.LENGTH_SHORT).show();
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void loadcard() {

        list = new ArrayList<>();
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
        list.add(new Status("ok", "done"));
adapter=new BannerAdapter(this,list);
pager.setAdapter(adapter);
pager.setPadding(100,0,100,0);

    }
}