package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawaban2 implements Parcelable {
    private String soal21,soal23,soal24;

    public jawaban2(String soal21, String soal23, String soal24) {
        this.soal21 = soal21;
        this.soal23 = soal23;
        this.soal24 = soal24;
    }

    protected jawaban2(Parcel in) {
        soal21 = in.readString();
        soal23 = in.readString();
        soal24 = in.readString();
    }

    public static final Creator<jawaban2> CREATOR = new Creator<jawaban2>() {
        @Override
        public jawaban2 createFromParcel(Parcel in) {
            return new jawaban2(in);
        }

        @Override
        public jawaban2[] newArray(int size) {
            return new jawaban2[size];
        }
    };

    public String getSoal21() {
        return soal21;
    }

    public void setSoal21(String soal21) {
        this.soal21 = soal21;
    }

    public String getSoal23() {
        return soal23;
    }

    public void setSoal23(String soal23) {
        this.soal23 = soal23;
    }

    public String getSoal24() {
        return soal24;
    }

    public void setSoal24(String soal24) {
        this.soal24 = soal24;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal21);
        parcel.writeString(soal23);
        parcel.writeString(soal24);
    }
}
