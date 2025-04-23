package Exercise3.entity;

public class OuterClass {
    public void show() {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public class InnerClass {
        public void show() {
            System.out.println("Day la inner class");
        }
    }
}
