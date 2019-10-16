package com.hernanda.tekatekisilang.Tampilan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hernanda.tekatekisilang.R;

import static com.hernanda.tekatekisilang.Tampilan.Profil.NAME;
import static com.hernanda.tekatekisilang.Tampilan.Profil.PROFIL;

public class Home extends AppCompatActivity {

    private ImageView profil;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        profil = findViewById(R.id.profil);
        name = findViewById(R.id.name);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String getname = extras.getString(NAME);
            String getprofil = extras.getString(PROFIL);
            this.name.setText(getname);
            this.profil.setImageURI(Uri.parse(getprofil));
        }
    }

    public void close(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Konfirmasi Keluar");
        alert.setIcon(R.drawable.tts);
        alert.setMessage("Apakah ingin keluar dari Game?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "see you", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alert.create().show();
    }
    public void exit(View view) {
        close();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        close();
    }

    public void play(View view) {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);

    }
    public void handleprofil(View view) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }

    public void handleabout(View view) {
        Intent intent = new Intent(this, ViewPager.class);
        startActivity(intent);
    }
}
