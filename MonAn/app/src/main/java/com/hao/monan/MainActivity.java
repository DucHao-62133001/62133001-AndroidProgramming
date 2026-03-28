package com.hao.monan;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

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

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<>(MonAn);
        dsMonAn.add(new MonAn("Món Thứ Nhất", 25000, "Mô tả món thứ nhất", R.drawable.m1));
        dsMonAn.add(new MonAn("Món Thứ Hai", 25000, "Mô tả món thứ hai", R.drawable.m2));
        dsMonAn.add(new MonAn("Món Thứ Ba", 25000, "Mô tả món thứ ba", R.drawable.m3));

    MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
    lvDSMonAn.setAdapter(adapter);

    lvDSMonAn.setOnItemClickListener(AdapterView<?> adapterView, View view, int i, long l) ->{
        MonAn monAnChon = dsMonAn.get(i);

            Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();

        };

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}