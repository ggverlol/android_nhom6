package com.example.android_nhom6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MHChaoAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhchao);

        Intent intent = new Intent(MHChaoAct.this, DangNhapAct.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        timer.start();
    }
}