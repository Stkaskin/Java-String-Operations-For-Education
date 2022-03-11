package com.hataysoftware;

import java.util.Arrays;


public class work_5 {
    public static void run()
    {
        String mt5="Veli ve Vedat eve gelmedi".toLowerCase();
        mt5=" "+mt5+" ";
        var count= Arrays.stream(mt5.split("ve")).count()-1;
        System.out.println(count);

    }
}
