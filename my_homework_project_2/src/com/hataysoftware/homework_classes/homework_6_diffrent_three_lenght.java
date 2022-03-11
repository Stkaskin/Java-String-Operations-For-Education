package com.hataysoftware.homework_classes;

public class homework_6_diffrent_three_lenght {
    public static  void diffrent_three_lenght(){

        diffrentRecursive(100,999);
    }
    private static int diffrentRecursive(int min,int max){
        if (min==max) return 1;
        String tempMin=min+"";
System.out.print( tempMin.charAt(0)!= tempMin.charAt(1) && tempMin.charAt(0) != tempMin.charAt(2) && tempMin.charAt(1) != tempMin.charAt(2)?"\n"+tempMin:"");

      return diffrentRecursive(min+1,max);


    }
}
