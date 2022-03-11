package com.hataysoftware.homework_classes;

public class homework_5_ednless_desire
{

public  void endles_desire(){
    //endlessRecursive();

    while (true){
        System.out.println("Dünya Barışı");
    }
}
//soru : hocam recursive de recursive(recursive(recursive(recursive.....))); bir sınırı  var mı yok ise
    // neden recursive yapınca hata veriyor ?
private void endlessRecursive(){
    System.out.println("Dünya Barışı");
    endlessRecursive();
}
}
