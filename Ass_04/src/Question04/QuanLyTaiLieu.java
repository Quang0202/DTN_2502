package Question04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuanLyTaiLieu {
private ArrayList<TaiLieu> listTaiLieu = new ArrayList<>();
    public static void main(String[] args) {

        Set<String> maTaiLieuSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long chon them ");
        System.out.println("1.them Sach");
        System.out.println("2.them Bao");
        System.out.println("3.them TapChi");
        System.out.println("Chon");
        int chon = sc.nextInt();
        sc.nextLine();

        System.out.println("Vui long nhap Nha Xuat Ban");
        String nhap = sc.nextLine();
        System.out.println("vui long nhap So Ban Xuat Hanh");
        int soBan = sc.nextInt();
        sc.nextLine();
        TaiLieu tL = null;
        String maTaiLieuCuoiCung = null;
        while (true) {
            System.out.print("Nhập mã tài liệu (hoặc gõ 'exit' để thoát): ");
            String maTaiLieu = sc.nextLine();

            if (maTaiLieu.equalsIgnoreCase("exit")) {
                break;
            }

            if (maTaiLieuSet.contains(maTaiLieu)) {
                System.out.println("⚠️ Mã tài liệu đã tồn tại! Vui lòng nhập mã khác.");
            } else {
                maTaiLieuSet.add(maTaiLieu);
                maTaiLieuCuoiCung = maTaiLieu;
                System.out.println("✅ Mã tài liệu đã được thêm: " + maTaiLieu);
            }

        }


        switch (chon) {
            case 1:
                System.out.println("vui long them ten tac gia");
                String tenTacGia = sc.nextLine();
                System.out.println("vui long ghi so trang");
                int SoTrang = sc.nextInt();
                System.out.println();
                tL = new Sach(nhap,soBan,maTaiLieuCuoiCung,tenTacGia,SoTrang);
                System.out.println(tL.toString());
                break;
            case 2:
                System.out.println("vui long nhap ngay phat hanh");
                int ngayPhatHanh = sc.nextInt();
                tL = new Bao(nhap,soBan,maTaiLieuCuoiCung,ngayPhatHanh);
                System.out.println(tL.toString());

        }

    }
}
