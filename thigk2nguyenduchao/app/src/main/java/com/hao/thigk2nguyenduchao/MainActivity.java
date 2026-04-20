package com.hao.thigk2nguyenduchao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4; //Khai bao

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChucNang1Activity.class)));

        btn2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChucNang2Activity.class)));

        btn3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChucNang3Activity.class)));

        btn4.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChucNang4Activity.class)));
    }
}