package model5;

public class SmartPhone extends Phone{

    public void use3G() {
        System.out.println("Ket noi Internet ...");
    }

    public void chupHinh() {
        System.out.println("Taking picture ...");
    }

    @Override
    public void attackBadPeople() {
        System.out.println("Nem dien thoai ...");
    }
}
