package backend.repository;

import entity.Product;

import java.util.List;

public interface IProductRepository {
    void viewListProducts();

    void deleteProduct(int id);

    void updateProduct(int id, String newName);

    boolean isProductExist(int id);

    boolean isProductExist(String name);

    void createNewProduct();
}
