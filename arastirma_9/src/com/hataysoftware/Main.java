package com.hataysoftware;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {




    public static String temp_q = "adana";
    public static StringBuilder answer = new StringBuilder();
    public static int hak = 5;
    public static long time = 10;
    public static boolean lose = false;
    public static      Timer task=new Timer();

    public static void main(String[] args) {

        // write your code here

     task.schedule(new Program(),1,9999999);

    }

    static class Sure extends TimerTask {
        public void run() {
            var ass = (System.currentTimeMillis());
            var times = (ass - time) / 1000;
            if (times == 10) {
                System.out.println("Süreniz Bitti \n" +
                        "Kaybettiniz.");
                lose = true;

                this.cancel();
                task.cancel();
            }




        }
    }
    private static class Program extends TimerTask {
        @Override
        public void run() {
            answer = new StringBuilder("_".repeat(temp_q.length()));

            Scanner scanner = new Scanner(System.in);
            Timer timer = new Timer();


            System.out.println("Süreniz İlk cevabınızdan Sonra başlayacak: ");


            for (; ; ) {
                System.out.println("Çıkan Sonuç : " + answer + " Hak:" + hak);
                System.out.print("Harf Girin:");
                boolean torf = false;
                char scan = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
                if (answer.toString().split(scan + "").length == 1)
                    for (int i = 0; i < temp_q.length(); i++) {
                        if (temp_q.charAt(i) == scan) {
                            answer.setCharAt(i, scan);
                            torf = true;
                        }

                    }
                else {
                    System.out.println("Aynı Harfi terkrar giremezsiniz . Süreniz azalmaya devam ediyor . ");
                }
                if (lose)
                    break;
                if (!torf) {
                    hak--;
                    if (hak == 0) {
                        timer.cancel();
                        this.cancel();
                        System.out.println("Kaybettiniz.");

                        break;
                    }
                } else if (temp_q.equals(answer.toString())) {
                    timer.cancel();
                    System.out.println("Kazandın");
                    this.cancel();
                    break;
                }

                time = System.currentTimeMillis();
                timer.schedule(new Sure(), 1, 1000);


            }
        }
    }
}
