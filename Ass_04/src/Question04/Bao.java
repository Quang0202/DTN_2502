package Question04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bao extends TaiLieu{
    private int NgayPhatHanh;



    public Bao() {

    }

    public Bao(int ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;

    }

    public Bao(String NXB, int SoBanXuatHanh, String maTaiLieu, int ngayPhatHanh) {
        super(NXB, SoBanXuatHanh, maTaiLieu);
        NgayPhatHanh = ngayPhatHanh;

    }

    public int getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }



    @Override
    public String toString() {
        return "Bao{" +
                "NgayPhatHanh=" + NgayPhatHanh +
                "} " + super.toString();
    }
}
