package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawaban implements Parcelable {
    private String soal11, soal12, soal13, soal14;

    protected jawaban(Parcel in) {
        soal11 = in.readString();
        soal12 = in.readString();
        soal13 = in.readString();
        soal14 = in.readString();
    }

    public jawaban(String soal11, String soal12, String soal13, String soal14) {
        this.soal11 = soal11;
        this.soal12 = soal12;
        this.soal13 = soal13;
        this.soal14 = soal14;
    }

    public static final Creator<jawaban> CREATOR = new Creator<jawaban>() {
        @Override
        public jawaban createFromParcel(Parcel in) {
            return new jawaban(in);
        }

        @Override
        public jawaban[] newArray(int size) {
            return new jawaban[size];
        }
    };

    public String getSoal11() {
        return soal11;
    }

    public void setSoal11(String soal11) {
        this.soal11 = soal11;
    }

    public String getSoal12() {
        return soal12;
    }

    public void setSoal12(String soal12) {
        this.soal12 = soal12;
    }

    public String getSoal13() {
        return soal13;
    }

    public void setSoal13(String soal13) {
        this.soal13 = soal13;
    }

    public String getSoal14() {
        return soal14;
    }

    public void setSoal14(String soal14) {
        this.soal14 = soal14;
    }

    public jawaban() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal11);
        parcel.writeString(soal12);
        parcel.writeString(soal13);
        parcel.writeString(soal14);
    }
}
