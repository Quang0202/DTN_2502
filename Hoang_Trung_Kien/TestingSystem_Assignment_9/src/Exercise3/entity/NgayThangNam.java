package Exercise3.entity;

public class NgayThangNam {
    public int ngay, thang, nam;

    public class GioPhutGiay {
        public int gio, phut, giay;

        public void xuatThongTin() {
            System.out.println(ngay + "/" + thang + "/" + nam);
            System.out.println(gio + ":" + phut + ":" + giay);
        }
    }
}
