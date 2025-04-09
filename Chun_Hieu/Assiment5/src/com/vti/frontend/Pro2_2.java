package com.vti.frontend;

import com.vti.entity.Student_2_2;

public class Pro2_2 {
    public static void main(String[] args) {
        Student_2_2 st = new Student_2_2();
        System.out.println("Nhập thông tin Sinh viên");
        st.inputInfor();
        System.out.println("Thông tin Sinh viên");
        st.showInfor();
        if(st.hocBong()){
            System.out.println("Sinh viên được nhận học bổng");
        }else {
            System.out.println("Sinh viên không được nhận học bổng");
        }
    }
}
