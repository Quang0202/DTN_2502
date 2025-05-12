package Exercise3.backend;

import Exercise3.entity.CPU;
import Exercise3.entity.Car;
import Exercise3.entity.NgayThangNam;
import Exercise3.entity.OuterClass;

public class Exercise3 {
    public void ques1() {
        CPU cpu = new CPU(18000000);
        CPU.Ram ram = cpu.new Ram();
        CPU.Processor processor = cpu.new Processor();

        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }

    public void ques2() {
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println(engine);
    }

    public void ques3() {
        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }

    public void ques4() {
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
