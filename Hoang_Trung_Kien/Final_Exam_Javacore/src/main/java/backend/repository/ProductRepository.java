package backend.repository;

import backend.controller.ManufacturerController;
import entity.Product;
import utils.JdbcUtils;
import utils.ScannerUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    Connection connection = JdbcUtils.getConnection();

    @Override
    public void viewListProducts() {
        String sql = "SELECT ProductId, productName, productPrice, productDetail, ratingStar, ManufacturerId \n" +
                "FROM Product;";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ManufacturerController manufacturerController = new ManufacturerController();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(4) + " ");
                System.out.print(resultSet.getInt(5) + " ");
                System.out.println(manufacturerController.findManufacturerById(resultSet.getInt(6)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteProduct(int id) {
        if (isProductExist(id)) {
            String sql = "DELETE FROM product\n" +
                    "WHERE productId = ?;";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                System.out.println("Delete success");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("Product not found!");
    }

    @Override
    public void updateProduct(int id, String newName) {
        if (isProductExist(id)) {
            String sql = "UPDATE Product\n" +
                    "SET productName = ?\n" +
                    "WHERE productId = ?;";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(2, id);
                preparedStatement.setString(1, newName);
                preparedStatement.executeUpdate();
                System.out.println("Update success");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else
            System.out.println("Product not found");
    }

    @Override
    public boolean isProductExist(int id) {
        String sql = "SELECT 1 FROM product\n" +
                "WHERE productId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean isProductExist(String name) {
        String sql = "SELECT 1 FROM product\n" +
                "WHERE productName = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void createNewProduct() {
        ScannerUtils scannerUtils = new ScannerUtils();
        String sql = "INSERT INTO Product (ProductName, ProductPrice, ProductInfo, ProductDetail, RatingStar, ProductImageName, ManufacturerId, CategoryId)\n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println("Nhap ten san pham:");
            String name = scannerUtils.inputString();
            while (isProductExist(name)) {
                System.out.println("Product available");
                name = scannerUtils.inputString();
            }
            preparedStatement.setString(1, name);
            System.out.println("Nhap gia tien san pham");
            preparedStatement.setString(2, scannerUtils.inputString());
            System.out.println("Nhap thong tin san pham");
            preparedStatement.setString(3, scannerUtils.inputString());
            System.out.println("Nhap chi tiet san pham");
            preparedStatement.setString(4, scannerUtils.inputString());
            System.out.println("Nhap so sao danh gia san pham");
            preparedStatement.setString(5, scannerUtils.inputString());
            System.out.println("Nhap ten anh minh hoa san pham");
            preparedStatement.setString(6, scannerUtils.inputString());
            System.out.println("Nhap id nha san xuat san pham");
            preparedStatement.setInt(7, scannerUtils.inputInt("Nhap so nguyen"));
            System.out.println("Nhap id category san pham");
            preparedStatement.setInt(8, scannerUtils.inputInt("Nhap so nguyen"));
            preparedStatement.executeUpdate();
            System.out.println("Create success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
