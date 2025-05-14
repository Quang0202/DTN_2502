package Exercise3.entity;

import java.text.DateFormat;
import java.util.Locale;

public class CPU {
    private int price;

    public CPU(int price) {
        this.price = price;
    }

    public class Processor {
        private int coreAmount;
        private String manufacturer;

        public double getCache() {
            return 4.3;
        }
    }

    public class Ram {
        private int memory;
        private String manufacturer;

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }
    }
}
