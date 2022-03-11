package homework_3_folder;

public class homework_2 {
    //Main
    public void homework_2(int temp_1, int temp_2) {
        //int temp_1=99;
        //   int temp_2=99;
      homework_1 work1=new homework_1();

        if (temp_1 % bastop(temp_1) == 0 && temp_2%bastop(temp_2)==0 && work1.homework_1(temp_1,temp_2)) {
System.out.println(temp_1+" ve "+temp_2+" Dost Niven Sayısıdır.");
        }
    }

    private static int bastop(int temp_1) {
        String basamak = "" + temp_1;
        int basamak_toplam = 0;
        for (int b = 0; b < basamak.length(); b++)
            basamak_toplam += Integer.parseInt(basamak.charAt(b) + "");
        return basamak_toplam;
    }
}
