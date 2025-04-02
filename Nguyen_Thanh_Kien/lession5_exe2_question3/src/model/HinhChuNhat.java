package model;

public class HinhChuNhat implements ICaculate{
    @Override
    public String dienTinh(Double dai, Double rong) {
        return "Hinh Chu Nhat " + dai*rong;
    }

    @Override
    public String chuVi(Double dai, Double rong) {
        return "Hinh Chu Nhat " + (dai+rong) * 2;
    }
}
