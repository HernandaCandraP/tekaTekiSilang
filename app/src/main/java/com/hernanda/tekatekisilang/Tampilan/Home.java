package com.hernanda.tekatekisilang.Tampilan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hernanda.tekatekisilang.R;

import java.io.IOException;

import static com.hernanda.tekatekisilang.Tampilan.Profil.NAME;

public class Home extends AppCompatActivity {

    private static final String TAG = Home.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;
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
            this.name.setText(getname);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_CANCELED) {
            return;
        }

        if (requestCode == GALLERY_REQUEST_CODE) {
            if (data != null) {
                try {
                    Uri imageUri = data.getData();
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                    profil.setImageBitmap(bitmap);
                } catch (IOException e) {
                    Toast.makeText(this, "Can't load image", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }
            }
        }
    }

    public void exit(View view) {
        finish();
    }

    public void play(View view) {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);

    }
    public void handleprofil(View view) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }

    public void changeprofil(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }
}
