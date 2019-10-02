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
import com.hernanda.tekatekisilang.model.input;
import com.hernanda.tekatekisilang.model.jawaban;
import com.hernanda.tekatekisilang.model.jawaban2;
import com.hernanda.tekatekisilang.model.test;

import java.util.ArrayList;
import java.util.List;

public class Play extends AppCompatActivity {

    public static final String SOAL_1 = "soal1";
    public static final String SOAL_2 = "soal2";
    jawaban j;
    jawaban2 j2;
    test t;

    EditText edit11,edit12,edit13,edit14,edit15,edit16,edit17,edit18;
    EditText edit21, edit23, edit24;

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

//        t = new test();
//        for(int counter = 0; counter < t.getJawaban1().length; counter++){
//            System.out.println(t.getJawaban1()[counter]);
//        }


//        j = new jawaban(soal_11, soal_12, soal_13, soal_14);

//        input i = new input();
//        List<String> nama = new ArrayList<>();
//        nama.add("Wildan");
//        nama.add("Adibil");
//        nama.add("Taufan");
//
//        i.setInput1(nama);


        j = new jawaban(edit_11, edit_12, edit_13, edit_14, edit_15, edit_16, edit_17, edit_18);
        j2 = new jawaban2(edit_21, edit_23, edit_24);

        Intent intent = new Intent(this, Hasil.class);
        intent.putExtra(SOAL_1, j);
        intent.putExtra(SOAL_2, j2);
        startActivity(intent);



//        System.out.println(i.getMahasiswa().get(0));
//        System.out.println(i.getMahasiswa().get(1));
//        System.out.println(i.getMahasiswa().get(2));
    }
}
