package com.vti.entity;

public class Date {
    private int date;
    private int month;
    private int year;

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear(){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
