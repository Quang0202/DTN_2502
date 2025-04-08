package com.company.backend.TestingSystem5;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements ITuyenSinh{
    private List<ThiSinh> danhSach = new ArrayList<>();
    @Override
    public void themThiSinh(ThiSinh ts) {
        danhSach.add(ts);
    }

    @Override
    public void hienThiThongTin() {
        for (ThiSinh ts : danhSach) {
            System.out.println(ts);
        }
    }

    @Override
    public ThiSinh timKiemTheoSBD(String soBaoDanh) {
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
                return ts;
            }
        }
        return null;
    }
}
