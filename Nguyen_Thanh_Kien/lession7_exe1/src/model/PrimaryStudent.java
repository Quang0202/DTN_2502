package model;

import utils.StudentException;

public class PrimaryStudent extends Student{
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public PrimaryStudent(int id, String name) throws StudentException {
        super(id, name);
        counter++;
    }
}
