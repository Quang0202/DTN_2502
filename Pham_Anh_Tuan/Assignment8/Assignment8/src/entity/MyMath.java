package entity;

public class MyMath<T extends Number> {

//    public double sum(T a, T b) {
//        return a.doubleValue() + b.doubleValue();
//    }
//
//    public double sum(T a, T b, T c) {
//        return a.doubleValue() + b.doubleValue() + c.doubleValue();
//    }
//
//    public double sum(T a, T b, T c, T d) {
//        return a.doubleValue() + b.doubleValue() + c.doubleValue() + d.doubleValue();
//    }

    public double sum(T... args){// T[] args
        double result =0;
        for(T a: args){
            result += a.doubleValue();
        }
        return result;
    }

    public double sub(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double pow(T a, T b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}