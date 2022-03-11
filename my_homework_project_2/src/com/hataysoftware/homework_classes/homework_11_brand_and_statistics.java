package com.hataysoftware.homework_classes;

import java.util.Random;
import java.util.Scanner;

public class homework_11_brand_and_statistics {
    public static void brand_and_statistics(){

        //marka ocak subat mart
        String[][] array=new String[10][4];
int[] adana=new int[10];

        int mark=1;
        int jan=0;
        int feb=0;
        int march=0;
array=newRow(array,0,"Marka"," Ocak"," Şubat","Mart");

   for (int i=1;i<10;i++){
       Random random=new Random();

       array=newRow(array,i,"Marka"+i+"",(random.nextInt(7000)+1000)+"",(random.nextInt(7000)+1000)+"",(random.nextInt(7000)+1000)+"");

   }
        tableShow(array);
   System.out.println(
           "Tabloyla İlgili Yapmak İstedğiniz işlem nedir? İşlemler :\n"+
                   "1. Her marka için 3 aylık satış toplamı nedir? \n"+
                   "2. Her ay için tüm markaların satış toplamları nelerdir? \n"+
                   "3. Her marka için en çok satışın gerçekleştirildiği ay hangisidir? \n"+
                   "4. Her ay için en çok satışın gerçekleştirildiği marka hangisidir?  \n"+
                   "5 Tüm marka ve tüm aylar için otomobil satışları toplamı nedir?\n"

   );
        Scanner read =new Scanner(System.in);

   switch (read.nextInt()){

       case 1:ask1(array);
       case 2:ask2(array);
       case 3:ask3(array);
       case 4:ask4(array);
       case 5:ask5(array);

        default:break;
   }
   //     ask5(array);






    }

    private static String readRow(String[][]array,int index,int column){
return array[index][column];

    }
    private static String[][] newRow(String[][] array,int index,String mark,String jun,String feb,String march){
       array[index][0]=mark;

       array[index][1]=jun;
       array[index][2]=feb;
       array[index][3]=march;
        return array;
    }

    private  static void tableShow(String[][] array ){
        for (int i=0;i<10;i++){

            System.out.println(""+readRow(array,i,0) +"\t|"+readRow(array,i,1)+" \t|   "+readRow(array,i,2)+"\t|\t"+readRow(array,i,3));
       System.out.println("----------------------------------------");
        }
    }
    private  static void ask1(String[][] array ){
        for (int i=1;i<10;i++){

            int j1=(Integer.parseInt( readRow(array,i,1)));
            int f1=(Integer.parseInt( readRow(array,i,2)));
            int m1=(Integer.parseInt( readRow(array,i,3)));

            System.out.println(readRow(array,i,0)+" Markası İçin 3 Aylık Satış Toplamı : "+(m1+j1+f1));

        }

    }
    private static void ask2(String[][] array){
        int tj1=0;
        int tf1=0;
        int tm1=0;
        for (int i=1;i<10;i++){
            tj1+=(Integer.parseInt( readRow(array,i,1)));
            tf1+=(Integer.parseInt( readRow(array,i,2)));
            tm1+= (Integer.parseInt( readRow(array,i,3)));
        }
        System.out.println("Ocak ayı tüm firmalar Satış Toplamı : "+tj1);
        System.out.println("Şubat ayı tüm firmalar Satış Toplamı : "+tf1);
        System.out.println("Mart ayı tüm firmalar Satış Toplamı : "+tm1);

    }
private  static void ask3(String[][] array){
    int tj1=5;
    int tf1=7;
    int tm1=9;

    for (int i=1;i<10;i++){

        tj1=(Integer.parseInt( readRow(array,i,1)));

        tf1=(Integer.parseInt( readRow(array,i,2)));

        tm1= (Integer.parseInt( readRow(array,i,3)));
        String answer=tj1>tf1 ?"Ocak":tf1>tm1?"Şubat":tj1>tm1?"Ocak":"Mart";
        System.out.println(array[i][0]+" İçin En Çok Satış Yaptığı Ay :"+""+answer);
    }

}
    private  static void ask4(String[][] array){
        int tj1=5;
        int tf1=7;
        int tm1=9;
int[][] temp=new int[3][3];


        for (int i=1;i<10;i++){

            tj1=(Integer.parseInt( readRow(array,i,1)));
          if (tj1>temp[0][2])
          {
              temp[0][2]=tj1;
              temp[0][1]=i;
          }
            tf1=(Integer.parseInt( readRow(array,i,2)));
            if (tf1>temp[1][2])
            {
                temp[1][2]=tf1;
                temp[1][1]=i;
            }
            tm1= (Integer.parseInt( readRow(array,i,3)));
            if (tm1>temp[0][2])
            {
                temp[2][2]=tm1;
                temp[2][1]=i;
            }

        }
        System.out.println("Ocak ayında en çok satış :"+ readRow(array,temp[0][1],0));
        System.out.println("Şubat ayında en çok satış :"+ readRow(array,temp[1][1],0));
        System.out.println("Mart ayında en çok satış :"+ readRow(array,temp[2][1],0));
    }
    private  static void ask5(String[][] array){
        int tj1=0;


        for (int i=1;i<10;i++){

            tj1+=(Integer.parseInt( readRow(array,i,1)))+
                    (Integer.parseInt( readRow(array,i,2)))+
                    (Integer.parseInt( readRow(array,i,3)));





        }
        System.out.println("Tablodaki Toplam Satış \t: "+tj1);

    }

    }

