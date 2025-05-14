package Exercise4.backend;

import Exercise4.entity.MyMath;
import Exercise4.entity.Salary;

import java.util.ArrayList;

public class Exercise4 {

    public void ques1() {
        Salary<Integer> salary = new Salary<>(12000000);
        System.out.println(salary);
    }

    public void ques4() {
        MyMath myMath = new MyMath();
        System.out.println(myMath.sum(1, 2.0, 3.0f));
    }

    public void ques5() {
        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyen Van Nam");
        listWildcards.add(30);
        listWildcards.add("ha dong ha noi");
    }
}
