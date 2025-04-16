package MaiTienThanh.src.com.vti.backend.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements ITuyenSinh{
    private List<ThiSinh> danhSach = new ArrayList<>();
    @Override
    public void themThiSinh(ThiSinh thiSinh) {
        danhSach.add(thiSinh);
    }

    @Override
    public void hienThi() {
        for (ThiSinh thiSinh : danhSach) {
            System.out.println(thiSinh);
        }
    }

    @Override
    public ThiSinh timKiemTheoSBD(String soBaoDanh) {
        for (ThiSinh thiSinh : danhSach) {
            if (thiSinh.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
                return thiSinh;
            }
        }
        return null;
    }
}
