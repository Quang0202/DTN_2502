public class CongNhan extends CanBo{

   String level;

    public CongNhan() {

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
