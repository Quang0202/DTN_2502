package backend.service;

import backend.repository.IProductRepository;
import backend.repository.ProductRepository;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository;

    public ProductService() {
        iProductRepository = new ProductRepository();
    }


    @Override
    public void viewListProducts() {
        iProductRepository.viewListProducts();
    }

    @Override
    public void deleteProduct(int id) {
        iProductRepository.deleteProduct(id);
    }

    @Override
    public void updateProduct(int id, String newName) {
        iProductRepository.updateProduct(id, newName);
    }

    @Override
    public void createNewProduct() {
        iProductRepository.createNewProduct();
    }
}
