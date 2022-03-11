package com.hataysoftware;

import java.util.Scanner;

public class work_2 {
    private  static void ff(){
        //program yanyana gelen ayni karakterleri kaldirir
        // aslaan > asln > kendini yanyana tekrar etmeyen karakter dizisi
        Scanner scanner=new Scanner(System.in);
        System.out.print("Cümle veya kelime giriniz :");
        String text =scanner.nextLine();

        /*
        excel_test_alg.
        	text	rem	i	next	nv	s1	s2	s3		tf
           	aaddaa  	a	0	1	a	0	1	2		f
	        addaa	    a	0	1	d	1				t	>index-remove
	        ddaa	    d	0	1

        */
//remove_char aranıp yanyana olanları silecegimiz karakter tutucumuz
        char remove_char = ' ';
        //arama yaptiktan sonra arama sonucu olarak bool degiskeni gerekecek
        //eger aramada sonraki ile onceki aynı ise sonrakini text'ten cikaracak ve search_succes true olacak
        //ayni olanlar bittikten else if'te search_succes ==true olma durumunda remove_char degiskeninin ilk tutuldugu index
        //yani arama deg. silinecek
        //aadana   ilk indexteki deger 'a' sonraki 'a' > sonrakini siliyoruz
        //adana >> fakat ikiside yanyana oldugu icin ilk 'a' degeri silinmesi gerekecek bunun icin
        //buda search_succes_ true yaptik ve son defa for icinde onu for disinda bir kereye mahsus
        //kontrol edip true ise text'ten eleman cikaracagiz
        boolean search_succes_ = false;
        //text son indexi haric hepsini dolaniyoruz dongude tekrara ragmen dongu sonuna gelindi ise
        //son defa for disinda kontrol etmemiz gerekecek burada search_succes_ degiskeni global olmasindan
        //faydalanacagiz
        for (int i = 0; i < text.length() -1; i++)
        {
            //search_succes_ false durumlari: 1. donguye ilk girdiginde global olarak false tanimlidir bu yuzden false
            // 2. eger text'in char(i) ve  sonraki deger ile esitlik yok ise false olacaktir
            //false durumda remove_char degiskeni text char(i) indexindeki degerle esitlenir
            if(!search_succes_)  remove_char = text.charAt(i);
            //text char(i) ve sonraki text char(i+1) kontrolu yapiliyor
            if (remove_char==text.charAt(i+1))
            {
                //sorgu sonucu esitligi search_succes_ degiskenini true yaparak ilk indexin
                //en sonda silinecegini bildiriyoruz
                search_succes_=true;
                //burada sub stringin ilk indexi alip son indexi almamasini goz onunde bulundurarak
                //0 ile i ye kadar  aliyoruz ve i+1 den  sona kadar aliyoruz
                //ornek "ali" yazisindaki 'l' harfini silmek icin 'l' yi gormezden gelmemiz lazim
                //yani a alinacak i alinacak ayri ayri bu durumda 0'dan 1'e ve 2'den sona kadar almamiz gerekir

                //kendisini siler c 'a' aabbb > sonuc ayni cunku gecerli indexteki remove_char degeri degismiyor
                text=text.substring(0,i)+text.substring(i+1);
                //sagindakini siler ca 'a' abbb > sonuc ayni cunku gecerli indexteki remove_char degeri degismiyor
                //**   text=text.substring(0,i+1)+text.substring(i+2); //ayni sonuc

                //bir eleman eksiltigimiz icin i den de bir geri gitmemiz text char siralari degistiginden  tekrar kontrol etmemiz gerekir
                i--;
            }
            //eger eleman eksiltme olduysa ilk aramada buldugu indexide silmesi gerekecek bu durumda bu sorguyu kullanmak zorunda
            else if (search_succes_)
            {
                text=text.substring(0,i)+text.substring(i+1);
                search_succes_=false;
                //bir eleman eksiltigimiz icin i den de bir geri gitmemiz text char siralari degistiginden  tekrar kontrol etmemiz gerekir
                i--;
            }
        }
        // eger dizi boyut sinirina geldiyse ve search_succes_ true iken remove_char'i text'ten silmediyse
        //bu sorgu araciligi ile son kez kontrol yapiyoruz
        if (search_succes_==true)text=text.substring(0,text.length()-1);


        System.out.println(text);
    }
}
