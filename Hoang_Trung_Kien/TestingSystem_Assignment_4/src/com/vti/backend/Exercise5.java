package com.vti.backend;

import com.vti.entity.*;

public class Exercise5 {
    CanBo c1 = new CanBo("Kien");
    KySu c2 = new KySu("Linda", "CNTT");
    CongNhan c3 = new CongNhan("Linh", 5);
    NhanVien c4 = new NhanVien("Hoang", "Developer");
    CanBo[] canBos = {c1,c2,c3,c4};

    public void ques5a() {
        QLCB q = new QLCB();
        q.display(q.themCanBo(canBos, "Khanh"));
    }

    public void ques5b() {
        QLCB q = new QLCB();
        CanBo result = q.search(canBos, "Linh");
        System.out.println(result);
    }

    public void ques5c() {
        QLCB q = new QLCB();
        q.display(canBos);
    }

    public void ques5d() {
        QLCB q = new QLCB();
        q.display(q.deleteCanbo(canBos, "Linda"));
    }
}
