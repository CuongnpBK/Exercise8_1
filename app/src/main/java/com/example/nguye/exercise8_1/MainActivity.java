package com.example.nguye.exercise8_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtA, txtB;
    private int a;
    private int b;
    private int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA = (EditText) findViewById(R.id.tvA);
        txtB = (EditText) findViewById(R.id.tvB);
    }

    public void xuLybutton(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void tinhTong(View view) {
        Intent intent_ = new Intent(MainActivity.this, Main2Activity.class);
        a = Integer.parseInt(txtA.getText().toString());
        b = Integer.parseInt(txtB.getText().toString());
        c = a + b;
        intent_.putExtra("TONG", c);
        intent_.putExtra("A", a);
        intent_.putExtra("B", b);
        startActivity(intent_);
    }
}
