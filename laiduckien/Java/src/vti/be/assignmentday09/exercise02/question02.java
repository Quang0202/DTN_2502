package vti.be.assignmentday09.exercise02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class question02 implements Comparator<Student> {
    public static void main(String[] args) {
        Student student1 = new Student(1, "a", "2001", 1);
        Student student2 = new Student(2, "b", "1996", 2);
        Student student3 = new Student(3, "c", "2009", 3);
        Student student4 = new Student(4, "c", "2002", 4);
        Student student5 = new Student(5, "c", "2003", 5);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students, new question02());
        for( Student student : students ) {
            System.out.println(student);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        int compareName = o1.getName().compareTo(o2.getName());
        if( compareName != 0 ) return compareName;
        int compareDate = o1.getDateofbirth().compareTo(o2.getDateofbirth());
        if( compareDate != 0 ) return compareDate;
        return Float.compare(o1.getScore(), o2.getScore());
    };


};
