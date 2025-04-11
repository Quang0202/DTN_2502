package dao.impls;

import dao.Dao;
import model.Department;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DepartmentDaoImpl implements Dao<Department> {
    private static Connection connect;
    private static PreparedStatement pst;
    private static ResultSet rs;

    @Override
    public List<Department> getAll() {
        getConnection();
        List<Department> departments = new ArrayList<>();
        try {
            pst = connect.prepareStatement("SELECT * FROM department");
            rs = pst.executeQuery();
            while (rs.next()) {
                Department department = new Department();
                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));
                departments.add(department);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return departments;
    }

    @Override
    public Optional<Department> findById(int id) {
        getConnection();
        Department department = new Department();
        try {
            pst = connect.prepareStatement("SELECT * FROM Department WHERE department_id = ?");
            pst.setInt(1, id);
            pst.setMaxRows(1);
            rs = pst.executeQuery();
            if (!rs.next()) {
                throw new RuntimeException("Department id: " + id + " not found");
            }
            department.setDepartmentId(rs.getInt("department_id"));
            department.setDepartmentName(rs.getString("department_name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return Optional.of(department);
    }

    @Override
    public List<Department> findByName(String name) {
        getConnection();
        List<Department> departments = new ArrayList<>();
        try {
            pst = connect.prepareStatement("SELECT * FROM Department WHERE department_name = ?");
            pst.setString(1, name);
            rs = pst.executeQuery();
            while (rs.next()) {
                Department department = new Department();
                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));
                departments.add(department);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return departments;
    }

    @Override
    public void save(Department department) {
        getConnection();
        try {
            pst = connect.prepareStatement("INSERT INTO `Department`(department_name) VALUES(?)");
            pst.setString(1, department.getDepartmentName());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        close();
    }

    @Override
    public void update(Department department) {
        getConnection();
        try {
            pst = connect.prepareStatement("UPDATE Department SET department_name = ? WHERE department_id = ?");
            pst.setString(1, department.getDepartmentName());
            pst.setInt(2, department.getDepartmentId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    @Override
    public void delete(Department department) {
        getConnection();
        try {
            pst = connect.prepareStatement("DELETE FROM Department WHERE department_id = ?");
            pst.setInt(1, department.getDepartmentId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    public Boolean isDepartmentNameExists(String name) {
        getConnection();
        List<Department> departments = new ArrayList<>();
        try {
            pst = connect.prepareStatement("SELECT * FROM Department WHERE department_name = ?");
            pst.setString(1, name);
            pst.setMaxRows(1);
            rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    public Boolean isDepartmentExistsAccount(int departmentId) {
        getConnection();
        List<Department> departments = new ArrayList<>();
        try {
            pst = connect.prepareStatement("SELECT * FROM Account WHERE department_id = ?");
            pst.setInt(1, departmentId);
            pst.setMaxRows(1);
            rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    public void deleteDepartmentUsingProcedure(int id) {
        getConnection();
        try {
            pst = connect.prepareCall("call sp_delete_department(?)");
            pst.setInt(1, id);
            pst.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    private static void close() {
        try {
            if (rs != null) rs.close();
            if (connect != null) connect.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getConnection() {
        try {
            connect = ConnectionUtil.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
