package com.google.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtView =findViewById(R.id.textKetQua);
        // nhận dữ liệu từ  Intent
        Intent intent =getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");

        if(bundle !=null){
            String ten =bundle.getString("chuoi");
            String lop =bundle.getString("Lop","20T3");
//              String[] mang=bundle.getStringArray("arrayName");
            SinhVien sinhVien = (SinhVien) bundle.getSerializable("doituong");
            txtView.setText(ten +"\n" +lop +"\n"+sinhVien.getHoTen()+"\n"+sinhVien.getMSV());
        }

    }
}