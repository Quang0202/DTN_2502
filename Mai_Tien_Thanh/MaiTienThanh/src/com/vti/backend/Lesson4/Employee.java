package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Employee extends User{
    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public double calculatePay() {
        return getSalaryRatio() * 420;
    }
}

