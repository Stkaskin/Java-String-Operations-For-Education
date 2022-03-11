package com.hataysoftware;

import java.util.Scanner;

public class work_2 {
    public  static void run(){
        Scanner sc=new Scanner(System.in);

        String m2=sc.nextLine();
        var splt=m2.split(" ");
        int index=0;
        for (int i = 0; i < splt.length; i++) {
            if (splt[i].length()>splt[index].length())
                index=i;
        }
        System.out.println(splt[index] +" En uzun kelimedir ve uzunluğu "+splt[index].length()+" birimdir.");
    }
}
