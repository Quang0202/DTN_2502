import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CanBo {
    String HoVaTen;
    int age;
    String sex;
    String address;

    public CanBo() {

    }

    public CanBo(String HoVaTen, int age,String sex, String address) {
        this.HoVaTen = HoVaTen;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "HoVaTen='" + HoVaTen + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }

}
