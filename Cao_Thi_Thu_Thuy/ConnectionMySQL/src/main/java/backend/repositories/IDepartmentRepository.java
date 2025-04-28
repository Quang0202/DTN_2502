package backend.repositories;

import entity.Department;

public interface IDepartmentRepository {
    Department getDepartmentByID(int id);
}
