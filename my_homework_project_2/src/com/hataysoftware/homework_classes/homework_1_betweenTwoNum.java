package com.hataysoftware.homework_classes;

import java.util.Scanner;

public class homework_1_betweenTwoNum {

   public static void betweenTwoNum(int tempRead,int tempRead2,int nextTempNum){
        if (tempRead>tempRead2)
        {
        System.out.println(bewteenTwoNumRecursive(tempRead,tempRead2,nextTempNum,0));
        }
       else
       {
         System.out.println(  bewteenTwoNumRecursive(tempRead2,tempRead,nextTempNum,0));
       }
    }
       private static int bewteenTwoNumRecursive(int tempBig,int tempSmall,int next,int total){
       if (tempSmall>tempBig)return total;
      total+=tempSmall;
       return  bewteenTwoNumRecursive(tempBig,tempSmall+next,next,total);
    }
}
