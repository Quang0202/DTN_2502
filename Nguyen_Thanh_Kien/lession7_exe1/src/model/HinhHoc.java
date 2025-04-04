package model;

import utils.Configs;
import utils.HinhHocException;

public abstract class HinhHoc {
    private static int counter =0;
    public HinhHoc() throws HinhHocException {
        counter++;
        if(counter >  Configs.SO_LUONG_HINH_TOI_DA){
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
    }

    public static int getCounter() {
        return counter;
    }

    public abstract double perimeter();

    public abstract double acreage();
}
