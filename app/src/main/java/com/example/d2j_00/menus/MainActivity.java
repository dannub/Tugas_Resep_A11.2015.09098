package com.example.d2j_00.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[];
    int img []={R.drawable.ayam,R.drawable.ayamkecap,R.drawable.sweke};

    MyAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RecyclerView)findViewById(R.id.Recycle);

        s1=getResources().getStringArray(R.array.nama);
        s2=getResources().getStringArray(R.array.nim);

        ad=new MyAdapter(this,s1,s2,img);

        r1.setLayoutManager(new LinearLayoutManager(this));
        r1.setAdapter(ad);
    }
}
