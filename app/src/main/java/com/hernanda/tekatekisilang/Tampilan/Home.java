package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.Tampilan.Profil;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void exit(View view) {
        finish();
    }

    public void play(View view) {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);

    }
    public void profil(View view) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }
}
