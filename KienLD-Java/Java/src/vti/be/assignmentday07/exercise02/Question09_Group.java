package vti.be.assignmentday07.exercise02;

import java.util.Arrays;

public class Question09_Group {
    int gr_id;
    String gr_name;
    String creator;
    Question09_Accounts[] accounts;

    @Override
    public String toString() {
        return "Question09_Group{" +
                "gr_id=" + gr_id +
                ", gr_name='" + gr_name + '\'' +
                ", creator='" + creator + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public Question09_Group() throws InvalidAgeInputingException {
        gr_id = Utils.input_grid("Enter Group ID");
        gr_name = Utils.input_grname("Enter Group Name");
        this.creator = Utils.input_grname("Enter Creator Name");
        accounts = new Question09_Accounts[]{Utils.input_accounts("Enter accounts")};
    }

}
