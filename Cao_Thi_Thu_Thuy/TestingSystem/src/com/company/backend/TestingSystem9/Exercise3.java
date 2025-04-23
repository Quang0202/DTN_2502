package com.company.backend.TestingSystem9;

import com.company.entity.TestingSystem9.CPU;
import com.company.entity.TestingSystem9.Car;
import com.company.entity.TestingSystem9.NgayThangNam;
import com.company.entity.TestingSystem9.OuterClass;

public class Exercise3 {
    public void q1(){
        CPU.Processor processor = new CPU.Processor();
        System.out.println(processor.getCache());
        CPU.Ram ram = new CPU.Ram();
        System.out.println(ram.getClockSpeed());
    }

    public void q2(){
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");
        System.out.println("Engine Type: " + engine.getEngineType());
    }

    public void q3(){
        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }

    public void q4(){
        NgayThangNam date = new NgayThangNam();
        date.ngay = 31;
        date.thang = 10;
        date.nam = 2017;

        NgayThangNam.GioPhutGiay time = date.new GioPhutGiay();
        time.gio = 10;
        time.phut = 15;
        time.giay = 30;

        time.xuatThongTin();
    }
}
