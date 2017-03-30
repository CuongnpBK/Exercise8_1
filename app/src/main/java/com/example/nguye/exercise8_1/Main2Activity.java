package com.example.nguye.exercise8_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvTong = (TextView) findViewById(R.id.tvTong);
        Intent in = getIntent();
        int tong = in.getIntExtra("TONG", 1);
        int hsA = in.getIntExtra("A", 0);
        int hsB = in.getIntExtra("B", 0);
        tvTong.setText("Tổng 2 số " + hsA + " và " + hsB + " là: " + tong);
    }

    public void xulyDuLieu(View view) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
