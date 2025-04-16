package com.vti.entity;

public class Student {

    private final int DEFAULT_ID = 0;

    private int id;
    private String name;
    private String hometown;
    private float diemHocLuc;

    public Student(String name, String hometown) {
        this.id = DEFAULT_ID;
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public float getDiemHocLuc() {
        return diemHocLuc;
    }

    public void setDiemHocLuc(float diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }

    public void congDiem(float diemCong) {
        this.diemHocLuc += diemCong;
    }


    public void screen() {
        System.out.println("Ten: " + this.name);
        if (this.diemHocLuc <= 4) {
            System.out.println("Hoc luc yeu");
        } else if (this.diemHocLuc > 4 && this.diemHocLuc <= 6) {
            System.out.println("Hoc luc trung binh");
        } else if (this.diemHocLuc > 6 && this.diemHocLuc <= 8) {
            System.out.println("Hoc luc kha");
        } else {
            System.out.println("Hoc luc gioi");
        }
    }
}
