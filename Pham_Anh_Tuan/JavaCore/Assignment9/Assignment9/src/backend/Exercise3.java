package backend;

import entity.CPU;
import entity.Car;

public class Exercise3 {
    public void question1() {
        CPU cpu = new CPU(300);
        CPU.Processor processor = cpu.new Processor(6, "In teo");
        CPU.Ram ram = cpu.new Ram(16, "Kingston");

        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());
    }

    public void question2() {
        Car car = new Car("Lếch sợt Rờ Ích 350", "Bốn Vê Kép Đê");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Type: " + car.getType());
        System.out.println("Engine Type: " + engine.getEngineType());
    }
}