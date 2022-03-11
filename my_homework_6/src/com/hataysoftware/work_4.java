package com.hataysoftware;

public class work_4 {
    private static void ff(){
        String text_t="bu bir tersten yazıdır";
        System.out.println("Normal hali: "+ text_t);
        System.out.println("Ters hali  : "+dondur_rec(text_t,"",text_t.length()-1));
    }
    private static String dondur_rec(String temp_Get,String temp_Send,int index)
    {
        if (index==-1)return temp_Send;
        temp_Send+=temp_Get.charAt(index);
        return dondur_rec(temp_Get,temp_Send,--index);
    }
}
