package model;

public class HinhChuNhat implements ICaculate{
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public String dienTinh() {
        if(this instanceof HinhVuong){
            return "Hinh Vuong " + this.dai*this.rong;
        }else {
            return "Hinh Chu Nhat " + this.dai*this.rong;
        }
    }

    @Override
    public String chuVi() {
        if(this instanceof HinhVuong){
            return "Hinh Vuong " + this.dai*4;
        }else {
            return "Hinh Chu Nhat " + (this.dai+this.rong)*2;
        }
    }
}
