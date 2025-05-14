package backend.service;

public interface IProductService {
    void viewListProducts();

    void deleteProduct(int id);

    void updateProduct(int id, String newName);

    void createNewProduct();
}
