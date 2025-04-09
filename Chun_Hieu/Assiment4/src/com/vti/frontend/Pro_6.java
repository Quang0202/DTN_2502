package com.vti.frontend;

import com.vti.entity.VietnamesePhone;

public class Pro_6 {
    public static void main(String[] args) {
        VietnamesePhone vt = new VietnamesePhone();
        vt.insertContact("Nguyen van a","4243243432");
        vt.searchContact("Nguyen van a");
    }
}
