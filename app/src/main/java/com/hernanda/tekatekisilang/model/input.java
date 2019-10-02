package com.hernanda.tekatekisilang.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class input implements Parcelable {
    private List<String> jawaban1;
    private List<String> jawaban2;
    private List<String> jawaban3;
    private List<String> jawaban4;

    private List<String> input1;
    private List<String> input2;
    private List<String> input3;
    private List<String> input4;

    public input(){}

    public input(List<String> jawaban1, List<String> jawaban2, List<String> jawaban3, List<String> jawaban4, List<String> input1, List<String> input2, List<String> input3, List<String> input4) {
        this.jawaban1 = jawaban1;
        this.jawaban2 = jawaban2;
        this.jawaban3 = jawaban3;
        this.jawaban4 = jawaban4;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
    }

    protected input(Parcel in) {
        jawaban1 = in.createStringArrayList();
        jawaban2 = in.createStringArrayList();
        jawaban3 = in.createStringArrayList();
        jawaban4 = in.createStringArrayList();
        input1 = in.createStringArrayList();
        input2 = in.createStringArrayList();
        input3 = in.createStringArrayList();
        input4 = in.createStringArrayList();
    }

    public static final Creator<input> CREATOR = new Creator<input>() {
        @Override
        public input createFromParcel(Parcel in) {
            return new input(in);
        }

        @Override
        public input[] newArray(int size) {
            return new input[size];
        }
    };

    public List<String> getJawaban1() {
        return jawaban1;
    }

    public void setJawaban1(List<String> jawaban1) {
        this.jawaban1 = jawaban1;
    }

    public List<String> getJawaban2() {
        return jawaban2;
    }

    public void setJawaban2(List<String> jawaban2) {
        this.jawaban2 = jawaban2;
    }

    public List<String> getJawaban3() {
        return jawaban3;
    }

    public void setJawaban3(List<String> jawaban3) {
        this.jawaban3 = jawaban3;
    }

    public List<String> getJawaban4() {
        return jawaban4;
    }

    public void setJawaban4(List<String> jawaban4) {
        this.jawaban4 = jawaban4;
    }

    public List<String> getInput1() {
        return input1;
    }

    public void setInput1(List<String> input1) {
        this.input1 = input1;
    }

    public List<String> getInput2() {
        return input2;
    }

    public void setInput2(List<String> input2) {
        this.input2 = input2;
    }

    public List<String> getInput3() {
        return input3;
    }

    public void setInput3(List<String> input3) {
        this.input3 = input3;
    }

    public List<String> getInput4() {
        return input4;
    }

    public void setInput4(List<String> input4) {
        this.input4 = input4;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(jawaban1);
        parcel.writeStringList(jawaban2);
        parcel.writeStringList(jawaban3);
        parcel.writeStringList(jawaban4);
        parcel.writeStringList(input1);
        parcel.writeStringList(input2);
        parcel.writeStringList(input3);
        parcel.writeStringList(input4);
    }
}
