package com.example.user.testovi;


public class PitanjaRaskrsnice {
    private int mSlika;
    private int mOdgovor1;
    private int mOdgovor2;
    private int mOdgovor3;
    private int mTacanOdgovor;
    protected int mBodovi;

    public PitanjaRaskrsnice(int slika, int odgovor1, int odgovor2,int odgovor3, int tacanOdgovor, int bodovi) {
        mSlika = slika;
        mOdgovor1 = odgovor1;
        mOdgovor2 = odgovor2;
        mOdgovor3 = odgovor3;
        mTacanOdgovor = tacanOdgovor;
        mBodovi = bodovi;
    }

    public int getBodovi() {
        return mBodovi;
    }

    public int getOdgovor3() {
        return mOdgovor3;
    }

    public void setOdgovor3(int odgovor3) {
        mOdgovor3 = odgovor3;
    }

    public void setBodovi(int bodovi) {
        mBodovi = bodovi;
    }

    public int getSlika() {
        return mSlika;
    }

    public void setSlika(int slika) {
        mSlika = slika;
    }

    public int getOdgovor1() {
        return mOdgovor1;
    }

    public void setOdgovor1(int odgovor1) {
        mOdgovor1 = odgovor1;
    }

    public int getOdgovor2() {
        return mOdgovor2;
    }

    public void setOdgovor2(int odgovor2) {
        mOdgovor2 = odgovor2;
    }

    public int getTacanOdgovor() {
        return mTacanOdgovor;
    }

    public void setTacanOdgovor(int tacanOdgovor) {
        mTacanOdgovor = tacanOdgovor;
    }
}
