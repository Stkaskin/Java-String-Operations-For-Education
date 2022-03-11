package com.hataysoftware;

import java.util.Scanner;

public class work_5 {
    private static void ff(){
        System.out.print("Essiz karakterler bulunacak yaziyi girin: ");
        Scanner scanner=new Scanner(System.in);
        String text_orj=scanner.nextLine();
        String text=text_orj;
        for (int i = 0; i <text.length() ; i++) {
            int counter=0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i)==text.charAt(j))counter++;
                if (counter>1) {
                    text=text.substring(0,j)+text.substring(j+1);
                }
            }
        }
        System.out.println("Eşsiz karakterler");
        for (int i = 0; i <text.length() ; i++) {
            System.out.println((i+1)+". Eşsiz :"+ text.charAt(i));
        }

    }
}
