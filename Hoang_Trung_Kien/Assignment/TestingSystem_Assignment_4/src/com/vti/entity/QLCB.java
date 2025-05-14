package com.vti.entity;

import java.util.ArrayList;

public class QLCB {
    public CanBo[] themCanBo(CanBo[] canBos, String name) {
        CanBo[] newCanBos = new CanBo[canBos.length + 1];
        int i = 0;
        for (CanBo cb : canBos) {
            newCanBos[i] = cb;
            i++;
        }
        CanBo canBo = new CanBo(name);
        newCanBos[canBos.length] = canBo;
        return newCanBos;
    }

    public CanBo search(CanBo[] canBos, String name) {
        for (CanBo canBo : canBos) {
            if (canBo.getName().equals(name))
                return canBo;
        }
        return null;
    }

    public void display(CanBo[] canBos) {
        for (CanBo canBo : canBos) {
            System.out.println(canBo);
        }
    }

    public CanBo[] deleteCanbo(CanBo[] canBos, String name) {

        ArrayList<CanBo> canBos1 = new ArrayList<>();
        canBos1.removeIf(CanBo -> CanBo.getName().equals("Khanh Linh"));
        CanBo[] newCanBos = new CanBo[canBos.length - 1];
        int i = 0;
        for (CanBo canBo : canBos) {
            if (!canBo.getName().equals(name)) {
                newCanBos[i] = canBo;
                i++;
            }
        }
        return newCanBos;

    }

    public void exit() {

        return;
    }
}
