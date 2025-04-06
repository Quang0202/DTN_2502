import entity.*;

public class Program {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Phone phone = new VietnamesePhone();
        SmartPhone smartPhone = new VietnamesePhone();
        smartPhone.VideoCall();
        VietnamesePhone vietnamesePhone = (VietnamesePhone) phone;
        sum(1,2);
        sum(1,2,3);
        Person person = new Student("nguyen van a","10A1");
        Person person1 = new Person("nguyen van b");
        person.gotoSchool();
        person1.gotoSchool();

        HCN hcn = new HCN(10,5);// instance HCN
        hcn.tinhChuVi();
        HV hv = new HV(10);// instance HCN,HV
        hv.tinhChuVi();
    }
}
