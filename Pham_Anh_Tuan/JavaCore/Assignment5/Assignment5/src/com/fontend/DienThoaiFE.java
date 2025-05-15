package com.fontend;

import com.entity.DienThoaiCoDien;
import com.entity.DienThoaiDiDong;
import com.entity.DienThoaiThongMinh;

public class DienThoaiFE {
    public static void main(String[] args) {
        DienThoaiDiDong smartphone = new DienThoaiThongMinh();
        DienThoaiDiDong classicPhone = new DienThoaiCoDien();

        System.out.println("=== Điện thoại thông minh ===");
        smartphone.nghe();
        smartphone.goi();
        smartphone.guiTinNhan();
        smartphone.nhanTinNhan();
        ((DienThoaiThongMinh) smartphone).suDung3G();
        ((DienThoaiThongMinh) smartphone).chupHinh();
        smartphone.tanCongKeXau();

        System.out.println("\n=== Điện thoại cổ điển ===");
        classicPhone.nghe();
        classicPhone.goi();
        classicPhone.guiTinNhan();
        classicPhone.nhanTinNhan();
        ((DienThoaiCoDien) classicPhone).ngheRadio();
        classicPhone.tanCongKeXau();
    }
}
