package backend;

import entity.Car;

public class Exercise3 {
    public void question1() {
        CPU cpu = new CPU(500);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.Ram ram = cpu.new Ram(16, "Samsung");

        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("Ram Clock Speed: " + ram.getClockSpeed());
    }

    public void question2() {
        Car car = new Car("Mazda", "8WD", "Crysler");
        car.printEngineInfo();
    }

    public void question3() {
        int x = 10;
        System.out.println("Output Question 3: " + x++);
        // Output: 10 (post-increment)
    }

    public void question4() {
        int a = 5;
        int b = 10;
        int result = a++ + ++b;
        System.out.println("Output Question 4: " + result); // 5 + 11 = 16
    }

    // Inner class
    class CPU {
        int price;

        public CPU(int price) {
            this.price = price;
        }

        class Processor {
            int coreAmount;
            String manufacturer;

            public Processor(int coreAmount, String manufacturer) {
                this.coreAmount = coreAmount;
                this.manufacturer = manufacturer;
            }

            public double getCache() {
                return 4.3;
            }
        }

        class Ram {
            int memory;
            String manufacturer;

            public Ram(int memory, String manufacturer) {
                this.memory = memory;
                this.manufacturer = manufacturer;
            }

            public double getClockSpeed() {
                return 5.5;
            }
        }
    }
}
