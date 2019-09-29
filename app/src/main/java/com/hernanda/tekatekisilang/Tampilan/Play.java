package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.hernanda.tekatekisilang.Fragment.Soal1Fragment;
import com.hernanda.tekatekisilang.Fragment.Soal2Fragment;
import com.hernanda.tekatekisilang.R;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
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
}
