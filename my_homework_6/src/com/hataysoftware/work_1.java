package com.hataysoftware;

public class work_1 {
    private static void ff(){
       
       //ODEV 1 MAİN
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
    }

}
