package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.hernanda.tekatekisilang.Fragment.Soal1Fragment;
import com.hernanda.tekatekisilang.Fragment.Soal2Fragment;
import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.model.jawaban;

public class Play extends AppCompatActivity {

    public static final String SOAL_1 = "soal1";
    jawaban j;
    EditText soal11, soal12, soal13, soal14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        soal11 = findViewById(R.id.soal11);
        soal12 = findViewById(R.id.soal12);
        soal13 = findViewById(R.id.soal13);
        soal14 = findViewById(R.id.soal14);
    }

    public void soal1(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal1Fragment soal1Fragment = (Soal1Fragment) getSupportFragmentManager().findFragmentByTag("SOAL1_FRAGMENT");
        if(soal1Fragment != null && soal1Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal1Fragment(), "SOAL1_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void soal2(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal2Fragment soal2_fragment = (Soal2Fragment) getSupportFragmentManager().findFragmentByTag("SOAL2_FRAGMENT");
        if(soal2_fragment != null && soal2_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal2Fragment(), "SOAL2_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void soal4(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal2Fragment soal2_fragment = (Soal2Fragment) getSupportFragmentManager().findFragmentByTag("SOAL2_FRAGMENT");
        if(soal2_fragment != null && soal2_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal2Fragment(), "SOAL2_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void soal3(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal1Fragment soal1Fragment = (Soal1Fragment) getSupportFragmentManager().findFragmentByTag("SOAL1_FRAGMENT");
        if(soal1Fragment != null && soal1Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal1Fragment(), "SOAL1_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlehasil(View view) {
        String soal_11 = soal11.getText().toString();
        String soal_12 = soal12.getText().toString();
        String soal_13 = soal13.getText().toString();
        String soal_14 = soal14.getText().toString();


        j = new jawaban(soal_11, soal_12, soal_13, soal_14);

        Intent intent = new Intent(this, Hasil.class);
        intent.putExtra(SOAL_1, j);
        startActivity(intent);
    }
}
