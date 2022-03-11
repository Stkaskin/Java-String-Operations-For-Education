package com.hataysoftware;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class work_1 {
    public static void run()
    {
        ArrayList list_kalin = new ArrayList();
        ArrayList list_ince = new ArrayList();
        boolean kalin_ince = false;
        boolean cevap=true;
        list_kalin.add("a");
        list_kalin.add("o");
        list_kalin.add("u");
        list_kalin.add("ı");
        list_ince.add("e");
        list_ince.add("ö");
        list_ince.add("ü");
        list_ince.add("i");
        Scanner sc=new Scanner(System.in);
        String mt1 = sc.nextLine().toLowerCase(Locale.ROOT);
        mt1=" "+mt1+" ";

        if (split_search(list_kalin,mt1)> 1)
        {
            kalin_ince=true;

        }

        if (split_search(list_ince,mt1)>1)
            if (kalin_ince)
                cevap=false;
            else
                cevap=true;



        System.out.println("cevap = "+(cevap?" Uyumludur":"Uyumsuzdur"));

    }
    private  static int split_search(ArrayList list,String mt1){
        for (var a: list)
            if ( mt1.split(a.toString()).length>1)
                return 2;

        return  0;
    }

}
