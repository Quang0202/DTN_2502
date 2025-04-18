package com.company.entity.TestingSystem7;

public final class SecondaryStudent extends Student{
    private static int countSecondaryStudent;

    public SecondaryStudent(int id, String name) throws Exception {
        super(id, name);
        countSecondaryStudent++;
    }

    public static int getCountSecondaryStudent() {
        return countSecondaryStudent;
    }
}
