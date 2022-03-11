package com.hataysoftware.homework_classes;



public class homework_9_find_and_shred {
    public static void homework_9_find_and_shred(String  mail){


       int atIndex= findCharRecursive('@',mail,0);

       int dotIndex= findCharRecursive('.',mail.substring(0,atIndex+1),0);
       int dotEndIndex= findCharRecursive('.',mail.substring(atIndex+1),0);
     String error= errorMessageMail(atIndex,dotIndex,dotEndIndex,mail.length());
System.out.println(error);




    }
    private  static  int findCharRecursive(char foundTemp,String mailTemp,int index){
        if(mailTemp.length()==index)return -1;
        if(mailTemp.charAt(index)==foundTemp)
            return  index;
       return findCharRecursive(foundTemp,mailTemp,index+1);
    }
    private  static String errorMessageMail(  int atIndexTemp, int dotIndexTemp ,int dotEndTemp,int lastIndex){
        String errorMessage="";
        if (atIndexTemp==-1)
            errorMessage+="Hata#001 @ işareti kullanmadınız.\n";
        else if (atIndexTemp==0 || atIndexTemp==lastIndex)
            errorMessage+="Hata#009 @ işareti başa ve sona gelmez.\n";
        if (dotIndexTemp==-1)
            errorMessage+="Hata#002 Ad ve Soyad arasında  . (Nokta) işareti kullanmadınız.\n";
        if (dotEndTemp==-1)
            errorMessage+= "Hata#003  .xxx de Nokta kullanmadınız. (.xxx'deki Nokta işaretini kontrol ediniz) \n";
        else if (dotIndexTemp+1==atIndexTemp )
            errorMessage+= "Hata#007 @ işaretinden önce Nokta bulunamaz!.\n";
        if (atIndexTemp==0)
        errorMessage+="Hata#004 Ad ve Soyad Girmediniz!.\n";
        if(dotIndexTemp==0)
            errorMessage+="Hata#005 Ad Girmediniz!. \n";
        if (dotEndTemp==lastIndex)
            errorMessage+="Hata#006 Hatalı yazım .com bulunamadı.\n";

        if (dotEndTemp==atIndexTemp)
            errorMessage+= "Hata#008 @ işaretinden sonra Nokta bulunamaz!.\n";



        return " Geçerli  İçin Mail Eksikleriniz: \n"+errorMessage;
    }
}
