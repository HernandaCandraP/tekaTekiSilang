package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class jawaban4 implements Parcelable {
    private String soal41,soal43,soal44, soal45;

    public jawaban4(String soal41, String soal43, String soal44, String soal45) {
        this.soal41 = soal41;
        this.soal43 = soal43;
        this.soal44 = soal44;
        this.soal45 = soal45;
    }

    protected jawaban4(Parcel in) {
        soal41 = in.readString();
        soal43 = in.readString();
        soal44 = in.readString();
        soal45 = in.readString();
    }

    public static final Creator<jawaban4> CREATOR = new Creator<jawaban4>() {
        @Override
        public jawaban4 createFromParcel(Parcel in) {
            return new jawaban4(in);
        }

        @Override
        public jawaban4[] newArray(int size) {
            return new jawaban4[size];
        }
    };

    public String getSoal41() {
        return soal41;
    }

    public void setSoal41(String soal41) {
        this.soal41 = soal41;
    }

    public String getSoal43() {
        return soal43;
    }

    public void setSoal43(String soal43) {
        this.soal43 = soal43;
    }

    public String getSoal44() {
        return soal44;
    }

    public void setSoal44(String soal44) {
        this.soal44 = soal44;
    }

    public String getSoal45() {
        return soal45;
    }

    public void setSoal45(String soal45) {
        this.soal45 = soal45;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(soal41);
        parcel.writeString(soal43);
        parcel.writeString(soal44);
        parcel.writeString(soal45);
    }
}
