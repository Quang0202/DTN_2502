package FrontEnd;

import BackEnd.HinhChuNhat;
import BackEnd.HinhHoc;
import BackEnd.HinhTron;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.TryTree;

public class ConfigRun {
    public static void main(String[] args) {

        try{
            HinhHoc[] hs = new HinhHoc[6];

            hs[1] = new HinhTron(1);
            hs[2] = new HinhTron(2);
            hs[3] = new HinhTron(3);
            hs[4] = new HinhChuNhat(3,5);
            hs[5] = new HinhChuNhat(4,6);
            hs[6] = new HinhChuNhat(5,7);
        } catch (Exception E) {
            System.out.println("Loi" + E.getMessage());
        }


    }
}
