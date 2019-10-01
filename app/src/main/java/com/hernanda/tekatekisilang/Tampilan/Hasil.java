package com.hernanda.tekatekisilang.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.hernanda.tekatekisilang.R;
import com.hernanda.tekatekisilang.model.jawaban;

import static com.hernanda.tekatekisilang.Tampilan.Play.SOAL_1;

public class Hasil extends AppCompatActivity {

    EditText soal11, soal12, soal13, soal14;
    TextView ket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        soal11 = findViewById(R.id.soal11);
        soal12 = findViewById(R.id.soal12);
        soal13 = findViewById(R.id.soal13);
        soal14 = findViewById(R.id.soal14);
        ket = findViewById(R.id.ket);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawaban j = extras.getParcelable(SOAL_1);

            String soal11 = j.getSoal11();
            String soal12 = j.getSoal12();
            String soal13 = j.getSoal13();
            String soal14 = j.getSoal14();

            if (soal11.equals("j")){
                this.ket.setText("yeay benar");
            }
            this.soal11.setText(soal11);
            this.soal12.setText(soal12);
            this.soal13.setText(soal13);
            this.soal14.setText(soal14);
        }
    }
}
