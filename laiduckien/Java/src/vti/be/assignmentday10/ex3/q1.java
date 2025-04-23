package vti.be.assignmentday10.ex3;

public class q1 {
    public static void main(String[] args) {

        CPU cpu = new CPU(11f, new CPU.Processor(11, "Gtel"),
                new CPU.Ram(12, "Viettel"));

        System.out.println("cache " + cpu.processor.getCache());


    }

    public static class CPU{
        public CPU(Float price, Processor processor, Ram ram) {
            this.price = price;
            this.processor = processor;
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "CPU{" +
                    "price=" + price +
                    ", processor=" + processor +
                    ", ram=" + ram +
                    '}';
        }

        Float price;
        Processor processor;
        Ram ram;

        public static class Processor{
            public Processor(Integer coreAmount, String menufacturer) {
                this.coreAmount = coreAmount;
                this.menufacturer = menufacturer;
            }

            Integer coreAmount;

            @Override
            public String toString() {
                return "Processor{" +
                        "coreAmount=" + coreAmount +
                        ", menufacturer='" + menufacturer + '\'' +
                        '}';
            }

            String menufacturer ;

            public Double getCache() {
                return 4.3;
            }
        }

        public static class Ram {
            public Ram(Integer memory, String menufacturer) {
                this.memory = memory;
                this.menufacturer = menufacturer;
            }

            @Override
            public String toString() {
                return "Ram{" +
                        "memory=" + memory +
                        ", menufacturer='" + menufacturer + '\'' +
                        '}';
            }

            Integer memory;
            String menufacturer  ;

            public Double getClockSpeed() {
                return 5.5;
            }
        }
    }


}
