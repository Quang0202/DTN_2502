import model.Student;
import model.Student2;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        question1();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        exe2();
    }

    private static void question1() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("James"));
        students.add(new Student("Peter"));
        students.add(new Student("Messi"));
        students.add(new Student("James"));
        students.add(new Student("Neymar"));
        students.add(new Student("James"));
        System.out.println("Size: " + students.size());
        System.out.println("Number 4: " + students.get(3));
        System.out.println("First: " + students.get(0) + "\nLast: " + students.get(students.size() - 1));
        students.add(0, new Student("Neymar"));
        students.add(new Student("Terry"));
        System.out.println("List after add 2 student: " + students);

        Collections.reverse(students);

        System.out.println("List after reverse: " + students);
        System.out.println("Find Student id = 2 : " + findStudentById(2, students).toString());
        System.out.println("Find Student name = james : " + findStudentByName("james", students).toString());
        showStudentDuplicateName(students);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 2) {
                students.get(i).setName("");
            }
        }
        System.out.println("List After Change Name Id = 2 " + students);
        students.removeIf(student -> student.getId() == 5);
        System.out.println("List After remove student id = 5" + students);
        ArrayList<Student> copy = new ArrayList<>(students);
        System.out.println("List copy: " + copy);

    }

    private static Student findStudentById(int id, List<Student> students) {
        return students.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    private static List<Student> findStudentByName(String name, List<Student> students) {
        return students.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    private static void showStudentDuplicateName(List<Student> students) {
//        Set<String> results = new HashSet<>();
//        Set<String> temp = new HashSet<>();
//
//        for (Student std : students) {
//            if (!temp.add(std.getName())) {
//                results.add(std.getName());
//            }
//        }
//
//        if (!results.isEmpty()) {
//            System.out.println("Name duplicated: " + results);
//        } else {
//            System.out.println("Not have name duplicated.");
//        }
        Map<String, List<Student>> mapStudent = new HashMap<>();
        for (Student std : students) {
           if(mapStudent.containsKey(std.getName())){
               List<Student> temp = mapStudent.get(std.getName());
               temp.add(std);
           }else {
               List<Student> temp = new ArrayList<>();
               temp.add(std);
               mapStudent.put(std.getName(), temp);
           }
        }


        Set<String> keys = mapStudent.keySet();
        for(String key: keys){
            List<Student> studentList = mapStudent.get(key);
            if(studentList.size()>1){
                for(Student student: studentList){
                    System.out.println(student);
                }
            }
        }
    }

    private static void question3() {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("James"));
        students.add(new Student("Peter"));
        students.add(new Student("Messi"));
        students.add(new Student("James"));
        students.add(new Student("Neymar"));
        students.add(new Student("James"));
        System.out.println("Total students: " + students.size());
        System.out.println("Student 4: " + students.toArray()[3]);
        System.out.println("List: " + students);
        System.out.println("First: " + students.toArray()[0] + "\nLast: " + students.toArray()[students.size() - 1]);
        List<Student> temp = new ArrayList<>(students);
        temp.add(0, new Student("Neymar"));
        temp.add(temp.size(), new Student("Peter"));
        students = new LinkedHashSet<>(temp);
        System.out.println("List after add 2 student: " + students);
        Collections.reverse(temp);
        students = new LinkedHashSet<>(temp);
        System.out.println("List reverse: " + students);
        System.out.println("Student id 1: " + findStudentById(1, new ArrayList<>(students)));
        System.out.println("Student name = James: " + findStudentByName("James", new ArrayList<>(students)));
        showStudentDuplicateName(new ArrayList<>(students));
        temp = new ArrayList<>(students);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getId() == 2) {
                temp.get(i).setName("");
            }
        }
        students = new LinkedHashSet<>(temp);
        System.out.println("List After Change Name Id = 2: " + students);
        students.removeIf(student -> student.getId() == 5);
        System.out.println("List After remove student id = 5: " + students);
        Set<Student> copy = new LinkedHashSet<>(students);
        System.out.println("List copy: " + copy);
    }

    public static void question4() {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("James"));
        students.add(new Student("Peter"));
        students.add(new Student("Messi"));
        System.out.println(students);
    }

    public static void question5() {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("James"));
        students.add(new Student("Peter"));
        students.add(new Student("Alex"));
        students = new LinkedHashSet<>(students.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList()));
        System.out.println(students);
    }

    private static void question6() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println(map);
    }

    private static void question7() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Kien");
        map.put(2, "Anh");
        map.put(3, "Phap");
        map.keySet().forEach(e -> {
            System.out.println("Key: " + e);
            System.out.println("Value: " + map.get(e));
        });

        HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        list.sort(new Comparator<String>() {
            public int compare(String str, String str1) {
                return (str).compareTo(str1);
            }
        });
        for (String str : list) {
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println(sortedMap);

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Set of entries: " + entrySet);
    }

    private static void exe2() {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("James", 5.0, LocalDate.parse("1999-02-12")));
        students.add(new Student2("Alex", 5.5, LocalDate.parse("1998-01-22")));
        students.add(new Student2("Peter", 7.0, LocalDate.parse("1997-12-04")));
        students.add(new Student2("Alex", 5.0, LocalDate.parse("1999-02-11")));
        students.add(new Student2("Alex", 4.0, LocalDate.parse("1999-02-11")));
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("List after sort name: " + students);

// cach 1
//        students.sort(Comparator
//                .comparing(Student2::getName)
//                .thenComparing(Student2::getBirthday)
//                .thenComparingDouble(Student2::getScore)
//        );

//        cach 2 custom multi sort
        Collections.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                int temp = s1.getName().compareTo(s2.getName());
                if (temp != 0) {
                    return temp;
                }
                temp = s1.getBirthday().compareTo(s2.getBirthday());
                if (temp != 0) {
                    return temp;
                }
                return s1.getScore().compareTo(s2.getScore());
            }
        });
        System.out.println("List after multi sort: " + students);
    }

}