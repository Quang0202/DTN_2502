package com.company.entity.TestingSystem9;

public class CPU {
    private double price;

    public static class Processor{
        private int coreAmount;
        private String menuFacturer;

        public Processor() {
        }

        public double getCache(){
            return 4.3;
        }
    }
    public static class Ram{
        private int memory;
        private String menuFacturer;

        public Ram() {
        }

        public double getClockSpeed(){
            return 5.5;
        }
    }
}
