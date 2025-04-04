package com.vti.backend;

public class CongNhan extends CanBo{
    private int rank;

    public CongNhan(int rank, String fullName, int age, Gender gender, String address) {
        super(fullName, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "rank=" + rank +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
