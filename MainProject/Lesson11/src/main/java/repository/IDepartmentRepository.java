package repository;

import java.sql.SQLException;

public interface IDepartmentRepository {

    void createProcedure();
    void deleteDepartmentUsingProcedure(int id);
    String getDepartmentNameUsingProcedure(int id);
    void deleteDepartmentByID(int id) throws SQLException;

}
