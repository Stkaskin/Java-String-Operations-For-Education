package com.hataysoftware;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//füze gönder havada patlasın
        ///şu onemlidir ki
     //   ParcalaBehcet();
       //   randomuna_random_kardes();
       // StopFuze();
             // cekirgebirsicrar_ikisicrar_ucsicrar();
     // Shiftine_shift();
        //Parayi_Veren_Dudugu_Calar();
    }

    private static void Parayi_Veren_Dudugu_Calar() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Para Miktarı Girin: ");
        int orj_money = scanner.nextInt();
        int money=orj_money;
        int total_p=0;
        int[][] money_list = new int[7][2];
        //sol para birimi sağ sayısı
        money_list[0][0]=200;
        money_list[1][0]=100;
        money_list[2][0]=50;
        money_list[3][0]=20;
        money_list[4][0]=10;
        money_list[5][0]=5;
        money_list[6][0]=1;
        for (int i=0;i<money_list.length;i++)
        {
            int temp=money/money_list[i][0];
            if (temp>=1)
            {
                money-=(money_list[i][0]*temp);
                money_list[i][1]=temp;
                total_p+=temp;
            }
        }
        for (int i = 0; i <money_list.length ; i++) {
            if (money_list[i][1]>0)
                System.out.println(orj_money +"->  "+money_list[i][1]+" adet "+money_list[i][0]);

        }
    }

    private static void Shiftine_shift() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yazı girin:");
        String orj_text = scanner.nextLine();
        System.out.print("Sağ İse 0 ::::  Sol ise 1 Yazın :");
        int choose= scanner.nextInt();
        System.out.print("Kaydırma Sayısı Girin:");
        String text=orj_text;
        int character_ = scanner.nextInt();
        if (choose==0)
        text = text.substring(character_) + text.substring(0, character_);
       else if (choose==1)
           text = text.substring(text.length() - character_) + text.substring(0, text.length() - character_);

        System.out.println(text);

    }

    private static void cekirgebirsicrar_ikisicrar_ucsicrar() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yükseklik :");
        //hız
        double speed = scanner.nextDouble();
        //yol
        double x = 0;
        //artış hızı
        double ivme = 0.2;
        //zaman
        int t = 10;
        int max=20;
        x+=speed;

        System.out.println("Başlangıç İnerken : " + speed+" Yol Aldı Toplamda "+ x +
                " Birim Yol aldı");
           speed -= speed * ivme;
        int i = 0;
        while (x <= max) {
            i++;
            x += speed+speed;
            System.out.println("Top " + (i) + ". Sürede Çıkarken " + (int)speed +
                    " Yol Aldı ve İnerken " +(int)speed+" Yol Aldı Toplamda "+ x +
                    " Birim Yol aldı");
            speed -= speed * ivme;

        }
        System.out.println("20 Metreye ulaşmak için " + (i) + " Defa Zıplaması Gerek");

    }

    private static void randomuna_random_kardes() {
        //Random kütüphanesi çağırıldı
        Random random = new Random();
        //3 dizi oluşturuldu
        int[] temp_int_x = new int[5];
        int[] temp_int_y = new int[5];
        int[] temp_int_z = new int[5];
        //3 tane artimetik ortalama tutucu
        int arith_y = 0;
        int arith_x = 0;
        int arith_z = 0;

        //x ve y aynı boyutta olduğu için x ve y ye random sayılar aktarılıp
        //indexlerine random değerler atılır

        for (int i = 0; i < temp_int_x.length; i++) {
            temp_int_x[i] = random.nextInt(23) + 12;
            temp_int_y[i] = random.nextInt(23) + 12;
            //artimetik ortalamaları için oluşan randomları gönderilen dizi indexsinden  çekilir ve artih
            //tutuculara eklenir
            arith_x += temp_int_x[i];
            arith_y += temp_int_y[i];
        }
        //aritmetik x ve y dizi boyutuna bölünür
        arith_x /= temp_int_x.length;
        arith_y /= temp_int_y.length;


        for (int i = 0; i < temp_int_y.length; i++) {
            temp_int_z[i] = temp_int_y[i] * arith_x;
            arith_z += temp_int_z[i];
        }

        arith_z /= temp_int_z.length;

        System.out.println("x aritmetiği:" + arith_x);
        System.out.println("y aritmetiği:" + arith_y);
        System.out.println("z aritmetiği:" + arith_z);
        for (int i = 0; i < temp_int_z.length; i++) {
            System.out.println((i + 1) + ". x:" + temp_int_x[i] + " y:" + temp_int_y[i] + " z:" + temp_int_y[i]);


        }


    }

    private static void ParcalaBehcet() {
Scanner scanner=new Scanner(System.in);
System.out.print("Cümle giriniz: ");
        String temp_text = scanner.nextLine();
        String[] temp_string_split = temp_text.split(" ");
        System.out.println("Cümledeki kelime sayısı :" + temp_string_split.length);
        for (int i = 0; i < temp_string_split.length; i++)
            System.out.println((i + 1) + ". Kelime:" + temp_string_split[i]);

    }

    private static void StopFuze() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("HIZ :");
        //hız
        int speed = scanner.nextInt();
        System.out.print("ZAMAN :");
        //zaman
        int t = scanner.nextInt();
        //yol
        int x = 0;
        //artış hızı
        double ivme = 0.2;
        //hızın kendisine ivmesel artıştan çıkan değeri ekliyorum
        System.out.println("Füze Fırlatıldı \nFüzenin Yol Zaman Durumu . ");
        for (int i = 1; t >= i; i++) {
            x += speed;
            speed += speed * ivme;
            System.out.println("Füze " + i + " Sürede \t" + x + " Birim Yol Aldı \nBir Sonraki Hızı(" + (i + 1) + ") :" + speed);
        }
    }
}
