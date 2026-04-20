package com.hao.thigk2nguyenduchao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1Activity extends AppCompatActivity {

    EditText edDai, edRong;
    Button btnTinh;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang1);

        edDai = findViewById(R.id.edDai);
        edRong = findViewById(R.id.edRong);
        btnTinh = findViewById(R.id.btnTinh);
        tvKQ = findViewById(R.id.tvKQ);

        btnTinh.setOnClickListener(v -> {
            double dai = Double.parseDouble(edDai.getText().toString());
            double rong = Double.parseDouble(edRong.getText().toString());

            double chuVi = (dai + rong) * 2;
            double dienTich = dai * rong;

            tvKQ.setText("Chu vi: " + chuVi + "\nDien tich: " + dienTich);
        });
    }
}