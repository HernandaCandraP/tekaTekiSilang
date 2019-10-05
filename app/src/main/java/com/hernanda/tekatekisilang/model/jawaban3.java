package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawaban3 implements Parcelable {
    private String soal32,soal33,soal34, soal35, soal36;

    protected jawaban3(Parcel in) {
        soal32 = in.readString();
        soal33 = in.readString();
        soal34 = in.readString();
        soal35 = in.readString();
        soal36 = in.readString();
    }

    public static final Creator<jawaban3> CREATOR = new Creator<jawaban3>() {
        @Override
        public jawaban3 createFromParcel(Parcel in) {
            return new jawaban3(in);
        }

        @Override
        public jawaban3[] newArray(int size) {
            return new jawaban3[size];
        }
    };

    public String getSoal32() {
        return soal32;
    }

    public void setSoal32(String soal32) {
        this.soal32 = soal32;
    }

    public String getSoal33() {
        return soal33;
    }

    public void setSoal33(String soal33) {
        this.soal33 = soal33;
    }

    public String getSoal34() {
        return soal34;
    }

    public void setSoal34(String soal34) {
        this.soal34 = soal34;
    }

    public String getSoal35() {
        return soal35;
    }

    public void setSoal35(String soal35) {
        this.soal35 = soal35;
    }

    public String getSoal36() {
        return soal36;
    }

    public void setSoal36(String soal36) {
        this.soal36 = soal36;
    }

    public jawaban3(String soal32, String soal33, String soal34, String soal35, String soal36) {
        this.soal32 = soal32;
        this.soal33 = soal33;
        this.soal34 = soal34;
        this.soal35 = soal35;
        this.soal36 = soal36;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal32);
        parcel.writeString(soal33);
        parcel.writeString(soal34);
        parcel.writeString(soal35);
        parcel.writeString(soal36);
    }
}
