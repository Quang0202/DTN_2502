import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();
    private CanBo[] danhSachCanBoArray = new CanBo[10];

    public void themCanBo() {
        Scanner sc = new Scanner(System.in);
        CanBo cb = new CanBo();
        CongNhan cnhan = new CongNhan();
        Kysu kysu = new Kysu();
        NhanVien vv = new NhanVien();
        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1.Neu can bo la Cong nhan");
            System.out.println("2.neu can bo la ky su");
            System.out.println("3.neu can bo la nhan vien");
            System.out.println("4.tim kiem can bo theo ho va ten ");
            System.out.println("5.Tim kiem can bo xoa theo ten");
            System.out.println("6.thoat");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            System.out.println("Vui long nhap Ho va ten :");
            cb.HoVaTen = sc.nextLine();
            System.out.println("Vui long nhap tuoi : ");
            cb.age = sc.nextInt();
            sc.nextLine();
            System.out.println("vui long chon gioi tinh ");
            cb.sex = sc.nextLine();
            System.out.println("vui long nhap  dia chi ");
            cb.address = sc.nextLine();
           danhSachCanBoArray[chon] = cb;
            danhSachCanBo.add(cb);
            switch (chon) {
                case 1:
                    System.out.println("cap bac cua cong nhan");
                    cnhan.level = sc.nextLine();
                    System.out.println(cb.toString() + "cap bac" + cnhan.level);
                    break;
                case 2:
                    System.out.println("Nganh dao tao ");
                    kysu.nganhDaoTao = sc.nextLine();
                    System.out.println(cb.toString() + "Nganh dao tao" + kysu.nganhDaoTao);
                    break;
                case 3:
                    System.out.println("Cong viec ");
                    vv.congViec = sc.nextLine();
                    System.out.println(cb.toString() + " Cong viec" + vv.congViec);
                    break;
                case 4:
                    System.out.println("Tim kiem Theo Ho Va Ten");
                    System.out.print("Nhập tên cần tìm: ");
                    String tenTim = sc.nextLine();
                    TimKiemCanBo(tenTim);
                    continue;
                case 5:
                    System.out.println("Nhap ten can bo can xoa");
                    String tenCanBo = sc.nextLine();
                    DeleteCanBo(tenCanBo);
                    continue;
                case 6:
                    System.out.println(cb.toString() );
                    System.out.println("👋 Thoát khỏi chương trình. Tạm biệt!");
                    return;
            }
        }
    }

    public void TimKiemCanBo(String ten) {
        boolean timThay = false;
        for (CanBo cb : danhSachCanBoArray) {
            if (cb != null && cb.HoVaTen.toLowerCase().contains(ten.toLowerCase())) {
                System.out.println("✅ Kết quả tìm thấy: " + cb);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("❌ Không tìm thấy cán bộ có tên: " + ten);
        }

    }
    public void DeleteCanBo(String ten) {
        boolean timThay = false;

        for (int i = 0; i < danhSachCanBo.size(); i++) {
            CanBo cb = danhSachCanBo.get(i);
            if (cb.HoVaTen.equalsIgnoreCase(ten)) {
                danhSachCanBo.remove(i);
                System.out.println("✅ Đã xóa cán bộ: " + cb.HoVaTen);
                timThay = true;
                break; // Nếu chỉ muốn xóa cán bộ đầu tiên trùng tên
            }
        }

        if (!timThay) {
            System.out.println("❌ Không tìm thấy cán bộ tên: " + ten);
        }
    }
    public static void main (String[]args){
        new QuanLyCanBo().themCanBo();

    }
}
