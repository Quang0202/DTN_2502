package service;

import repository.DepartmentRepository;
import repository.IDepartmentRepository;

import java.sql.SQLException;

public class DepartmentService {
    private IDepartmentRepository iDepartmentRepository;
    public DepartmentService(){
        iDepartmentRepository = new DepartmentRepository();
    }

    public void deleteDepartmentByID(int id) throws SQLException {
        iDepartmentRepository.deleteDepartmentByID(id);
    }

}
