package com.programming.nhatanh.lesson9.entity;

public class Car {
    String name;
    String type;
    Engine engine;

    public Car(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public class Engine {
        String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
