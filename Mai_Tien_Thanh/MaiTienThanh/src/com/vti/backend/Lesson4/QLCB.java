package MaiTienThanh.src.com.vti.backend.Lesson4;
import java.util.Scanner;
import java.util.ArrayList;
public class QLCB {
    private ArrayList<CanBo> danhSachCanBo;
    private Scanner scanner;
    public QLCB() {
        this.danhSachCanBo = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void themMoiCanBo(){
        System.out.print("Nhập số lượng cán bộ cần thêm: ");
        int soLuong = scanner.nextInt();
        for(int i = 0; i < soLuong; i++){
            System.out.println("Chọn loại cán bộ cần thêm (1.Công nhân - 2. Kỹ sư - 3. Nhân viên): ");
            int choice = 0;
            while(true){
                if(scanner.hasNextInt()){
                    choice = scanner.nextInt();
                    if(choice >= 1 && choice <= 3){
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Mời nhập lại");
                    }
                } else{
                    System.out.println("Mời nhập lại: ");
                    scanner.next();
                }
            }

            System.out.print("Nhập họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập bậc (1-10): ");
                    int bac = 0;
                    while(true){
                        if(scanner.hasNextInt()){
                            bac = scanner.nextInt();
                            if (bac >= 1 && bac <= 10) {
                                scanner.nextLine();
                                break;
                            } else {
                                System.out.print("Lựa chọn không hợp lệ, mời nhập lại: ");
                            }
                        } else {
                            System.out.print("Mời nhập lại: ");
                            scanner.next();
                        }
                    }
                    danhSachCanBo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    break;
                case 2:
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaoTao = scanner.nextLine();
                    danhSachCanBo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    break;
                case 3:
                    System.out.print("Nhập công việc: ");
                    String congViec = scanner.nextLine();
                    danhSachCanBo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public void timCanBo(){
        scanner.nextLine();
        System.out.print("Nhập họ tên cán bộ cần tìm: ");
        String tenTimkiem = scanner.nextLine();
        boolean found = false;
        for(CanBo cb : danhSachCanBo){
            if(cb.hoTen.equalsIgnoreCase(tenTimkiem)){
                cb.hienThi();
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy cán bộ");
        }
    }

    public void hienThiDanhSachCanBo(){
        if(danhSachCanBo.isEmpty()){
            System.out.println("Danh sách cán bộ trống");
        } else{
            for(CanBo cb : danhSachCanBo){
                cb.hienThi();
                System.out.println("--------------");
            }
        }
    }
    public void xoaCanBo(){
        scanner.nextLine();
        System.out.print("Nhập tên cán bộ cần xóa: ");
        String tenXoa = scanner.nextLine();
        boolean removed = danhSachCanBo.removeIf(cb -> cb.hoTen.equalsIgnoreCase(tenXoa));
        if(removed){
            System.out.println("Cán bộ " + tenXoa + " đã được xóa.");
        } else{
            System.out.println("Không tìm thấy cán bộ.");
        }
    }

    public void thoatChuongTrinh(){
        System.out.println("Thoat Chuong Trinh!");
        scanner.close();
        System.exit(0);
    }

    public void menuLuaChon(){
        while(true){
            System.out.println("\n----- Quản Lý Cán Bộ -----");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo họ tên");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            int choice = 0;
            while(true){
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    break;
                } else {
                    System.out.print("Mời nhập lại: ");
                    scanner.next();
                }
            }

            switch (choice) {
                case 1:
                    themMoiCanBo();
                    break;
                case 2:
                    timCanBo();
                    break;
                case 3:
                    hienThiDanhSachCanBo();
                    break;
                case 4:
                    xoaCanBo();
                    break;
                case 5:
                    thoatChuongTrinh();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

    }
}
