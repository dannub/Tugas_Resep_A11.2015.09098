package com.example.d2j_00.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        ImageView imageView = (ImageView) findViewById(R.id.gambar);
        TextView textView = (TextView) findViewById(R.id.keterangan);

        Intent intent = getIntent();

        imageView.setImageResource(intent.getIntExtra("gambar",0));
        textView.setText(intent.getStringExtra("keterangan"));

        getSupportActionBar().setTitle(intent.getStringExtra("judul"));
    }
}
