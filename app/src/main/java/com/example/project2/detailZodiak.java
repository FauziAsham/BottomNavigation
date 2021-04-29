package com.example.project2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class detailZodiak extends AppCompatActivity {

    private TextView tvJudul, tvDetail;
    private ImageView photo;
    String judul;
    String detail;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_zodiak);

        tvJudul = findViewById(R.id.tv_zodiak_name);
        tvDetail = findViewById(R.id.tv_zodiak_detail);
        photo = findViewById(R.id.iv_zodiak);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Zodiak zodiak = getIntent().getParcelableExtra("ZODIAK_DETAIL");
        System.out.println(zodiak.getName());
        photo.setImageResource(image);
        tvJudul.setText(judul);
        tvDetail.setText(detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(zodiak.getName());
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
}