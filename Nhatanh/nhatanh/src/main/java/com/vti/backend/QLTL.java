package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class QLTL {
    List<TaiLieu> taiLieuList = new ArrayList<>();

    public void themTaiLieu(TaiLieu newTaiLieu) {
        System.out.println(newTaiLieu);
        taiLieuList.add(newTaiLieu);
    }

    public boolean checkIfIdExist(String id){
        return taiLieuList.stream().anyMatch(e -> Objects.equals(e.getMaTaiLieu(), id));
    }

    public void xoaTaiLieu(String id) {
        taiLieuList.removeIf(e -> Objects.equals(e.getMaTaiLieu(), id));
    }

    public void showTaiLieu(String id){
        var result = taiLieuList.stream().filter(e -> Objects.equals(e.getMaTaiLieu(), id))
                .findAny()
                .orElse(null);
        System.out.println(result);
    }

    public void findByTypeTaiLieu(int typeTaiLieu){
        switch (typeTaiLieu){
            case 1:
                taiLieuList.stream().filter(e -> e instanceof Sach)
                        .forEach(System.out::println);
                break;
                case 2:
                taiLieuList.stream().filter(e -> e instanceof TapChi)
                        .forEach(System.out::println);
                break;
                case 3:
                taiLieuList.stream().filter(e -> e instanceof Bao)
                        .forEach(System.out::println);
                break;

        }

    }

}
