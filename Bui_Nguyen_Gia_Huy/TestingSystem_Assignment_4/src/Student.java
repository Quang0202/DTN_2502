public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void addScore(float additional) {
        this.score += additional;
    }

    public void printInfo() {
        System.out.println("Student: " + name);
        System.out.println("Score: " + score);
        if (score < 4) {
            System.out.println("Học lực: Yếu");
        } else if (score < 6) {
            System.out.println("Học lực: Trung bình");
        } else if (score < 8) {
            System.out.println("Học lực: Khá");
        } else {
            System.out.println("Học lực: Giỏi");
        }
    }
}
