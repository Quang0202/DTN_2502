package kienld.btvn.vti.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kienld.btvn.vti.entity.Department;
import kienld.btvn.vti.repository.IDepartmentRepository;



@Service

public class DepartmentServices implements IDepartmentServices{
    private final IDepartmentRepository iDepartmentRepository;

    
    public DepartmentServices(IDepartmentRepository iDepartmentRepository) {
        this.iDepartmentRepository = iDepartmentRepository;
    }

    public List<Department> getAllDepartment() {
        List<Department> get_all_data_department = iDepartmentRepository.findAll();
        return get_all_data_department;
    }


    public Department CreateNewDepartment(Department department) {
        Department create_new_department = iDepartmentRepository.save(department);
        return create_new_department;
    }


    public Department UpdateDepartment(Integer id,  Department department) {
        Optional<Department> exits = iDepartmentRepository.findById(id);
        if(exits.isPresent()) { 
            Department existing  = exits.get();
            existing.setDepartmentID(id); existing.setDepartmentName(department.getDepartmentName());
             return iDepartmentRepository.save(existing);
        }
        return department;

    }
        public void DeleteDepartment(Integer id) {
        Optional<Department> exits = iDepartmentRepository.findById(id);
        if(exits.isPresent()) { 
            iDepartmentRepository.deleteById(id);
        }
        


       

        
        
        
        
    }
}


