package com.hataysoftware;

import com.hataysoftware.inh.teacher;

public class student {
    private String name;    // öğr adı
    private String id;        // öğr no
    private double credits;    // AKTS toplamı

    public student(String fullName, String studentID)  //constructor (burası default değerler için)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    public String get_Student_Name() {
        return name;
    }

    public void set_Student_Name(String new_name) {
        name = new_name;
    }

    public String get_Student_No() {
        return this.id;
    }

    public void set_Student_Point_Plus(int new_point) {
        credits += new_point;
    }

    public void control_Student() {
        if (credits >= 240) {
            System.out.println("Akts: " + this.credits+ " *Mezun");
        } else {
            System.out.println("Akts: " + this.credits+  " *Mezun değil");
        }
    }
}


