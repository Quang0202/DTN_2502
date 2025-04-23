package backend;
import java.util.Date;

import entity.Student;

@SuppressWarnings("deprecation")
public class Exercise2 {
//    Question 1: @Deprecated
//    Khai báo 1 instance có datatype Date và có value là ngày 18/05/2020.
//    Bạn sẽ thấy java cảnh báo, hãy tắt cảnh báo này đi
    public void question1() {
        Date date = new Date(120, 4, 18); // Deprecated constructor
        System.out.println("Deprecated Date created: " + date);
    }

//    Question 2: @Deprecated
//    Tạo 1 class student id, name với id là int và tự động tăng
//    B1: Sau đó tạo getter cho id
//    B2: Tại main() method, ta sẽ tạo instance của student có name
//= "Nguyễn Văn A" và in ra tên của student.
//    B3: Sau đó hệ thống thay đổi method getter của id, bạn sẽ phải
//    tạo ra getter cho id như sau (viết thêm method sau vào)
//    Method sẽ return ra String là "MSV: " + id (nghĩa là
//thêm chữ MSV vào trước id
//        B4: bạn sẽ đánh dấu method default getter (ở bước 1) là cũ và
//    tạo comment để những người sau sẽ sử dụng method mới (là
//                                                                  method ở bước 3)
//    B5: tại method main() viết thêm demo sử dụng method getter
//    mới này (không xóa code cũ đi)
    public void question2() {
        Student student = new Student("Nguyễn Văn A");
        System.out.println("Name: " + student.getName());
        System.out.println("Old Getter ID: " + student.getId());
        System.out.println("New Getter ID: " + student.getFormattedId());
    }
}
