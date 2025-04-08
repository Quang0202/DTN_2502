package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float diem;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diem = 0;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void congthemDiem(float themdiem){
        this.diem += themdiem;
    }

    public void thongtinSv(){
        String hanhkiem;
        if(diem < 4){
            hanhkiem = "Yeu";
        } else if (diem < 6) {
            hanhkiem = "Trung Binh";
        } else if (diem < 8) {
            hanhkiem = "Kha";
        } else {
            hanhkiem = "Gioi";
        }
    System.out.println("id "+ id + " name "+ name + " hometown "+ hometown + " diem "+ diem + " hanh kiem " + hanhkiem);
    }

    @Override
    public String toString() {
        String hanhkiem;
        if(diem < 4){
            hanhkiem = "Yeu";
        } else if (diem < 6) {
            hanhkiem = "Trung Binh";
        } else if (diem < 8) {
            hanhkiem = "Kha";
        } else {
            hanhkiem = "Gioi";
        }
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", diem=" + diem +
                ", hanh kiem=" + hanhkiem +
                '}';
    }
}
