package com.hataysoftware;

import java.util.Scanner;

public class work_6 {
  private static void pp(){
      Scanner scanner=new Scanner(System.in);
      System.out.print("Parantez kontrol :");
      String get_string=scanner.nextLine();
      int str_lenght=get_string.length()/2;
      int counter = 0;
      for (char ch : get_string.toCharArray())
          if (ch == '(') counter++;
          else if (ch == ')') counter--;
      if (counter==0)
          System.out.println("Parantez Kontrolü Yapıldı \nSorun Yok");
      else
          System.out.println("Parantez Kontrolü Yapıldı \nSorun Bulundu "+counter+" Adet eksik parantez");
  }

}
