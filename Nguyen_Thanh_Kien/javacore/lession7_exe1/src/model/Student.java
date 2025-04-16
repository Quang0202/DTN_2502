package model;

import utils.StudentException;

public class Student {
    private int id;
    private String name;
    public static String college;
    public static int moneyGroup;
    private static int counter = 0;
    private static final int MAX_LENGTH_STUDENT = 7;

    public static int getCounter() {
        return counter;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public void setMoneyGroup(int moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() throws StudentException {
        counter++;
        if(counter > MAX_LENGTH_STUDENT){
            throw new StudentException("Can not create student more than 7");
        }
    }

    public Student(int id, String name) throws StudentException {
        counter++;
        if(counter > MAX_LENGTH_STUDENT){
            throw new StudentException("Can not create student more than 7");
        }
        this.id = id;
        this.name = name;
    }
}
