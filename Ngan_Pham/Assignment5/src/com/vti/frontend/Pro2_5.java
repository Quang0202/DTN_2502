package com.vti.frontend;

import com.vti.entity.DienThoaiCoDien;
import com.vti.entity.DienThoaiThongMinh;

public class Pro2_5 {
    public static void main(String[] args) {
        DienThoaiThongMinh dtSmart = new DienThoaiThongMinh();
        DienThoaiCoDien dtClassic = new DienThoaiCoDien();

        System.out.println("=== Điện thoại thông minh ===");
        dtSmart.nghe();
        dtSmart.goi();
        dtSmart.guiTinNhan();
        dtSmart.nhanTinNhan();
        dtSmart.suDung3G();
        dtSmart.chupHinh();
        dtSmart.tanCongKeXau();

        System.out.println("\n=== Điện thoại cổ điển ===");
        dtClassic.nghe();
        dtClassic.goi();
        dtClassic.guiTinNhan();
        dtClassic.nhanTinNhan();
        dtClassic.ngheRadio();
        dtClassic.tanCongKeXau();
    }
}
