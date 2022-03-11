package com.hataysoftware;

public class meeting {
    private String time;
    private String location;
    private String subject;

    public meeting(String _time, String _location, String _subject) {

        this.time = _time;
        this.location = _location;
        this.subject = _subject;
    }


    public void setTime(String data) {
        this.time = data;
    }

    public String getTime() {
        return this.time;
    }

    public void setLocation(String data) {
        this.location = data;
    }

    public void setSubject(String data) {
        this.subject = data;
    }


    public String getSubject() {
        return this.subject;
    }

    public String getLocation() {
        return this.location;
    }

    public void printDetails() {
        System.out.println("Toplantının Konusu : " +
                this.subject + "\n" +
                "Toplantının Konumu : " + this.location + "\n" +
                "Toplantının Zamanı : " + this.time);
    }


}
