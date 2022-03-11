package com.hataysoftware;

import java.util.ArrayList;
import java.util.List;

public class work_3 {
   private static class molecule
    {
          String e;
         boolean b;
         molecule (String _e,boolean _b)
         {
             this.e=_e;
             this.b=_b;
         }
    }
    public static void run() {
        //"{“KOH” “H2O2” “NaCl” “NaOH” “COH804” “MgOH” } ";
        ArrayList list = new ArrayList();


        list.add(new molecule("KOH",false));
        list.add(new molecule("H2O2",false));
        list.add(new molecule("NaCl",false));
        list.add(new molecule("NaOH",false));
        list.add(new molecule("COH804",false));
        list.add(new molecule("MgOH",false));
        for (int i = 0; i < list.toArray().length; i++) {
molecule item=        (molecule) list.get(i);

      System.out.println(
              item.e.substring(
                      item.e.length()-2)=="OH"?
                      item.e +" OH ile biter":
                      item.e+" OH ile bitmez.");
        }



    }
}
