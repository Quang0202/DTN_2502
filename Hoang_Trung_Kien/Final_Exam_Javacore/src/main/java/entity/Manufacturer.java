package entity;

public class Manufacturer {
    private int manufacturerId;
    private String manufacturerName;

    public Manufacturer(int manufacturerId, String manufacturerName) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerId=" + manufacturerId +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
