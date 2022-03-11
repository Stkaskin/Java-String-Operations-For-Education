package com.hataysoftware;

public class work_6 {
    public static void run()
    {
        String mt6="Bugün hava çok güzel";
            String temp_mt6="";
        for (int i = 0; i < mt6.length(); i+=3) {
            temp_mt6+=mt6.charAt(i);
        }
        System.out.println(temp_mt6);
    }
}
