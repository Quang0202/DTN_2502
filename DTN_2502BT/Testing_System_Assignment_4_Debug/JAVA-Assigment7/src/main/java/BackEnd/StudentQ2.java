package BackEnd;

public class StudentQ2 {
     private final int id =1;
    protected  String name;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentQ2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public final void  study() {
        System.out.println("Đang học bài____");
    }

}

 