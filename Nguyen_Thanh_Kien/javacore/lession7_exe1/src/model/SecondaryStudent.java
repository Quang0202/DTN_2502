package model;

import utils.StudentException;

public class SecondaryStudent extends Student {
    private static int counter = 0;


    public static int getCounter() {
        return counter;
    }

    public SecondaryStudent(int id, String name) throws StudentException {
        super(id, name);
        counter++;
    }
}
