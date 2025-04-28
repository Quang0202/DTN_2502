package org.example.backend;

import org.example.JdbcUtils;
import org.example.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DepartmentDao {
    public static void main(String args[]) {
    }



    public static void question01() {
        ArrayList<Department> departments = new ArrayList<>();
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            Statement stmt = conn.createStatement();
            String sql = "select * from Department";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                departments.add(new Department(
                        rs.getInt(1) ,
                                rs.getString(2)));

            }
            for ( Department p : departments) {
                System.out.println(p);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void question02() {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            Statement stmt = conn.createStatement();
            String sql = "select * from Department where departmentid=\"11\";\n";
            ResultSet rs = stmt.executeQuery(sql);

            if( !rs.next() ) {
                throw new Exception("Cannot find department which has id = 5");
            } else {
                while (rs.next()) {
                    System.out.println(
                            rs.getInt(1) + " " +
                                    rs.getString(2)
                    );
                }

            }

            // close connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void question03(int id) {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            String sql = "select * from Department where departmentid=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            boolean found = false;

            while( rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2)
                );

                found = true;
            }
            if( !found) {
                throw new Exception("Cannot find department which has id = " + " " + id);
            }
            // close connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean question04(String name) {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            String sql = "select * from Department where departmentname=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            ResultSet resultSet = stmt.executeQuery();


            boolean rs = true;

            while ( !resultSet.next()) {
                rs = false;
                return  rs;
            }
            if( !resultSet.next()) {
                return rs;
            }
            // close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean question04_checkid(int id) {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            String sql = "select * from Department where departmentid=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            boolean rs = true;
            while ( !resultSet.next()) {
                rs = false;
                return  rs;
            }
            if( !resultSet.next()) {
                return rs;
            }
            // close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean question05(String name) {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            if( question04(name) ) {
                throw new Exception("Department Name is exits " + name);
            } else {
                String sql_insert = "INSERT INTO Department( DepartmentName )  VALUES(?) ";
                PreparedStatement stmt_insert = conn.prepareStatement(sql_insert);
                stmt_insert.setString(1, name);
                stmt_insert.executeUpdate();
            }
            // close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void question06(int id, String name) {
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            if( question04_checkid(id) ) {

                String sql_checkname = "select * from Department where departmentname=?";
                PreparedStatement stmt_checkname = conn.prepareStatement(sql_checkname);
                stmt_checkname.setString(1, name);
                ResultSet rs_checkname = stmt_checkname.executeQuery();
                String NameCheck = " ";
                while (rs_checkname.next()) {
                    NameCheck  = rs_checkname.getString(2);
                }
                if(NameCheck.equals(name)) {
                    System.out.println("Name Duplicate");
                } else {
                    String sql_insert = "INSERT INTO Department( DepartmentName )  VALUES(?) ";
                    PreparedStatement stmt_insert = conn.prepareStatement(sql_insert);
                    stmt_insert.setString(1, name);
                    stmt_insert.executeUpdate();
                    System.out.println("Data Updated");
                }



            }
             else {
                 throw new Exception("Cannot find department which has id = " + id);

            }
            // close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void question01procedure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa vao day: ");
        int id = sc.nextInt();

        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            CallableStatement stmt = null;
            // crate statement
            if( question04_checkid(id) ) {
                stmt = conn.prepareCall("{call sp_delete_department(?)}");
                stmt.setInt(1, id);
                stmt.execute();
            }
            else {
                throw new Exception("Cannot find department which has id = " + id);

            }
            // close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void transaction() throws SQLException {
        JdbcUtils jdbcUtils = new JdbcUtils();
        Connection conn = jdbcUtils.isConnectedForTesting();
        try{
            //Assume a valid connection object conn
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            String SQLB1 = "Delete from account where departmentid=3";
            stmt.executeUpdate(SQLB1);
            //Submit a malformed SQL statement that breaks
            String SQLB2 = "Delete from department where departmentid=3";
            stmt.executeUpdate(SQLB2);
            // If there is no error.
            conn.commit();
        }catch(SQLException se){
            // If there is any error.
            conn.rollback();
        }

    }












}
