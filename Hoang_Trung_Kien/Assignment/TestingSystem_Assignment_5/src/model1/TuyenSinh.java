package model1;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    ArrayList<ThiSinh> thiSinhs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void themThiSinh() {
        ThiSinh thiSinh = new ThiSinh();
        System.out.println("Nhap ten thi sinh: ");
        thiSinh.setName(scanner.nextLine());
        thiSinhs.add(thiSinh);
    }

    @Override
    public void ThiSinhInfo() {
        for (ThiSinh thiSinh : thiSinhs)
            System.out.println(thiSinh);
    }

    @Override
    public void search(String sbd) {
        for (ThiSinh thiSinh : thiSinhs) {
            if (thiSinh.getSbd().equals(sbd))
                System.out.println(thiSinh);
        }
    }

    @Override
    public void exit() {

    }
}
