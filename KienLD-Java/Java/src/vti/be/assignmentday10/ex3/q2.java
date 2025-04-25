package vti.be.assignmentday10.ex3;

public class q2 {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "8WD", new Car.Engine("Crysler"));

        System.out.println(car.engine.getEngineType());



    }

    public static class Car{
        public Car(String name, String type, Engine engine) {
            this.name = name;
            this.type = type;
            this.engine = engine;
        }

        String name;
        String type;

        Engine engine;
        public static class Engine {
            public Engine(String engineType) {
                this.engineType = engineType;
            }

            public String getEngineType() {
                return engineType;
            }

            public void setEngineType(String engineType) {
                this.engineType = engineType;
            }

            String engineType ;




        }



    }
}
