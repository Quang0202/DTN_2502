package com.vti.backend;

public class KySu extends CanBo{
    private String nganhdaotao;

    public KySu(String nganhdaotao, String fullName, int age, Gender gender, String address) {
        super(fullName, age, gender, address);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhdaotao='" + nganhdaotao + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
