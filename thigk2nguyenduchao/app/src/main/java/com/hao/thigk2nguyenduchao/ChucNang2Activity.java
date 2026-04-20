package com.hao.thigk2nguyenduchao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {

    ListView listView;

    String[] data = {
            "Nha Trang",
            "TP Hồ Chí Minh",
            "Đà Nẵng",
            "Phú Yên",
            "Cần Thơ",
            "Gia Lai",
            "Lạng Sơn",
            "Cam Ranh",
            "Đà Lạt",
            "Nguyễn Đức Hào"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        data);

        listView.setAdapter(adapter);
    }
}