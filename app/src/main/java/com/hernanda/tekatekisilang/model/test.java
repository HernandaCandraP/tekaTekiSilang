package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

public class test implements Parcelable{
    String[] jawaban1 = {"D","A","T","A","B","A","S","E"};
    String[] input1;

//    String [] jawaban1;

    public test(String[] jawaban1, String[] input1) {
        this.input1 = input1;
        this.jawaban1 = jawaban1;
    }

    public test(){

    }

    protected test(Parcel in) {
        jawaban1 = in.createStringArray();
        input1 = in.createStringArray();
    }

    public static final Creator<test> CREATOR = new Creator<test>() {
        @Override
        public test createFromParcel(Parcel in) {
            return new test(in);
        }

        @Override
        public test[] newArray(int size) {
            return new test[size];
        }
    };

    public String[] getJawaban1() {
        return jawaban1;
    }

    public void setJawaban1(String[] jawaban1) {
        this.jawaban1 = jawaban1;
    }

    public String[] getInput1() {
        return input1;
    }

    public void setInput1(String[] input1) {
        this.input1 = input1;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(jawaban1);
        parcel.writeStringArray(input1);
    }
}
