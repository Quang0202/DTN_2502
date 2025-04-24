package com.programming.nhatanh.lesson9.frontend;

import com.programming.nhatanh.lesson9.entity.CPU;
import com.programming.nhatanh.lesson9.entity.Car;
import com.programming.nhatanh.lesson9.entity.NgayThangNam;
import com.programming.nhatanh.lesson9.entity.OuterClass;

public class E3 {
    public static void main(String[] args)  {
        CPU newCpu = new CPU(45.99);
        CPU.Processor processor = newCpu.new Processor(2 ,"NVIDIA");
        CPU.Ram ram = newCpu.new Ram(25, "NVIDIA");

        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());


        Car newCar = new Car("Mazda", "8WD");
        Car.Engine engine = newCar.new Engine("Crysler");
        System.out.println(newCar);
        System.out.println(engine.getEngineType());

        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();


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
