package com.hataysoftware;

import java.util.Scanner;

public class work_3 {
    private static void aa()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Aynı Uzunlukta olacak 1.Cümleyi Girin: ");
        String text_1=scanner.nextLine();
        System.out.print("Aynı Uzunlukta olacak 2.Cümleyi Girin: ");
        String text_2=scanner.nextLine();
        if (text_1.length()==text_2.length())
        {
        int lenght=text_1.length();
        double score_=100.0/lenght;
        double total_score_=0;
        for (int i = 0; i <lenght; i++)
            if (text_1.charAt(i)==text_2.charAt(i))total_score_+=score_;
//kod fazlalıgı gorunum içindir 10.00 100.00
        System.out.println("%"+(total_score_+"").substring(0,((int) total_score_+"").length()+3));
        }

    }
}
