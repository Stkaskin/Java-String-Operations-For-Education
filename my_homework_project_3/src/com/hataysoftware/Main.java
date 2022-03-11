package com.hataysoftware;
import homework_3_folder.homework_1;
import homework_3_folder.homework_2;
import homework_3_folder.homework_3;
import homework_3_folder.homework_4;
import homework_3_folder.homework_5;
import homework_3_folder.homework_6;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//      homework_1 work1=new homework_1();
//        work1.homework_1(read_int("1. SAYIYI GİRİN"),read_int("2. SAYIYI GİRİN"));

//        homework_2 work2=new homework_2();
//        work2.homework_2(read_int("1. SAYIYI GİRİN"),read_int("2. SAYIYI GİRİN"));

//        homework_3 work3=new homework_3();
//        work3.homework_3(read_int("1. SAYIYI GİRİN"),read_int("2. SAYIYI GİRİN"));

//       homework_4 work4=new homework_4();
//        work4.homework_4( read_int(" SAYI GİRİN"));

//          homework_5 work5=new homework_5();
//        work5.homework_5(read_int(" SAYI GİRİN"));

       homework_6 work6=new homework_6();
      work6.homework_6();


    }
private static int read_int(String text)
{
    Scanner scanner=new Scanner(System.in);
 System.out.print(text);
    return scanner.nextInt();
}
}

