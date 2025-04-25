package vti.be.assignmentday07.exercise02;

public class Question09_Accounts {
    public Question09_Accounts() throws InvalidAgeInputingException {
        this.account_id = Utils.input_account_id("Enter account ID");
        this.account_name = Utils.input_account_name("Enter Account Name");
        this.department_name = Utils.input_department("Enter Department Name");
        this.position_name = Utils.input_position("Enter Position Name");
        this.acc_age = Utils.input_account_age("Enter Account Age");
    }

    int account_id;
    String account_name;

    @Override
    public String toString() {
        return "Question09_Accounts{" +
                "account_id=" + account_id +
                ", account_name='" + account_name + '\'' +
                ", department_name='" + department_name + '\'' +
                ", position_name='" + position_name + '\'' +
                '}';
    }

    String department_name;
    String position_name;
    int acc_age;



}
