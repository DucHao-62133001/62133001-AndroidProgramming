package com.hao.thigk2nguyenduchao;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;
import java.util.*;

public class ChucNang3Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DiaDiem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        list.add(new DiaDiem("Hòn Mun", "Nha Trang", R.drawable.honmun));
        list.add(new DiaDiem("Vinpearl", "Nha Trang", R.drawable.vinpearl));
        list.add(new DiaDiem("Tháp Bà", "Nha Trang", R.drawable.thapba));
        list.add(new DiaDiem("Dốc Lêt", "Nha Trang", R.drawable.doclet));
        list.add(new DiaDiem("Hòn Tằm", "Nha Trang", R.drawable.hontam));

        DiaDiemAdapter adapter = new DiaDiemAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}