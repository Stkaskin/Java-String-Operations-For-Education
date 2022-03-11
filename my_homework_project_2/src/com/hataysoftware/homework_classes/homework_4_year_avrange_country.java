package com.hataysoftware.homework_classes;

public class homework_4_year_avrange_country {
    public  void  year_avrange_country(){
   System.out.println( "Bileşke yıl sayısı: "+    resultantRecursive((79814871),0));
    }
    private static int resultantRecursive(int temp,int year){
if (temp>=100000000) return year;
System.out.println(temp*(0.0135));
        temp+= (int)(temp*(0.0135));
        return resultantRecursive(temp,year+1);

    }
}
