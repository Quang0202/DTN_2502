package vti.be.assignmentday10.ex2;


public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }

    /**
     *
     * @Deprecated()
     * Method nay da cu roi nhe!
     * Use Method GetIDV2 instead.
     *
     */

    public int getId() {
        return id;
    }
    public String getIdV2() {
        return "MSV" +  " " + id;
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

    static int count = 0;

    public Student(String name) {

        this.id = count += 1;;;
        this.name = name;


    }
    int id;
    String name;
}
