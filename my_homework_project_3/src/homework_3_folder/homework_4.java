package homework_3_folder;

import java.util.ArrayList;

public class homework_4 {
    //main
    public static void homework_4(int temp_1)
    {
        //int temp_1=99;

        for (int i=temp_1-1;i>=2;i--){
        ArrayList list=homework_4_funtion_1(i);

        if (list.size()==0){
            System.out.println(i);
            break;
        }
        }
//        for (int i=0;i<list.size();i++)
//        {
//            int temp=(int)list.get(i);
//            if (big_num<temp)
//                big_num=temp;
//        }
      //  System.out.println(big_num);
    }
    private static ArrayList homework_4_funtion_1(int orj_num) {
        ArrayList numbers = new ArrayList();

        int temp_num = orj_num;

        int temp_divide = 2;
        while (temp_num != 1 && temp_divide < orj_num) {
            if (temp_num % temp_divide == 0) {
                numbers.add(temp_divide);
                temp_num = temp_num / temp_divide;
                break;
            } else {
                temp_divide++;
            }
        }
     //   numbers = aynilarisil(numbers);

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
