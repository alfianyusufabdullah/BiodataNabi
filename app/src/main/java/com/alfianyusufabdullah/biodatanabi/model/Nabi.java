package com.alfianyusufabdullah.biodatanabi.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by jonesrandom on 2/6/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class Nabi implements Parcelable {

    private String nama;
    private String alias;
    private String usia;
    private String periode;
    private String tempatDiUtus;
    private String tempatWafat;
    private String disebutDalamAlquran;
    private String sebutanKaum;
    private String jumlahKeturunan;
    private List<String> garisKeturunan;

    public Nabi(String nama, String alias, String usia, String periode, String tempatDiUtus, String tempatWafat, String disebutDalamAlquran, String sebutanKaum, String jumlahKeturunan, List<String> garisKeturunan) {
        this.nama = nama;
        this.alias = alias;
        this.usia = usia;
        this.periode = periode;
        this.tempatDiUtus = tempatDiUtus;
        this.tempatWafat = tempatWafat;
        this.disebutDalamAlquran = disebutDalamAlquran;
        this.sebutanKaum = sebutanKaum;
        this.jumlahKeturunan = jumlahKeturunan;
        this.garisKeturunan = garisKeturunan;
    }

    public String getNama() {
        return nama;
    }

    public String getAlias() {
        return alias;
    }

    public String getUsia() {
        return usia;
    }

    public String getPeriode() {
        return periode;
    }

    public String getTempatDiUtus() {
        return tempatDiUtus;
    }

    public String getTempatWafat() {
        return tempatWafat;
    }

    public String getDisebutDalamAlquran() {
        return disebutDalamAlquran;
    }

    public String getSebutanKaum() {
        return sebutanKaum;
    }

    public String getJumlahKeturunan() {
        return jumlahKeturunan;
    }

    public List<String> getGarisKeturunan() {
        return garisKeturunan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alias);
        dest.writeString(this.usia);
        dest.writeString(this.periode);
        dest.writeString(this.tempatDiUtus);
        dest.writeString(this.tempatWafat);
        dest.writeString(this.disebutDalamAlquran);
        dest.writeString(this.sebutanKaum);
        dest.writeString(this.jumlahKeturunan);
        dest.writeStringList(this.garisKeturunan);
    }

    Nabi(Parcel in) {
        this.nama = in.readString();
        this.alias = in.readString();
        this.usia = in.readString();
        this.periode = in.readString();
        this.tempatDiUtus = in.readString();
        this.tempatWafat = in.readString();
        this.disebutDalamAlquran = in.readString();
        this.sebutanKaum = in.readString();
        this.jumlahKeturunan = in.readString();
        this.garisKeturunan = in.createStringArrayList();
    }

    public static final Parcelable.Creator<Nabi> CREATOR = new Parcelable.Creator<Nabi>() {
        @Override
        public Nabi createFromParcel(Parcel source) {
            return new Nabi(source);
        }

        @Override
        public Nabi[] newArray(int size) {
            return new Nabi[size];
        }
    };
}
