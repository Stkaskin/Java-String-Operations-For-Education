
package com.hataysoftware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class kisi {
    String AdSoyad = "";
    String tel;
    private String typeof_Ad = "ad:";
    private String typeof_tel = "tel:";
    private String olddata;

    public boolean Add() {
        ArrayList<kisi> list = getAllData();

        String tel_set = this.typeof_tel + this.tel + "-";
        String ad_set = this.typeof_Ad + this.AdSoyad + "-";
        String _olddata = tel_set + ad_set;
        boolean r = searchEq(list, _olddata);
        if (r)
            return false;
        this.olddata = _olddata;
        Operation.Write(olddata);
        return true;
        //  Operation.Update(this.olddata, this.olddata);

    }

    private static boolean searchEq(ArrayList<kisi> list, String _olddata) {
        for (var item : list)
            if (_olddata.equals(item.olddata))
                return true;
        return false;
    }

    public void Delete() {
        setData(this.olddata, "new_text",false);
    }

    public void setData(String old_, String new_,boolean updel) {
        ArrayList<kisi> list = getAllData();
        ArrayList<kisi> list2 = list;
        String ob_ = "";
        boolean se = false;
        for (var item : list) {
            if (old_.equals(item.olddata)) {
              if (updel)
              {
                  se = searchEq(list, new_);
                  if (!se)
                      ob_ += new_ + System.lineSeparator();
                  else
                      ob_ += item.olddata + System.lineSeparator();
              }


            } else
                ob_ += item.olddata + System.lineSeparator();
        }
        Operation.Update(ob_);
    }

    public void Update() {

        String new_text =
                this.typeof_tel + this.tel + "-" +
                        this.typeof_Ad + this.AdSoyad + "-";
        setData(this.olddata, new_text,true);
        // Operation.Update(olddata, new_text);
    }

    public static ArrayList Search(String param) {
        ArrayList<kisi> kisiler = getAllData();
        ArrayList list = new ArrayList();
        for (var item : kisiler)
            if (item.tel.contains(param) || item.AdSoyad.contains(param))
                list.add(item);


        return list;
/*
   if (item.tel==param || item.AdSoyad==param)
                list.add(item);
* */
    }

    public static ArrayList Search() {
        return getAllData();
    }

    private static ArrayList getAllData() {
        List<String> gets = Operation.Read();
        ArrayList list = new ArrayList();
        ArrayList sp_List = new ArrayList();
        for (var item : gets) {

            String[] sp = item.split("-");
            if (sp.length != 1) {
                kisi kisi_get = new kisi();
                kisi_get.tel = getParam(sp[0], kisi_get.typeof_tel);
                kisi_get.AdSoyad = getParam(sp[1], kisi_get.typeof_Ad);
                kisi_get.olddata = kisi_get.typeof_tel + kisi_get.tel + "-" + kisi_get.typeof_Ad + kisi_get.AdSoyad + "-";
                list.add(kisi_get);
            }
        }
        return list;
    }

    private static String getParam(String item, String type_) {
        int temp_ = item.lastIndexOf(type_);

        if (temp_ != -1) {
            return item.split(type_)[1];
        }
        return "";
    }


}





