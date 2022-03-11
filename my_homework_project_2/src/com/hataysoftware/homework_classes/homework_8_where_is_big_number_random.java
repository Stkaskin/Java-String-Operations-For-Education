package com.hataysoftware.homework_classes;

import java.util.Random;

public class homework_8_where_is_big_number_random {
public void     where_is_big_number_random(){
System.out.println("\n"+"En Büyük Sayı "+(bigNumberRecursive(new int[10],0,0)+1)+" Sıradaki Sayıdır");
}
private static int bigNumberRecursive(int[] array,int bigIndex,int startIndex){
if(startIndex==array.length)return bigIndex;
    Random random=new Random();
array[startIndex]=random.nextInt(25)+5;
if (array[startIndex]>array[bigIndex])
    bigIndex=startIndex;
System.out.print((startIndex+1)+". : "+array[startIndex]+"  ");
    return bigNumberRecursive(array,bigIndex,startIndex+1);


}
}
