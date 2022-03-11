package homework_3_folder;

import java.util.ArrayList;

public class homework_6 {
    //main
    public void homework_6() {
        for (int i = 4; i < 10000; i++) {

            ArrayList list = homework_6_funtion_1(i);
            if (list.size() > 1) {
                int temp_carpanlartoplam = 0;
                for (int c = 0; c < list.size(); c++) {
                    temp_carpanlartoplam += bastop((int) list.get(c));

                }
                int basamak_toplam = bastop(i);
                if (basamak_toplam == temp_carpanlartoplam)
                    System.out.println(i);
            }
        }
    }

    private static int bastop(int temp) {
        String basamak = "" + temp;
        int basamak_toplam = 0;
        for (int b = 0; b < basamak.length(); b++)
            basamak_toplam += Integer.parseInt(basamak.charAt(b) + "");
        return basamak_toplam;
    }


    private static ArrayList homework_6_funtion_1(int orj_num) {
        ArrayList numbers = new ArrayList();

        int temp_num = orj_num;

        int temp_divide = 2;
        while (temp_num != 1 && temp_divide < orj_num) {
            if (temp_num % temp_divide == 0) {
                numbers.add(temp_divide);
                temp_num = temp_num / temp_divide;
            } else {
                temp_divide++;
            }
        }
        //    for (int i=0;i<numbers.size();i++)System.out.println(numbers.get(i));
        return numbers;
    }
}
