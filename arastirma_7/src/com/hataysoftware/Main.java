
package com.hataysoftware;
import com.hataysoftware.inh.*;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import  java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("******* 1");
        student student=new student("Ali","1");
        System.out.println("Öğrenci Adı = " +   student.get_Student_Name());
        System.out.println("Öğrenci No = " +   student.get_Student_No());

        student.set_Student_Point_Plus(240);
        student.set_Student_Name("Alihan");
        student.control_Student();
        System.out.println("*******  2");

        //2. ödev
meeting meet= new meeting("21:42","Ofis","Neden?");
        System.out.println("*Toplantının Zamanı = " + meet.getTime());
        System.out.println("*Toplantının Konusu = " + meet.getSubject());
        System.out.println("*Toplantının Konumu = " + meet.getLocation());



meet.setLocation("Okul");
meet.setSubject("Sonuç yok");
meet.setTime("22:00");
meet.printDetails();
        System.out.println();


        System.out.println("*******  3");

        ////3. ödev
        //student
        student_ student_work3=new student_("",1);
        student_work3.person("Ahmet",20);
        student_work3.setAkts(120);
        //teacher
        teacher teacher=new teacher("Satış Ve Pazarlama Sanatı",2005);
        teacher.person("Selim",90);
        teacher.calculator();


        System.out.printf(  "asdsa :"+rec(0));

 }
 private static int rec(int a){
        if (a==1 || a==0)
            return a;                           

        return a-1+rec(a-2);
 }
}
