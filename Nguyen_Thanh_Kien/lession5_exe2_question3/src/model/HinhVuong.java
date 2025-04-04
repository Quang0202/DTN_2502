package model;

public class HinhVuong extends HinhChuNhat {

    @Override
    public String dienTinh(Double dai, Double rong) {
        return "Tinh dien tich theo hinh vuong " + super.dienTinh(dai,rong);
    }

    @Override
    public String chuVi(Double dai, Double rong) {
        return "Tinh chu vi theo hinh vuong " + super.chuVi(dai, rong);
    }
}
