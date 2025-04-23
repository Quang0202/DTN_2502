package backend;

import entity.CPU;
import entity.Car;

public class Exercise3 {
//    Question 1:
//    Tạo class CPU có property: price
//    Tạo 2 inner class Processor, Ram
//            Với Processor có các property: coreAmount, menufacturer và
//    method getCache() và return ra 4.3
//    Với Ram có các property: memory, menufacturer và method
//    getClockSpeed() và return ra 5.5
//    Sau đó khởi tạo object CPU và in ra cache của Processor và
//    clockSpeed của Ram
    public void question1() {
        CPU cpu = new CPU(300);
        CPU.Processor processor = cpu.new Processor(6, "Apple");
        CPU.Ram ram = cpu.new Ram(16, "AAA");

        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());
    }

//    Question 2:
//    Tạo Car có property: name, type
//    Tạo inner class Engine có property engineType và tạo getter, setter cho property engineType
//    Khởi tạo object Car có name = Mazda, type = 8WD, có loại động cơ là "Crysler".
//    Sau đó in ra thông tin của động cơ

    public void question2() {
        Car car = new Car("Volvo xc90", "V8-E");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Type: " + car.getType());
        System.out.println("Engine Type: " + engine.getEngineType());
    }

    public void question3() {

    }

    public void question4() {


    }
}