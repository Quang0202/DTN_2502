import java.util.*;

public class QLCB {
    private List<CanBo> danhSachCB = new ArrayList<>();

    public void themCanBo(CanBo cb) {
        danhSachCB.add(cb);
    }

    public void timKiemTheoTen(String ten) {
        for (CanBo cb : danhSachCB) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin();
            }
        }
    }

    public void hienThiDanhSach() {
        for (CanBo cb : danhSachCB) {
            cb.hienThiThongTin();
            System.out.println("---");
        }
    }

    public void xoaTheoTen(String ten) {
        danhSachCB.removeIf(cb -> cb.getHoTen().equalsIgnoreCase(ten));
    }
}
