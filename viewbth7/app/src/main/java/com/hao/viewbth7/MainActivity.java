package com.hao.viewbth7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVatLieu;
    ArrayList<String> ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // B1: tim ListView
        lvVatLieu = findViewById(R.id.lvVatLieu);

        // B2: tao du lieu
        ds = new ArrayList<>();
        ds.add("Xi mang");
        ds.add("Gach");
        ds.add("Da op lat");
        ds.add("Ong nhua");
        ds.add("Son chong tham");

        // B3: tao adapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                ds
        );

        // B4: gan adapter vao ListView
        lvVatLieu.setAdapter(adapter);
    }
}