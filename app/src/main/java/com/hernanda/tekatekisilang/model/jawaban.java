package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawaban implements Parcelable{
    private String soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18;

    public jawaban(String soal11, String soal12, String soal13, String soal14, String soal15, String soal16, String soal17, String soal18) {
        this.soal11 = soal11;
        this.soal12 = soal12;
        this.soal13 = soal13;
        this.soal14 = soal14;
        this.soal15 = soal15;
        this.soal16 = soal16;
        this.soal17 = soal17;
        this.soal18 = soal18;
    }

    protected jawaban(Parcel in) {
        soal11 = in.readString();
        soal12 = in.readString();
        soal13 = in.readString();
        soal14 = in.readString();
        soal15 = in.readString();
        soal16 = in.readString();
        soal17 = in.readString();
        soal18 = in.readString();
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

    public String getSoal15() {
        return soal15;
    }

    public void setSoal15(String soal15) {
        this.soal15 = soal15;
    }

    public String getSoal16() {
        return soal16;
    }

    public void setSoal16(String soal16) {
        this.soal16 = soal16;
    }

    public String getSoal17() {
        return soal17;
    }

    public void setSoal17(String soal17) {
        this.soal17 = soal17;
    }

    public String getSoal18() {
        return soal18;
    }

    public void setSoal18(String soal18) {
        this.soal18 = soal18;
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
        parcel.writeString(soal15);
        parcel.writeString(soal16);
        parcel.writeString(soal17);
        parcel.writeString(soal18);
    }
}
