package com.hataysoftware.inh;

public class student_ extends person {
    String sinif;
    int akts;

    public student_(String _sinif, int _akts) {
        this.akts=_akts;
        this.sinif=_sinif;

    }
    public void setAkts(int newAkts)
    {
        akts=newAkts;


    }

}
