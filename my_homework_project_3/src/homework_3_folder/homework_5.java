package homework_3_folder;

import java.util.ArrayList;

public class homework_5 {
    // write your code here
//MAİN
public static void homework_5( int temp_n){
    //N sayısı
   //11

    //int temp_n=9;
    int count=0;
    for (int i=2;;i++)
    {
        if(    homework_5_funtion_1(i)==0)
        {
            count++;
            if(count==temp_n){
            System.out.println("N. Asal sayı >>>> "+i+" <<<<");
            break;
            }
            else
            {
                System.out.println(i);
            }

        }

    }
}

    private static int homework_5_funtion_1(int orj_num) {
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
        return numbers.size();
    }
}
