package Exercise1.Q2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {

	private List<CanBo> canBos;
	private Scanner scanner;

	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public QLCB(List<CanBo> canBos) {
		this.canBos = canBos;
	}

	public void addCanBo() {
		System.out.print("Bạn muốn add bao nhiêu cán bộ: ");
		int x = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < x; i++) {
			System.out.print("Bạn muốn nhập vào nhân viên(nhập vào 1), Công nhân (nhập vào 2), kỹ sư (nhập vào 3): ");
			int choose = scanner.nextInt();
			scanner.nextLine();
			CanBo canBo = null;

			switch (choose) {
				case 1:
					// Nhân viên
					System.out.print("Nhập tên: ");
					String hoTen = scanner.nextLine();
					System.out.print("Nhập tuổi: ");
					int tuoi = scanner.nextInt();
					scanner.nextLine(); // Consume the newline
					System.out.print("Nhập giới tính: ");
					String gioiTinhStr = scanner.nextLine();
					GioiTinh gioiTinh = GioiTinh.valueOf(gioiTinhStr.toUpperCase());
					System.out.print("Nhập địa chỉ: ");
					String diaChi = scanner.nextLine();
					System.out.print("Nhập công việc: ");
					String congViec = scanner.nextLine();
					canBo = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
					break;
				case 2:
					canBo = new CongNhan();
					break;
				case 3:
					// Kỹ sư
					System.out.print("Nhập tên: ");
					String hoTenKySu = scanner.nextLine();
					System.out.print("Nhập tuổi: ");
					int tuoiKySu = scanner.nextInt();
					scanner.nextLine(); // Consume the newline
					System.out.print("Nhập giới tính: ");
					String gioiTinhStrKySu = scanner.nextLine();
					GioiTinh gioiTinhKySu = GioiTinh.valueOf(gioiTinhStrKySu.toUpperCase());
					System.out.print("Nhập địa chỉ: ");
					String diaChiKySu = scanner.nextLine();
					System.out.print("Nhập ngành đào tạo: ");
					String nganhDaoTao = scanner.nextLine();
					canBo = new KySu(hoTenKySu, tuoiKySu, gioiTinhKySu, diaChiKySu, nganhDaoTao);
					break;
				default:
					System.out.println("Chọn không hợp lệ.");
					break;
			}

			// Thêm cán bộ vào danh sách
			if (canBo != null) {
				canBos.add(canBo);
				System.out.println("Nhập thành công cán bộ " + (i + 1));
			}
		}
	}


	public void findByName() {
			System.out.print("Nhập tên cán bộ bạn muốn tìm: ");
			String name = scanner.nextLine();

			boolean found = false;
			for (CanBo canBo : canBos) {
				if (canBo.getHoTen().equalsIgnoreCase(name)) {
					System.out.println("Cán bộ tìm thấy: " + canBo);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Không tìm thấy cán bộ với tên " + name);
			}
		}


	public void printListCanBo() {
		for (int i = 0; i < canBos.size(); i++) {
			System.out.println("Thông tin cán bộ " + (i + 1) + " là: ");
		}
		System.out.println("----------------------------");
	}

	public void deleteCanBo(String name) {
		boolean found = false;
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i).getHoTen().equalsIgnoreCase(name)) {
				canBos.remove(i);
				System.out.println("Đã xóa cán bộ có tên " + name);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Không tìm thấy cán bộ với tên " + name);
		}
	}

	public void deleteCanBo() {

		String inputName = scanner.nextLine();
		deleteCanBo(inputName);
	}
}
