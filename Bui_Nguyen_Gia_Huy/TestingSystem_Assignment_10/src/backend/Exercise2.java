package backend;

public class Exercise2 {
    private DepartmentDAO departmentDao;
    private AccountDAO accountDao;

    public Exercise2() throws Exception {
        departmentDao = new DepartmentDAO();
        accountDao = new AccountDAO();
    }

    public DepartmentDAO getDepartmentDao() {
        return departmentDao;
    }

    public AccountDAO getAccountDao() {
        return accountDao;
    }
}
