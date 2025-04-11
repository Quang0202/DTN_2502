package model;

public class CPU {
    private Double price;
    public Ram ram;
    public Processor processor;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public class Processor {
        private int coreAmount;
        private String manufacturer;
        public Double getCache(){
            return 4.3;
        }
    }

    public class Ram {
        private String memory;
        private String manufacturer;
        public Double getClockSpeed(){
            return 5.5;
        }
    }
}
