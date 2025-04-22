public class Shape {
    private String name;
//    private Coordinate coordinate;

    public Shape(String name) {
        this.name = name;
//        this.coordinate = new Coordinate(1,2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        class Coordinate{
            private int x;
            private int y;

            public Coordinate(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            @Override
            public String toString() {
                return "Coordinate{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }

        Coordinate coordinate = new Coordinate(1,2);
        System.out.println(coordinate);

    }

//    public static class Coordinate{
//        private int x;
//        private int y;
//
//        public Coordinate(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        public int getX() {
//            return x;
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//
//        @Override
//        public String toString() {
//            return "Coordinate{" +
//                    "x=" + x +
//                    ", y=" + y +
//                    '}';
//        }
//    }
}
