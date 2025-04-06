package com.vti.backend;

public class NhanVien extends CanBo {
    private String congviec;

    public NhanVien(String congviec, String fullName, int age, Gender gender, String address) {
        super(fullName, age, gender, address);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congviec='" + congviec + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
