package com.hernanda.tekatekisilang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hernanda.tekatekisilang.Tampilan.Home;
import com.hernanda.tekatekisilang.Tampilan.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, ViewPager.class);
                startActivity(i);
                finish();
            }
        }, 1500);
    }
}
