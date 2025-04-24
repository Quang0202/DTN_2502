package Exercise1;

import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

    public void addThiSinh(ThiSinh thiSinh) {
        danhSachThiSinh.add(thiSinh);
    }

    public void displayThiSinhs() {
        for (ThiSinh ts : danhSachThiSinh) {
            ts.displayInfo();
        }
    }

    public void searchBySBD(String sbd) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.soBaoDanh.equalsIgnoreCase(sbd)) {
                ts.displayInfo();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh voi SBD: " + sbd);
    }
}