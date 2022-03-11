package com.hataysoftware.homework_classes;

public class homework_2_harshad_numbers {
    public   static  void hardhas_numbers (){
hardhas_numbersRecursive(1,999);
    }
    private  static void hardhas_numbersRecursive(int tempMin,int tempMax){
        if (tempMin>=tempMax);
        String a="123";

       // System.out.println(a.length());
        findHarshardRecursive(charSendToIntRecursive(0,1+"",0),1,999);

  //      for (int i=a.toCharArray().length)
    }
    private  static  int charSendToIntRecursive(int index,String tempNum,int total){



      if (index==tempNum.length())return total;
        total+=  Integer.parseInt( tempNum.charAt(index)+"");
        return charSendToIntRecursive(index+1,tempNum,total);
    }
    int a=0;
    private  static void findHarshardRecursive(int bolen,int bolunen,int max){

if (bolunen%bolen==0)
    System.out.println(bolunen);

  if (bolunen!=max-1)
      findHarshardRecursive(charSendToIntRecursive(0,(bolunen+1)+"",0),bolunen+1,max);

    }


}
