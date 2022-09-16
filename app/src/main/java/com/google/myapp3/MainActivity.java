package com.google.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSend ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend=findViewById(R.id.button);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);

                String[] arrayName = new String[]{"Đà Nẵng", "Tam Kỳ", "Hồ Chí Minh", "Hà Nội"};
                SinhVien sinhVien = new SinhVien("Nguyễn Đức Tín","2050531200312");
                Bundle bundle =new Bundle();
                bundle.putString("chuoi","Bài tập 4");
                bundle.putString("Lop","20T3");
                bundle.putSerializable("doituong",sinhVien);

                intent.putExtra("dulieu",bundle);

                startActivity(intent);
            }
        });

    }
}