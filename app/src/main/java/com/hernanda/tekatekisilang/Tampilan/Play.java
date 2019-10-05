package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hernanda.tekatekisilang.Fragment.*;
import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.model.jawaban;
import com.hernanda.tekatekisilang.model.jawaban2;
import com.hernanda.tekatekisilang.model.jawaban3;
import com.hernanda.tekatekisilang.model.jawaban4;

public class Play extends AppCompatActivity {

    public static final String SOAL_1 = "soal1";
    public static final String SOAL_2 = "soal2";
    public static final String SOAL_3 = "soal3";
    public static final String SOAL_4 = "soal4";
    jawaban j;
    jawaban2 j2;
    jawaban3 j3;
    jawaban4 j4;

    EditText edit11,edit13,edit14,edit15,edit16,edit17,edit18;
    EditText edit21, edit23, edit24;
    EditText edit32, edit33, edit34, edit35, edit36;
    EditText edit41, edit43, edit44, edit45;
    TextView edit12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        edit11 = findViewById(R.id.edit11);
        edit12 = findViewById(R.id.edit12);
        edit13 = findViewById(R.id.edit13);
        edit14 = findViewById(R.id.edit14);
        edit15 = findViewById(R.id.edit15);
        edit16 = findViewById(R.id.edit16);
        edit17 = findViewById(R.id.edit17);
        edit18 = findViewById(R.id.edit18);

        edit21 = findViewById(R.id.edit21);
        edit23 = findViewById(R.id.edit23);
        edit24 = findViewById(R.id.edit24);

        edit32 = findViewById(R.id.edit32);
        edit33 = findViewById(R.id.edit33);
        edit34 = findViewById(R.id.edit34);
        edit35 = findViewById(R.id.edit35);
        edit36 = findViewById(R.id.edit36);

        edit41 = findViewById(R.id.edit41);
        edit43 = findViewById(R.id.edit43);
        edit44 = findViewById(R.id.edit44);
        edit45 = findViewById(R.id.edit45);

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

    public void soal3(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal3Fragment soal3_fragment = (Soal3Fragment) getSupportFragmentManager().findFragmentByTag("SOAL3_FRAGMENT");
        if(soal3_fragment != null && soal3_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal3Fragment(), "SOAL3_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void soal4(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal4Fragment soal4_fragment = (Soal4Fragment) getSupportFragmentManager().findFragmentByTag("SOAL4_FRAGMENT");
        if(soal4_fragment != null && soal4_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal4Fragment(), "SOAL4_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlehasil(View view) {

        String edit_11 = edit11.getText().toString();
        String edit_12 = edit12.getText().toString();
        String edit_13 = edit13.getText().toString();
        String edit_14 = edit14.getText().toString();
        String edit_15 = edit15.getText().toString();
        String edit_16 = edit16.getText().toString();
        String edit_17 = edit17.getText().toString();
        String edit_18 = edit18.getText().toString();

        String edit_21 = edit21.getText().toString();
        String edit_23 = edit23.getText().toString();
        String edit_24 = edit24.getText().toString();

        String edit_32 = edit32.getText().toString();
        String edit_33 = edit33.getText().toString();
        String edit_34 = edit34.getText().toString();
        String edit_35 = edit35.getText().toString();
        String edit_36 = edit36.getText().toString();

        String edit_41 = edit41.getText().toString();
        String edit_43 = edit43.getText().toString();
        String edit_44 = edit44.getText().toString();
        String edit_45 = edit45.getText().toString();

        j = new jawaban(edit_11, edit_12, edit_13, edit_14, edit_15, edit_16, edit_17, edit_18);
        j2 = new jawaban2(edit_21, edit_23, edit_24);
        j3 = new jawaban3(edit_32, edit_33, edit_34, edit_35, edit_36);
        j4 = new jawaban4(edit_41, edit_43, edit_44, edit_45);

        Intent intent = new Intent(this, Hasil.class);
        intent.putExtra(SOAL_1, j);
        intent.putExtra(SOAL_2, j2);
        intent.putExtra(SOAL_3, j3);
        intent.putExtra(SOAL_4, j4);
        startActivity(intent);

    }
}
