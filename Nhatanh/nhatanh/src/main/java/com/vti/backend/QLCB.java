package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QLCB {

    List<CanBo> canBoList = new ArrayList<>();

    public void themCanBo(CanBo newCanBo) {
        System.out.println(newCanBo);
        canBoList.add(newCanBo);

    }

    public void timCanBo(String searchQuery) {
        var result = canBoList.stream().filter(e -> Objects.equals(e.getFullName(), searchQuery)).findFirst()
                .orElse(null);
        System.out.println(result);
    }

    public void deleteCanBo(String searchQuery) {
            canBoList.removeIf(e -> Objects.equals(e.getFullName(), searchQuery));
    }

    public void showCanBo() {
        for (CanBo i : canBoList) {
            System.out.println(i);
        }
    }


}
