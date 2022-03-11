package com.hataysoftware.homework_classes;

public class homework_10_payToInternetCafe {
    public static void pay_to_internet_cafe(int munite,int hour,int teaTemp,int colaTemp){

         if (hour/3 >teaTemp)System.out.println("Yanlış Çay Bilgisi");
         else {
     double total=0;
     if (hour==1) total=hour*5/*+(munite*0.083333333333333333)*/;
     else if (hour>=2 && hour<=4)total=5+((hour-1)*4)/*+(munite*0.0666666666666667)*/;
     else if (hour>=5)total= 5+12 + ((hour-4)*3)/*+(munite*0.05)*/;
     //colaTemp/3
    total+=(teaTemp-(hour>3?hour-3:0)+((colaTemp-(colaTemp/3))));
   System.out.println( total);
         }
    }

}
