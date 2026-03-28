package com.hao.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ArrayList<String> dsTenTinhThanhVN;
        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thanh Hóa");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Cam Ranh");
        dsTenTinhThanhVN.add("Phú Yên");

        //Tao Adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        //Gan dieu khien hien thi LV
        //Tim
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSach);
        //gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //Lang nghe va xu ly su kien
        //Later


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}