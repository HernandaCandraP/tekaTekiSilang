package com.hernanda.tekatekisilang.Tampilan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.hernanda.tekatekisilang.R;

import java.io.IOException;

public class Profil extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String PROFIL = "profil";

    private static final String TAG = Profil.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;
    private EditText name;
    private ImageView profil, fakeprofil;
    private Button buttonedit;
    String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        name = findViewById(R.id.name);
        fakeprofil = findViewById(R.id.fakeimg);
        profil = findViewById(R.id.img);
        profil.setImageResource(0);

        buttonedit = findViewById(R.id.buttonedit);
        buttonedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (profil.getDrawable() == null) {
                    Toast.makeText(Profil.this, "Input Foto Profil", Toast.LENGTH_LONG).show();
                }else if(name.length() == 0){
                    Toast.makeText(Profil.this, "Nama Belum Terisi", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(Profil.this, "Profil Berhasil Disimpan", Toast.LENGTH_LONG).show();

                    EditProfile();
                    finish();
                }
            }
        });
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
                    System.out.println(imageUri);
                    setImg(String.valueOf(imageUri));
                    fakeprofil.setImageResource(0);
                } catch (IOException e) {
                    Toast.makeText(this, "Can't load image", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }
            }
        }
    }

    public void EditProfile() {
        String name = this.name.getText().toString();

        Intent intent = new Intent(this, Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(NAME, name);
        intent.putExtra(PROFIL, getImg());
        startActivity(intent);
    }

    public void handleimg(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }
}
