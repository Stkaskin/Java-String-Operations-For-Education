package com.hataysoftware;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //burada Liste olusturup icine
        // roma sayilarinin katsayi seklindeki halini atiyoruz

        var list = new ArrayList();

        list.add(100);
        list.add(50);
        list.add(10);
        list.add(5);
        list.add(1);

        for (int i = 1; i < 104; i++)
        {
//burada roma rakamlarina cevirirken kullandigimiz tutucuyu tanimliyoruz.

            //String builder stringe += yaptigim icin java tarafindan onerildi
            //append islemi
            StringBuilder char_hold = new StringBuilder();
            //önceki aradigimiz liste degerini tutar
            //bu sayede 4 defa tekrar eden 9 gibi degerleri VIIII yerine IX yazmayi sagliyoruz
            int previous_value = (int) list.get(0);
            //Burada kontol edecegimiz sayi icin tutucu olusturup tutucuya aktariyoruz
            int _temp_i = i;
            //burada Array listi dolasiyoruz buyukten>k
            for (var item_var :list) {


                //surekli '(int)' komutu ile islem kalabalikligini engelliyoruz
                //item degiskeni foreach ile cagirdigimiz elemani tutar
                int item=(int)item_var;
                //burada temp_i yani i tutucumuz itemdan buyuk mu diye kontrol ediyoruz
                //eger kucukse islem yapmasina gerek kalmayacak
                if (_temp_i >=  item) {
//_temp_i degiskeni item degiskenine kac defa bölunuyor buradan cikan deger
                    //tekrar sayisini verecek
                    int repeat_count = _temp_i /  item;


                    //basamak kontrol önemi : 1-90 a kadar 90 dahil sorunsuz hesaplar fakat
                    // 90+ söyle bir sorun cikar artik birler basamakli tekrarlardan
                    // 10lar basamakli tekrarlar basliyor ve artik sayi 3 basamakli sayi olma
                    // egilimi gösteriyor bu yuzden bizim sinirimiz olan 100'e
                    //yani sayinin 3. basamak haline yakin olan hallerinde
                    //91-92...99 sayilarini 3 basamakli muamalesi yapmamiz
                    //gerekir bu yuzden min degerim 91'e 9 eklerim bu sayede basamak sayim
                    //2'nin uzerine cikiyor
                    int number_of_digits  = ((_temp_i + 9) + "").length();
                    //burada sayinin 4 defa tekrari oldugu  durumlari göz
                    //önune aliyoruz burada yapacagimiz islem artik sayi 4. tekrari
                    // ile kendinden buyuk olan listedeki elemanla birlikte ters sekilde yazilmasi
                    // 9 sayisi = VIIII burada 3'den fazla 'I' kullanimla durumu oluyor
                    //bunu asmak icin sayiyi IX  seklinde yani kucuk buyuk seklinde yazmamiz gerekiyor
                    // bu yuzden kendisinden %10 kucuk sayiyi buluyoruz
                    // 9x icin => 10x-(10x/10x) = 9x cikacaktir
                    int four_again = (previous_value - previous_value / 10);
                    //burada four_again katsayi duzenini bozmamasi cikarilacak sayiyi bulmamizi
                    //saglayan mod degerini buluyoruz
                    //örnek : 10 100 icin %10 luk kisim 10'un katlari seklinde giderken
                    //50 sayisinda %10 luk kismi 5 olarak gidiyor bu sayilari cikardigimizda
                    //10 icin 1 ve yeni sayimiz 9 (tekrari 4 olan big sayi)
                    //100 icin 10 ve yeni sayi 90
                    //50 icin 5 ve yeni sayi 45
                    //burada 45 sayisi yanlis degerleri getireceginden 5 sayisindan kurtulmak gerekiyor
                    //sayinin buyuk yani 450 gibi bir degerde de 50 sayisindan kurtulmamizi saglacak olan
                    // math pow kutuphanesinden yararlaniriz
                    int mod =(int) Math.pow(10,(_temp_i+"").length()-1);
//burada mod degerimizi bulduktan sonra sayimizda gereksiz gördugumuz bir deger var mi bakiyoruz
                    //1-100 arasindaki deger 45
                    if (mod > 1 && four_again % mod != 0)
                        four_again -= four_again % 10;
                    //burada 9 19 ... gibi degerlerler var ise bu degerleri ust sayiyi ile kucuk buyuk seklinde yaziyoruz
                    // veya
                    // //burada yukarda tuttugumuz basamak sayisi ve four again +10 yani
                    // 90 ustu icin 3. basamaga cikaracak 10 sayisi ve
                    //basamak sayisinin 3 ve ustu  oldugunu dogrulayacak olan basamak tutucumuzu sorguluyoruz
                    //2 durumdada ayni islem yapildigi icin kodlar birlestirildi


                    if ((four_again == _temp_i)
                            || (four_again + 10 > _temp_i && number_of_digits > 2))
                    {
                        //Methoda önceki liste degeri- cikarimda bulundugumuz sayiyi sol tarafa
                        //9 icin previous_value=10 , four_again=9
                        //sol tarafa 10-9 =1 i yani 'I'
                        //sag tarafa 10 yani bir buyuk sayimiz olan X
                        char   left = convert_Method(previous_value - four_again);
                        char right = convert_Method(previous_value);
                        //ekleme yaptigimiz 9 icin
                        //IX olur
                        char_hold.append(left).append(right);
                        _temp_i -= four_again;
                    }
                    else if (repeat_count > 3)
                    {
                        //4 den fazla tekrar eden ve
                        //4-14-24 gibi olan sayilari yazimi tekrar sayisi 4 olan
                        // ve 9-19... sayilarindan haric durumlari kullanilan Roma karakterlerin yerini degistirir
                        //4 sayisi IIII ile ifadesi mumkun olmadigindan IV yani kucuk buyuk
                        char left=convert_Method(item);
                        char right=convert_Method(previous_value);
                        char_hold.append(left).append(right);
                        //char tutucusuna attiktan sonra  tekrar kadar item kadar degeri _temp_i den cikariyoruz
                        _temp_i -= repeat_count * item;
                    }
                    else {
                        //durum saglaniyorsa gönderdigimiz gecerli liste degerini
                        // itemi gonderir gelen degeri  tekrar sayisi kadar char tutucumuza ekliyoruz
                        char_hold.append((convert_Method(item) + "").repeat(repeat_count));
                        //char tutucusuna attiktan sonra  tekrar kadar item kadar degeri _temp_i den cikariyoruz
                        _temp_i -= repeat_count *  item;
                    }


                }
                //sayiyi tutuyoruz
                previous_value =  item;
            }
            //excelde test icindir copy paste
            //  System.out.print(char_hold+"\t");

            //duzgun bir görunum icindir
            System.out.print(char_hold);

            System.out.println(" ".repeat(15-char_hold.length()) +"=>= " + i);
        }


    }
    //method ile gelen sayiyi switch icinde hangi karaktere ait oldugunu buluyoruz ve
    // o degeri dönduruyoruz

    private static char convert_Method(int num) {
        return switch (num) {
            case 1 -> 'I';
            case 5 -> 'V';
            case 10 -> 'X';
            case 50 -> 'L';
            case 100 -> 'C';
            case 500 -> 'D';
            case 1000 -> 'M';
            default -> '-';
        };

    }

}


/*
 int adim = 1;
        int[] first_out = new int[0];
        int[] last_out = new int[0];
//•	Sırasıyla 6,4,5,2,8 sayıları yığın (stack) yapısına atılıyor.
        last_out = add(last_out, 6);

        get_List(last_out, adim++ + ".Adim Stack");
        last_out = add(last_out, 4);
        get_List(last_out, adim++ + ".Adim Stack");
        last_out = add(last_out, 5);
        get_List(last_out, adim++ + ".Adim Stack");
        last_out = add(last_out, 2);
        get_List(last_out, adim++ + ".Adim Stack");
        last_out = add(last_out, 8);
        get_List(last_out, adim++ + ".Adim Stack");
        //•	Yığından bir kez çıkarma,
        last_out = remove(last_out, 0);
        get_List(last_out, adim++ + ".Adim Stack");
        //•	Sırasıyla 9 ve 3 sayılarını ekleme,
        last_out = add(last_out, 9);
        get_List(last_out, adim++ + ".Adim Stack");
        last_out = add(last_out, 3);
        get_List(last_out, adim++ + ".Adim Stack");
//•	Bir kez çıkarma işlemleri yapılmaktadır.
        last_out = remove(last_out, 0);
        get_List(last_out, adim++ + ".Adim Stack");
        adim = 1;
//•	Son durumda stack’in tüm elemanları, queue (kuyruk) yapısına atılıyor.
        for (int i = 0; i < last_out.length; i++) {
            first_out = add(first_out, last_out[i]);

        }
        get_List(first_out, adim++ + ".Adim Queue");
        //•	Kuyruktan bir kez çıkarma,
        first_out = remove(first_out, 1);
        get_List(first_out, adim++ + ".Adim Queue");
        //•	5 ve 1 sayılarını sırasıyla ekleme işlemi yapılıyor.
        first_out = add(first_out, 5);
        get_List(first_out, adim++ + ".Adim Queue");
        first_out = add(first_out, 1);
        get_List(first_out, adim++ + ".Adim Queue");


    }

    private static void get_List(int[] dizi, String text) {

        System.out.print(text + "=>[");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
        System.out.println("]");
    }

    private static int[] add(int[] dizi, int value) {
        int[] dizis = new int[dizi.length + 1];
        for (int i = 0; i < dizi.length; i++) {
            dizis[i] = dizi[i];
        }
        dizis[dizis.length - 1] = value;
        return dizis;
    }

    private static int[] remove(int[] dizi, int stack_0_queue_1) {
        int[] dizis = new int[dizi.length - 1];
        for (int i = stack_0_queue_1; i < dizi.length - 1 + stack_0_queue_1; i++) {
            dizis[i - stack_0_queue_1] = dizi[i];
        }

        return dizis;
* */


    /*
    private static void homework_last(){
        // write your code here
        //burada Liste olusturup icine
        // roma sayilarinin katsayi seklindeki halini atiyoruz

        var list = new ArrayList();

        list.add(100);
        list.add(50);
        list.add(10);
        list.add(5);
        list.add(1);

        for (int i = 1; i < 104; i++)
        {
//burada roma rakamlarina cevirirken kullandigimiz tutucuyu tanimliyoruz.
            StringBuilder char_hold = new StringBuilder();
            //önceki aradigimiz liste degerini tutar
            //bu sayede 4 defa tekrar eden 9 gibi degerleri VIIII yerine IX yazmayi sagliyoruz
            int previous_value = (int) list.get(0);
            //Burada kontol edecegimiz sayi icin tutucu olusturup tutucuya aktariyoruz
            int _temp_i = i;
            //burada Array listi dolasiyoruz buyukten>k
            for (var item_var :list) {


                //surekli '(int)' komutu ile islem kalabalikligini engelliyoruz
                //item degiskeni foreach ile cagirdigimiz elemani tutar
                int item=(int)item_var;
                //burada temp_i yani i tutucumuz itemdan buyuk mu diye kontrol ediyoruz
                //eger kucukse islem yapmasina gerek kalmayacak
                if (_temp_i >=  item) {
//_temp_i degiskeni item degiskenine kac defa bölunuyor buradan cikan deger
                    //tekrar sayisini verecek
                    int repeat_count = _temp_i /  item;


                    //basamak kontrol önemi : 1-90 a kadar 90 dahil sorunsuz hesaplar fakat
                    // 90+ söyle bir sorun cikar artik birler basamakli tekrarlardan
                    // 10lar basamakli tekrarlar basliyor ve artik sayi 3 basamakli sayi olma
                    // egilimi gösteriyor bu yuzden bizim sinirimiz olan 100'e
                    //yani sayinin 3. basamak haline yakin olan hallerinde
                    //91-92...99 sayilarini 3 basamakli muamalesi yapmamiz
                    //gerekir bu yuzden min degerim 91'e 9 eklerim bu sayede basamak sayim
                    //2'nin uzerine cikiyor
                    int number_of_digits  = ((_temp_i + 9) + "").length();
                    //burada sayinin 4 defa tekrari oldugu  durumlari göz
                    //önune aliyoruz burada yapacagimiz islem artik sayi 4. tekrari
                    // ile kendinden buyuk olan listedeki elemanla birlikte ters sekilde yazilmasi
                    // 9 sayisi = VIIII burada 3'den fazla 'I' kullanimla durumu oluyor
                    //bunu asmak icin sayiyi IX  seklinde yani kucuk buyuk seklinde yazmamiz gerekiyor
                    // bu yuzden kendisinden %10 kucuk sayiyi buluyoruz
                    // 9x icin => 10x-(10x/10x) = 9x cikacaktir
                    int four_again = (previous_value - previous_value / 10);
                    //burada four_again katsayi duzenini bozmamasi cikarilacak sayiyi bulmamizi
                    //saglayan mod degerini buluyoruz
                    //örnek : 10 100 icin %10 luk kisim 10'un katlari seklinde giderken
                    //50 sayisinda %10 luk kismi 5 olarak gidiyor bu sayilari cikardigimizda
                    //10 icin 1 ve yeni sayimiz 9 (tekrari 4 olan big sayi)
                    //100 icin 10 ve yeni sayi 90
                    //50 icin 5 ve yeni sayi 45
                    //burada 45 sayisi yanlis degerleri getireceginden 5 sayisindan kurtulmak gerekiyor
                    //sayinin buyuk yani 450 gibi bir degerde de 50 sayisindan kurtulmamizi saglacak olan
                    // math pow kutuphanesinden yararlaniriz
                    int mod =(int) Math.pow(10,(_temp_i+"").length()-1);
//burada mod degerimizi bulduktan sonra sayimizda gereksiz gördugumuz bir deger var mi bakiyoruz
                    //1-100 arasindaki deger 45
                    if (mod > 1 && four_again % mod != 0)
                        four_again -= four_again % 10;
                    //burada 9 19 ... gibi degerlerler var ise bu degerleri ust sayiyi ile kucuk buyuk seklinde yaziyoruz
                    // veya
                    // //burada yukarda tuttugumuz basamak sayisi ve four again +10 yani
                    // 90 ustu icin 3. basamaga cikaracak 10 sayisi ve
                    //basamak sayisinin 3 ve ustu  oldugunu dogrulayacak olan basamak tutucumuzu sorguluyoruz
                    //2 durumdada ayni islem yapildigi icin kodlar birlestirildi


                    if ((four_again == _temp_i)
                            || (four_again + 10 > _temp_i && number_of_digits > 2))
                    {
                        //Methoda önceki liste degeri- cikarimda bulundugumuz sayiyi sol tarafa
                        //9 icin previous_value=10 , four_again=9
                        //sol tarafa 10-9 =1 i yani 'I'
                        //sag tarafa 10 yani bir buyuk sayimiz olan X
                        char   left = convert_Method(previous_value - four_again);
                        char right = convert_Method(previous_value);
                        //ekleme yaptigimiz 9 icin
                        //IX olur
                        char_hold.append(left).append(right);
                        _temp_i -= four_again;
                    }
                    else if (repeat_count > 3)
                    {
                        //4 den fazla tekrar eden ve
                        //4-14-24 gibi olan sayilari yazimi tekrar sayisi 4 olan
                        // ve 9-19... sayilarindan haric durumlari kullanilan Roma karakterlerin yerini degistirir
                        //4 sayisi IIII ile ifadesi mumkun olmadigindan IV yani kucuk buyuk
                        char left=convert_Method(item);
                        char right=convert_Method(previous_value);
                        char_hold.append(left).append(right);
                        //char tutucusuna attiktan sonra  tekrar kadar item kadar degeri _temp_i den cikariyoruz
                        _temp_i -= repeat_count * item;
                    }
                    else {
                        //durum saglaniyorsa gönderdigimiz gecerli liste degerini
                        // itemi gonderir gelen degeri  tekrar sayisi kadar char tutucumuza ekliyoruz
                        char_hold.append((convert_Method(item) + "").repeat(repeat_count));
                        //char tutucusuna attiktan sonra  tekrar kadar item kadar degeri _temp_i den cikariyoruz
                        _temp_i -= repeat_count *  item;
                    }


                }
                //sayiyi tutuyoruz
                previous_value =  item;
            }
            //excelde test icindir copy paste
            //  System.out.print(char_hold+"\t");

            //duzgun bir görunum icindir
            System.out.print(char_hold);

            System.out.println(" ".repeat(15-char_hold.length()) +"=>= " + i);
        }
        //method ile gelen sayiyi switch icinde hangi karaktere ait oldugunu buluyoruz ve
        // o degeri dönduruyoruz
        private static char convert_Method(int num) {
            return switch (num) {
                case 1 -> 'I';
                case 5 -> 'V';
                case 10 -> 'X';
                case 50 -> 'L';
                case 100 -> 'C';
                case 500 -> 'D';
                case 1000 -> 'M';
                default -> '-';
            };

        }

    }
    */


