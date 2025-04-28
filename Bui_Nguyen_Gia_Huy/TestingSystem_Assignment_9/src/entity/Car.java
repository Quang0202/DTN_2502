package entity;

public class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type, String engineType) {
        this.name = name;
        this.type = type;
        this.engine = new Engine(engineType);
    }

    public class Engine {
        private String engineType;

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

    public void printEngineInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Type: " + type);
        System.out.println("Engine Type: " + engine.getEngineType());
    }
}
