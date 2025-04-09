package model1;

public class ThiSinh {
    private String sbd;
    private String name;
    private String address;
    private String uuTien;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String name, String address, String uuTien) {
        this.sbd = sbd;
        this.name = name;
        this.address = address;
        this.uuTien = uuTien;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "sbd='" + sbd + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", uuTien='" + uuTien + '\'' +
                '}';
    }
}
