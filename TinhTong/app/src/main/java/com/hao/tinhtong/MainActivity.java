package com.hao.tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // khai bao cac bien giao dien
    EditText edtA, edtB, edtKQ;
    Button btnCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // lien ket bien java voi id trong file XML
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btnCong = findViewById(R.id.btnCong);

        // xu ly khi bam nut tinh tong
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lay du lieu nguoi dung nhap
                String soA = edtA.getText().toString();
                String soB = edtB.getText().toString();

                // chuyen sang so
                int a = Integer.parseInt(soA);
                int b = Integer.parseInt(soB);

                // tinh tong
                int tong = a + b;

                // hien thi ket qua
                edtKQ.setText(String.valueOf(tong));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}