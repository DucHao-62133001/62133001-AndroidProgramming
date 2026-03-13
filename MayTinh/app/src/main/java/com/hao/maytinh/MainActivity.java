package com.hao.maytinh;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView txtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //lien ket file xml
        setContentView(R.layout.activity_main);
        //gan id voi bien
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        txtKQ = findViewById(R.id.txtKQ);

        //phep cong
        btnCong.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //input nhap
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());
                //ket uqa
                double kq = a + b;
                //ihien thi ket qua
                txtKQ.setText(formatResult(kq));
            }
        });

        //phep tru
        btnTru.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());
                double kq = a - b;
                txtKQ.setText(formatResult(kq));
            }
        });

        //phep nhan
        btnNhan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());
                double kq = a * b;
                txtKQ.setText(formatResult(kq));
            }
        });
        //phep chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());
                // kiem tra chia cho 0
                if (b == 0) {
                    txtKQ.setText("Khong chia duoc cho 0");
                } else {
                    double kq = a / b;
                    txtKQ.setText(formatResult(kq));
                }
            }
        });
    }

    //ham dinh dang ket qua
    String formatResult(double number) {

        if(number == (int) number){
            return String.valueOf((int) number);
        }
        return String.valueOf(number);
    }
}