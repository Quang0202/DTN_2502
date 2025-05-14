package backend.controller;

import backend.service.IProductService;
import backend.service.ProductService;

public class ProductController {
    private IProductService iProductService;

    public ProductController() {
        iProductService = new ProductService();
    }

    public void viewListProducts() {
        iProductService.viewListProducts();
    }

    public void deleteProduct(int id) {
        iProductService.deleteProduct(id);
    }

    public void updateProduct(int id, String newName) {
        iProductService.updateProduct(id, newName);
    }

    public void createNewProduct() {
        iProductService.createNewProduct();
    }
}
