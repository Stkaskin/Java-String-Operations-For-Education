package com.hataysoftware.homework_classes;

public class homework_7_single_and_couple_string {
    public  static  void  single_and_couple_string(int temp){

        //tek diyince eşit çift diyince çiftler 1 fazla
        //9 = 5  10 =5- 6
        int maxIndex=(temp/2)+1;
        int[] tempArray=new int[temp+1];
         tempArray= singleCoupleRecursive(tempArray,0,-1,2,temp);
         tempArray=     singleCoupleRecursive(tempArray,maxIndex-1,(temp%2)+temp+2,-2,temp);
          int a=1;
    }
    private static  int[] singleCoupleRecursive(int[] array,int index, int start,int incrase,int max){
        if ((max<start+incrase && incrase>0) || start+incrase<0)
            return array;
        array[index]=start+incrase;
        System.out.print((index+1)+".sayi :"+array[index]+"   ");
        return singleCoupleRecursive(array,index+1,start,incrase<0?incrase-2:incrase+2,max);
    }
}
