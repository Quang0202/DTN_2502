package com.vti.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    public ArrayList<TaiLieu> themTaiLieu(ArrayList<TaiLieu> taiLieus, String maTaiLieu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai tai lieu");
        String type = scanner.nextLine();
        switch (type) {
            case "Sach":
                System.out.println("Nhap tac gia:");
                TaiLieu t = new Sach(maTaiLieu, scanner.nextLine());
                taiLieus.add(t);
            case "Tap chi":
                System.out.println("Nhap so phat hanh, thang phat hanh");
                String sph = scanner.nextLine();
                int tph = scanner.nextInt();
                TaiLieu t2 = new TapChi(maTaiLieu, sph);
                taiLieus.add(t2);
            case "Bao":
                System.out.println("Nhap ngay phat hanh");
                String date = scanner.nextLine();
                TaiLieu taiLieu = new Bao(maTaiLieu, date);
                taiLieus.add(taiLieu);
        }
        return taiLieus;
    }

    public ArrayList<TaiLieu> xoaTaiLieu(ArrayList<TaiLieu> taiLieus, String maTaiLieu) {
        taiLieus.removeIf(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu));

        return taiLieus;
    }

    public void display(ArrayList<TaiLieu> taiLieus) {
        for (TaiLieu t : taiLieus) {
            System.out.println(t);
        }
    }

    public void search(ArrayList<TaiLieu> taiLieus, String type) {
        switch (type) {
            case "Bao":
                for (TaiLieu t : taiLieus) {
                    if (t instanceof Bao)
                        System.out.println(t);
                }
                return;
            case "Tap chi":

            case "Sach":
                for (TaiLieu t : taiLieus) {
                    if (t instanceof Sach)
                        System.out.println(t);
                }
                return;
        }
    }

    public void exit() {
        return;
    }
}
