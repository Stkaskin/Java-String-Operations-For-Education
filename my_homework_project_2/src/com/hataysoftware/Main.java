package com.hataysoftware;
import com.hataysoftware.homework_classes.homework_1_betweenTwoNum;
import com.hataysoftware.homework_classes.homework_2_harshad_numbers;
import com.hataysoftware.homework_classes.homework_3_term_total;
import com.hataysoftware.homework_classes.homework_4_year_avrange_country;
import com.hataysoftware.homework_classes.homework_5_ednless_desire;
import com.hataysoftware.homework_classes.homework_6_diffrent_three_lenght;
import com.hataysoftware.homework_classes.homework_7_single_and_couple_string;
import com.hataysoftware.homework_classes.homework_8_where_is_big_number_random;
import com.hataysoftware.homework_classes.homework_9_find_and_shred;
import com.hataysoftware.homework_classes.homework_10_payToInternetCafe;
import com.hataysoftware.homework_classes.homework_11_brand_and_statistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (;;){
            utku_hom_wo utku=new utku_hom_wo();
            utku.utkunungunlugu();
            readSendToInt("fuckoff");
        if (9==8)    break;
        }

        for (;;) {
            System.out.print
                    ("" +
                    "1  2 Sayı arasındaki sayıların toplamını belli bir kurala göre hesaplama\n" +
                    "2  Harshad sayılarını listeleyen program\n" +
                    "3  ilk 30 teriminin toplamını hesaplayan \n" +
                    "4  Ülke nüfusunun tahmini\n" +
                    "5  Sonsuzluğa doğru Dünya Barışı\n" +
                    "6  3 Basamaklı rakamları birbirinden farklı sayılar \n" +
                    "7  bir N sayısına göre 1 3 5 7… N…6 4 2 0 \n" +
                    "8  en büyük elemanını bulan ve yerini (index) gösteren program \n" +
                    "9  Mail Kontrol\n" +
                    "10 Internet kafe saat ve içicek hesap makinası\n" +
                    "11 Dizilerde tablosal hesaplama 10*4\n" +
                    "0 ÇIKIŞ YAP\n"
                    );

            int number=readSendToInt("Seçin:");
            switch (number){
                case 1:
                    homework_1_betweenTwoNum twoNum=new homework_1_betweenTwoNum();
                    twoNum.betweenTwoNum(readSendToInt("1. Sayiyi girin"),readSendToInt("2.Sayiyi Girin"),readSendToInt("Artiş değeri girin:"));
                    break;
                case 2:
                    homework_2_harshad_numbers harshad_num= new homework_2_harshad_numbers();
                    harshad_num.hardhas_numbers();
                    break;
                case 3:
                    homework_3_term_total term_total=new homework_3_term_total();
                    term_total.temTotal();
                    break;
                case 4:
                    homework_4_year_avrange_country homework_4_year_avrange_country=new homework_4_year_avrange_country();
                    homework_4_year_avrange_country.year_avrange_country();
                    break;
                case 5:
                    homework_5_ednless_desire ednless_desire=new homework_5_ednless_desire();
                    ednless_desire.endles_desire();
                    break;
                case 6:
                    homework_6_diffrent_three_lenght three_lenght=new homework_6_diffrent_three_lenght();
                    three_lenght.diffrent_three_lenght();
                    break;
                case 7:
                    homework_7_single_and_couple_string singleAndCoupleString=new homework_7_single_and_couple_string();
                    singleAndCoupleString.single_and_couple_string(readSendToInt("Bir sayı girin:"));
                    break;
                case 8:
                    homework_8_where_is_big_number_random bigNumberRandom=new homework_8_where_is_big_number_random();
                    bigNumberRandom.where_is_big_number_random();
                    break;
                case 9:
                    homework_9_find_and_shred findAndShred=new homework_9_find_and_shred();
                    findAndShred.homework_9_find_and_shred(readSendToString("Lütfen Bir Mail Giriniz Örnek mail:ad.soyad@mail.com\n Mail adresi girin : "));
                    break;
                case 10:
                    homework_10_payToInternetCafe payToInternetCafe=new homework_10_payToInternetCafe();
                    payToInternetCafe.pay_to_internet_cafe
                            (
                                    readSendToInt("Dakika girin:"),
                                    readSendToInt("Saat girin:"),
                                    readSendToInt("İçilen çay sayısı girin:"),
                                    readSendToInt("İçilen kola sayısı girin:")
                            );;break;
                case 11:
                    homework_11_brand_and_statistics brandAndStatistics=new  homework_11_brand_and_statistics();
                    homework_11_brand_and_statistics.brand_and_statistics();

                    break;
                case 0:break;
                default :break;

            }
            if (number==0){break;}
           readSendToString("\tDevam etmek için sayı girin yazın .");


        }










/**/

       /**/


     /*   */

 /*      */

        /*
*/
/*


*/



    }
    static private  int readSendToInt(String text){
        Scanner read=new Scanner(System.in);
        System.out.print(text);
        return read.nextInt();
    }
    static private  String readSendToString(String text){
        Scanner read=new Scanner(System.in);
        System.out.print(text);
        return read.next();
    }


}
