package model5;

public abstract class Phone implements Weapon {
    public void listen() {
        System.out.println("Nghe dien thoai ...");
    }
    public void call() {
        System.out.println("Goi dien ...");
    }
    public void send() {
        System.out.println("Gui tin nhan ...");
    }
    public void receive() {
        System.out.println("Nhan tin nhan ...");
    }
}
