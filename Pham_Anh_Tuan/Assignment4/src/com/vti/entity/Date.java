package com.vti.entity;

public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter cho Day
    public int getDay() {
        return day;
    }

    // Getter cho Month
    public int getMonth() {
        return month;
    }

    // Getter cho Year
    public int getYear() {
        return year;
    }

    // Setter cho Day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter cho Month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter cho Year
    public void setYear(int year) {
        this.year = year;
    }

    // Kiểm tra năm nhuận
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Date[day=" + day + ", month=" + month + ", year=" + year + "]";
    }
}

