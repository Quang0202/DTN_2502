package entity;

public class Product {
    private int productId;
    private String productName;
    private String productPrice;
    private String productInfo;
    private String productDetail;
    private int ratingStar;
    private String productImageName;
    private Manufacturer manufacturer;
    private Category category;

    public Product(int productId, String productName, String productPrice, String productInfo, String productDetail, int ratingStar, String productImageName, Manufacturer manufacturer, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInfo = productInfo;
        this.productDetail = productDetail;
        this.ratingStar = ratingStar;
        this.productImageName = productImageName;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductImageName() {
        return productImageName;
    }

    public void setProductImageName(String productImageName) {
        this.productImageName = productImageName;
    }

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", productDetail='" + productDetail + '\'' +
                ", ratingStar=" + ratingStar +
                ", productImageName='" + productImageName + '\'' +
                ", manufacturer=" + manufacturer +
                ", category=" + category +
                '}';
    }
}
