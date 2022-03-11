package com.hataysoftware;

public class Main {

    public static void main(String[] args) {
	// write your code here
      //  us(2,3,1);
       String yazi="ALA";
        String gelen=pal(yazi.length()-1,yazi,"");

     //System.out.println(ntop(2,0));
 /*       int x=0,y=3,tut;
        if (y<x)
   {
       tut=y;
       y=x;
       x=tut;


    System.out.println(x_y_top(y,x,0));
       }*/

    }
    private static int x_y_top(int big,int small,int toplam)
    {
        if (big==small){
            return toplam;
        }
        toplam+=big;

        return x_y_top(--big,small,toplam);
    }
    private static int ntop(int bas,int toplam)
    {
        if (bas==0)return toplam;
        toplam+=bas;

        return ntop(--bas,toplam);
    }
    private static int us (int taban,int us,int toplam){
        if (us ==0){
            System.out.println(toplam);
            return  toplam;}

        toplam*=taban;

        return  us(taban,--us,toplam);
    }
    private static String pal(int sonindex,String orj_text,String send_text )
    {

        if (sonindex==-1 )
        {
            System.out.println(send_text);
            if (orj_text.equals(send_text))
            {
                System.out.println("Pal sayi"
                );
            }
            return "";
        }
        send_text+=orj_text.charAt(sonindex)+"";

        return pal(--sonindex,orj_text,send_text);
    }
}
