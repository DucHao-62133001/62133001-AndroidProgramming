package com.hao.inet_bth10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    // Hàm xử lý nút quay về
    public void QuayVe(View v) {
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }
}