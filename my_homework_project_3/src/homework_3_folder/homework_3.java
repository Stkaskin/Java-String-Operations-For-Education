package homework_3_folder;

import java.util.ArrayList;

public class homework_3 {
//Main
    public    void homework_3(int temp_num1,int temp_num2){
//        int temp_num1 = 20;
//        int temp_num2 = 419*547*283;
        int max;
        int min;
        if (temp_num1 > temp_num2) {
            max=temp_num1;
            min=temp_num2;
        }
        else
        {
            min=temp_num1;
            max=temp_num2;
        }
        //  ArrayList list = homework_3_funtion_1(170);
        ArrayList list1 = homework_3_funtion_1(temp_num2);
//        for (int i = 0; i < list.size(); i++) {
//            int temp = (int) list.get(i);
//            if (temp <=min && temp>=max)list.remove(i);
//        }
        for (int i = 0; i < list1.size(); i++) {
            int temp = (int) list1.get(i);
            if (temp <=min || temp>=max)
            {
                list1.remove(i);
                i--;
            }
        }
        for (int i=0;i<list1.size();i++)System.out.println(list1.get(i));
    }
    private static ArrayList homework_3_funtion_1(int orj_num) {
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
        numbers = aynilarisil(numbers);

        //    for (int i=0;i<numbers.size();i++)System.out.println(numbers.get(i));
        return numbers;
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
