package frontend;

import backend.controller.ManufacturerController;
import backend.controller.ProductController;
import backend.repository.ManufacturerRepository;
import utils.ScannerUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        while (true) {
            System.out.println("+----------------------------------------------------------------+\n" +
                    "|                     MỜI BẠN CHỌN CHỨC NĂNG                     |\n" +
                    "+----------------------------------------------------------------+\n" +
                    "| 1. Tìm kiếm nhà sản xuất theo id                               |\n" +
                    "| 2. Xem danh sách thông tin sản phẩm trên hệ thống              |\n" +
                    "| 4. Xóa sản phẩm theo id                                        |\n" +
                    "| 5. Cập nhật tên sản phẩm đang có                               |\n" +
                    "| 6. Thêm mới sản phẩm                                           |\n" +
                    "| 7. Chức năng kiểm tra Email                                    |\n" +
                    "| 8. Exit                                                        |\n" +
                    "+----------------------------------------------------------------+");

            ScannerUtils scannerUtils = new ScannerUtils();
            ProductController productController = new ProductController();
            ManufacturerController manufacturerController = new ManufacturerController();
            int choice = scannerUtils.inputInt("Vui long nhap so nguyen");
            switch (choice) {
                case 1:
                    System.out.println("Nhap id cua nha san xuat ban muon tim:");
                    int id = scannerUtils.inputInt("vui long nhap so nguyen");
                    System.out.println(manufacturerController.findManufacturerById(id));
                    break;
                case 2:
                    productController.viewListProducts();
                    break;
                case 4:
                    System.out.println("Nhap id product muon xoa");
                    int delete = scannerUtils.inputInt("Vui long nhap so nguyen");
                    productController.deleteProduct(delete);
                    break;
                case 5:
                    System.out.println("Nhap id san pham can sua ten");
                    int update = scannerUtils.inputInt("Vui long nhap so nguyen");
                    System.out.println("Nhap ten moi cua san pham");
                    String newName = scannerUtils.inputString();
                    productController.updateProduct(update, newName);
                    break;
                case 6:
                    productController.createNewProduct();
                    break;
                case 7:
                    scannerUtils.inputEmail();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng");
            }
        }
    }
}
