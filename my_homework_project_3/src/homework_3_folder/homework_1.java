package homework_3_folder;

import java.util.ArrayList;

public class homework_1 {
//MAİN
    public static boolean homework_1( int temp_1, int temp_2) {
      //int temp_1=99;
        //   int temp_2=99;
        if (bolenleribul(temp_1) == temp_2 && bolenleribul(temp_2) == temp_1)
        {
            System.out.println(temp_1 + " ve " + temp_2 + " Dost Sayılardır");
         return true;
        }
    //else
       System.out.println(temp_1 + " ve " + temp_2 + " Düşman Sayılardır");
        return false;
    }

    private static int bolenleribul(int orj_num) {
        ArrayList numbers = new ArrayList();

        int temp_num = orj_num;

        int temp_divide = 2;
        while (temp_num != 1) {
            //&& temp_divide <= temp_num sonradan eklendi
            if (temp_num % temp_divide == 0 && temp_divide < orj_num) {
                numbers.add(temp_divide);
                temp_num = temp_num / temp_divide;
            } else {
                temp_divide++;
            }
        }

        ArrayList list = tekrarlanan(numbers);

        numbers = aynilarisil(numbers);
        //sayıyı kendisi haric diğer tekrar etmeyen sayılarla çarpıyor
        int num_size = numbers.size();
        for (int c = 0; c < num_size; c++)
            for (int i = 0; i < num_size; i++) {

                if (i != c) {
                    int temp = (int) numbers.get(i);
                    int tempc = (int) numbers.get(c);
                    numbers.add(temp * tempc);
                }
            }
        numbers = aynilarisil(numbers);
        num_size = numbers.size();
        while (list.size() > 0)
            for (int c = 0; c < list.size(); c++) {
                tekrarla_carp(num_size, numbers, (int) list.get(c), orj_num);
                list.remove(c);


            }
        numbers = aynilarisil(numbers);
        numbers.add(1);

        int toplam = 0;
        for (int i = 0; i < numbers.size(); i++) {
            toplam += (int) numbers.get(i);
            System.out.println(numbers.get(i));
        }
        return toplam;
    }

    private static ArrayList tekrarlanan(ArrayList numbers) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int c = i; c < numbers.size(); c++) {
                if (numbers.get(c) == numbers.get(i)) {
                    count++;
                    if (count >= 2) {
                        list.add(numbers.get(c));
                        break;
                    }


                }
            }

        }
        return list;
    }

    private static void tekrarla_carp(int num_size, ArrayList numbers, int tempc, int max) {
        for (int i = 0; i < num_size; i++) {
            int temp = (int) numbers.get(i);
            if (temp * tempc < max) {
                numbers.add(temp * tempc);

            }


        }

    }

    private static ArrayList aynilarisil(ArrayList numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int c = i; c < numbers.size(); ) {
                int temf = (int) numbers.get(c);
                int temd = (int) numbers.get(i);

                if (temf == temd && i != c) {


                    numbers.remove(c);
                    c--;
                }
                c++;
            }

        }
        return numbers;
    }

}
