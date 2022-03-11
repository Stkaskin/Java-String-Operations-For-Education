package com.hataysoftware;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class work_4 {
    public static void run(){
        String mt4="Bugün Hava Çok Güzel. Deniz, Kumsal Ve Güneş Muhteşem Olacak.";
        mt4=mt4.toLowerCase(Locale.ROOT);
        List<Character> list = new ArrayList();
        list.add('a');
        list.add('o');
        list.add('u');
        list.add('ı');
        list.add('e');
        list.add('ö');
        list.add('ü');
        list.add('i');
        int count=0;
        for (int i =0;i<mt4.length();i++) {
            for (var item:list) {
                if(mt4.charAt(i)==item)
                {
                 ++count;
                 break;
                }
            }
        }
        System.out.println(count);
    }
}
