package com.hataysoftware.homework_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class homework_3_term_total {
    public   static  void temTotal(){
int[] arrayTemp=  arrayFindRecursive(new int[30],0);
System.out.println(totalTemRecursive(arrayTemp,0,0));

    }

    private static int totalTemRecursive(int[] arrayTemp,int index,int totalTemp){

        if (arrayTemp.length==index)return totalTemp;
        totalTemp += arrayTemp[index]+arrayTemp[index+1];
        return    totalTemRecursive(arrayTemp,index+2,totalTemp);
    }

    private  static  int[] arrayFindRecursive(int @NotNull [] arrayTemp, int startIndex){
        Random random=new Random();
        if (startIndex==arrayTemp.length)return arrayTemp;
        arrayTemp[startIndex]=random.nextInt(5,25);
        System.out.println(startIndex+":"+arrayTemp[startIndex]);
       return arrayFindRecursive(arrayTemp,startIndex+1);
    }
}
