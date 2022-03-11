package com.hataysoftware;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // write your code here






       // kisi kisim = kisiler.get(1);
     //   kisim.tel = "66";
     //   kisim.AdSoyad = "6";
     //   kisim.Update();
    //    kisim.Delete();
        Scanner scanner=new Scanner(System.in);
        while (true)
        {scanner=new Scanner(System.in);
            int i = 1;
            ArrayList<kisi> kisiler = kisi.Search();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (kisiler.size()==0)
                System.out.println("Liste Boş");
            for (var item : kisiler)
                System.out.println(i++ + ". AD : " + item.AdSoyad + " Tel : " + item.tel);

            System.out.println("1.Getir:");
            System.out.println("2.Ekle:");
            System.out.println("3.Yenile:");
            System.out.println("4.Çık:");

          System.out.println("Seç:");
            int sec_=scanner.nextInt();
           if(sec_==1) {
               System.out.println("Getirilecek Kişiyi Seçin:");
               int a = scanner.nextInt();
               if (a <= kisiler.size())
           {

               var get_item=kisiler.get(a-1);

               System.out.println("Getirilen Kişi:\n"+
                       "Ad:" +get_item.AdSoyad+" Tel:"+get_item.tel);
               System.out.println("1.Sil");
               System.out.println("2.Güncelle");
               System.out.println("3.Geri Dön");
               int a1=scanner.nextInt();
               if (a1==1)
                   get_item.Delete();
               else if (a1==2){
                   System.out.println("Eski Tel:"+get_item.tel);
                   System.out.println("Yeni Tel'i Girin");
                   get_item.tel=scanner.next();
                   scanner=new Scanner(System.in);
                   System.out.println("Eski Ad:"+get_item.AdSoyad);
                   System.out.println("Yeni Adı Girin");
                   get_item.AdSoyad=scanner.nextLine();
                   get_item.Update();
               }
           }
               else
               {
                   System.out.println("Geçerli Bir Değer Girmediniz.Bekleyin...");
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
           else if(sec_==2)
           {System.out.println("Yeni Kişi Bilgileri");
             kisi kisi_new=new kisi();
               System.out.println("Tel'i Girin");
               kisi_new.tel=scanner.next();
               scanner=new Scanner(System.in);
               System.out.println(" Adı Girin");
               kisi_new.AdSoyad=scanner.nextLine();



               if( kisi_new.Add())
                   System.out.println("Eklendi");
               else
                   System.out.println("Ekleme Başarısız.");
           }
           else if(sec_==3)
           {
               System.out.println("Yenilendi");
           }
           else if(sec_==4)
           {
               System.out.println("Program Kapatıldı");
               break;
           }

        }


    }
}
