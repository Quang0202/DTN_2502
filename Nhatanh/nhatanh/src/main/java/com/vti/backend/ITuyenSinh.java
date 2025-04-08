package com.vti.backend;

public interface ITuyenSinh {

//    b) Xây dựng interface ITuyenSinh và class TuyenSinh có các chức năng:
//    a. Thêm mới thí sinh.
//    b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//    c. Tìm kiếm theo số báo danh.
//    d. Thoát khỏi chương trình.

    void addStudent(ThiSinh thiSinh);
    void displayStudentInfo();
    void findStudent(String id);
}
