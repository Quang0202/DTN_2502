package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Waiter extends User{
    public Waiter(String name, double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public double calculatePay() {
        return getSalaryRatio() * 220;
    }
}
