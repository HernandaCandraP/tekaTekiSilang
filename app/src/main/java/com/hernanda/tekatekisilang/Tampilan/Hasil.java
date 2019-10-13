package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.model.*;

import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_1;
import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_2;
import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_3;
import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_4;

public class Hasil extends AppCompatActivity {
    TextView edit11,edit12,edit13,edit14,edit15,edit16,edit17,edit18;
    TextView edit21, edit22, edit23, edit24;
    TextView edit31, edit32, edit33, edit34, edit35, edit36;
    TextView edit41, edit42, edit43, edit44, edit45;
    TextView ket, ket2, ket3, ket4, hasil;
    String benar = "*Jawaban Benar";
    String salah = "*Jawaban Salah";
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = (this.score) + score*25;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        ket = findViewById(R.id.ket);
        ket2 = findViewById(R.id.ket2);
        ket3 = findViewById(R.id.ket3);
        ket4 = findViewById(R.id.ket4);
        hasil = findViewById(R.id.score);

        edit11 = findViewById(R.id.edit11);
        edit12 = findViewById(R.id.edit12);
        edit13 = findViewById(R.id.edit13);
        edit14 = findViewById(R.id.edit14);
        edit15 = findViewById(R.id.edit15);
        edit16 = findViewById(R.id.edit16);
        edit17 = findViewById(R.id.edit17);
        edit18 = findViewById(R.id.edit18);

        edit21 = findViewById(R.id.edit21);
        edit22 = findViewById(R.id.edit22);
        edit23 = findViewById(R.id.edit23);
        edit24 = findViewById(R.id.edit24);

        edit31 = findViewById(R.id.edit31);
        edit32 = findViewById(R.id.edit32);
        edit33 = findViewById(R.id.edit33);
        edit34 = findViewById(R.id.edit34);
        edit35 = findViewById(R.id.edit35);
        edit36 = findViewById(R.id.edit36);

        edit41 = findViewById(R.id.edit41);
        edit42 = findViewById(R.id.edit42);
        edit43 = findViewById(R.id.edit43);
        edit44 = findViewById(R.id.edit44);
        edit45 = findViewById(R.id.edit45);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawaban j = extras.getParcelable(SOAL_1);
            jawaban2 j2 = extras.getParcelable(SOAL_2);
            jawaban3 j3 = extras.getParcelable(SOAL_3);
            jawaban4 j4 = extras.getParcelable(SOAL_4);

            String soal11 = j.getSoal11().toUpperCase();
            String soal12 = j.getSoal12().toUpperCase();
            String soal13 = j.getSoal13().toUpperCase();
            String soal14 = j.getSoal14().toUpperCase();
            String soal15 = j.getSoal15().toUpperCase();
            String soal16 = j.getSoal16().toUpperCase();
            String soal17 = j.getSoal17().toUpperCase();
            String soal18 = j.getSoal18().toUpperCase();

            String soal21 = j2.getSoal21().toUpperCase();
            String soal23 = j2.getSoal23().toUpperCase();
            String soal24 = j2.getSoal24().toUpperCase();

            String soal32 = j3.getSoal32().toUpperCase();
            String soal33 = j3.getSoal33().toUpperCase();
            String soal34 = j3.getSoal34().toUpperCase();
            String soal35 = j3.getSoal35().toUpperCase();
            String soal36 = j3.getSoal36().toUpperCase();

            String soal41 = j4.getSoal41().toUpperCase();
            String soal43 = j4.getSoal43().toUpperCase();
            String soal44 = j4.getSoal44().toUpperCase();
            String soal45 = j4.getSoal45().toUpperCase();


            if (soal11.equals("D") && soal12.equals("A")&& soal13.equals("T")&& soal14.equals("A")&& soal15.equals("B")&& soal16.equals("A")&& soal17.equals("S")&& soal18.equals("E")){
                this.ket.setText(benar);
                setScore(1);
            }
            else{
                this.ket.setText(salah);
                this.ket.setTextColor(Color.RED);
            }
            if(soal21.equals("J") && soal14.equals("A") && soal23.equals("V") && soal24.equals("A")){
                this.ket2.setText(benar);
                setScore(1);
            }else {
                this.ket2.setText(salah);
                this.ket2.setTextColor(Color.RED);
            }
            if(soal17.equals("S")&&soal32.equals("T") && soal33.equals("R") && soal34.equals("I") && soal35.equals("N") && soal36.equals("G")){
                this.ket3.setText(benar);
                setScore(1);
            }else {
                this.ket3.setText(salah);
                this.ket3.setTextColor(Color.RED);

            }
            if(soal41.equals("A") && soal36.equals("G") && soal43.equals("I") && soal44.equals("L")&& soal45.equals("E")){
                this.ket4.setText(benar);
                setScore(1);
            }else {
                this.ket4.setText(salah);
                this.ket4.setTextColor(Color.RED);

            }

            if (getScore() < 0){
                setScore(0);
                this.hasil.setText(String.valueOf(getScore()));
            }else {
                this.hasil.setText(String.valueOf(getScore()));
            }

            this.edit11.setText(soal11);
            this.edit12.setText(soal12);
            this.edit13.setText(soal13);
            this.edit14.setText(soal14);
            this.edit15.setText(soal15);
            this.edit16.setText(soal16);
            this.edit17.setText(soal17);
            this.edit18.setText(soal18);

            this.edit21.setText(soal21);
            this.edit22.setText(soal14);
            this.edit23.setText(soal23);
            this.edit24.setText(soal24);

            this.edit31.setText(soal17);
            this.edit32.setText(soal32);
            this.edit33.setText(soal33);
            this.edit34.setText(soal34);
            this.edit35.setText(soal35);
            this.edit36.setText(soal36);

            this.edit41.setText(soal41);
            this.edit42.setText(soal36);
            this.edit43.setText(soal43);
            this.edit44.setText(soal44);
            this.edit45.setText(soal45);


        }
    }

    public void handlehome(View view) {
        Intent intent = new Intent(this, Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
