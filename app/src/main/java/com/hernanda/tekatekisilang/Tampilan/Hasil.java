package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.model.jawaban;
import com.hernanda.tekatekisilang.model.jawaban2;

import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_1;
import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_2;

public class Hasil extends AppCompatActivity {
    EditText edit11,edit12,edit13,edit14,edit15,edit16,edit17,edit18;
    EditText edit21, edit23, edit24;
    TextView ket, ket2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        ket = findViewById(R.id.ket);
        ket2 = findViewById(R.id.ket2);


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

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawaban j = extras.getParcelable(SOAL_1);
            jawaban2 j2 = extras.getParcelable(SOAL_2);

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



            if (soal11.equals("D") && soal12.equals("A")&& soal13.equals("T")&& soal14.equals("A")&& soal15.equals("B")&& soal16.equals("A")&& soal17.equals("S")&& soal18.equals("E")){
                this.ket.setText("yeay 1 mendatarbenar");
            }
            else{
                this.ket.setText("SALAHHHHAHH");
            }
            if(soal21.equals("J") && soal23.equals("V") && soal24.equals("A")){
                this.ket2.setText("yeayy 1 menurun benar");
            }else {
                this.ket2.setText("1 menurun salah");
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
            this.edit23.setText(soal23);
            this.edit24.setText(soal24);

        }
    }
}
