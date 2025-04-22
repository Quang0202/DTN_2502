package Ex9;

import Ex2.ScannerUtils;

import static Ex2.ScannerUtils.inputString;

public class Department {
    private String name;
    private int id;
    private ScannerUtils scannerUtils= new ScannerUtils();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScannerUtils getScannerUtils() {
        return scannerUtils;
    }

    public void setScannerUtils(ScannerUtils scannerUtils) {
        this.scannerUtils = scannerUtils;
    }

    public Department(String name, int id, ScannerUtils scannerUtils) {
        this.name = name;
        this.id = id;
        this.scannerUtils = scannerUtils;
    }
public Department() {
        scannerUtils.inputInt("vui long nhap so nguyen");
        scannerUtils.inputString("v");
}
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", scannerUtils=" + scannerUtils +
                '}';
    }
}
