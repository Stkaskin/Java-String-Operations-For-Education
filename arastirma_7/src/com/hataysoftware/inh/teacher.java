package com.hataysoftware.inh;

import java.time.LocalDateTime;

public class teacher extends person {
    String brans;
    int baslangicYili;

    public teacher(String _brans, int _baslangicYili) {
        this.baslangicYili = _baslangicYili;
        this.brans = _brans;

    }

    public void calculator() {
        System.out.println("ad:" + this.ad + "\nBaşlangıç Yılı : " +
                this.baslangicYili + "\nBranş : " + this.brans +
                "\nÇalışma Yılı : " + (LocalDateTime.now().getYear() - baslangicYili) + " Yıl");

    }
}
