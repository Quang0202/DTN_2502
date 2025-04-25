package org.example.exercise01;

import org.example.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Question03_4_5 {
    public static void main(String args[]) throws SQLException {
//        System.out.println(question04());
        question05(5);




    }

    public static void question03() throws SQLException {
        ArrayList<Position> positions = new ArrayList<>();

        JdbcUtils jdbcUtils = new JdbcUtils();
        Connection conn = jdbcUtils.isConnectedForTesting();
        // crate statement
        String sql = "INSERT INTO POSITION (PositionName)  VALUES(?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, "devops");
        ;
        boolean hadResults = stm.execute();

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("Select * From Position");
        while (rs.next()) {

            positions.add(new Position(rs.getInt(1) + " " + rs.getString(2))) ;

        }
        for( Position p : positions) {
            System.out.println(p);
        }


        conn.close();
    }

    public static int question04() throws SQLException {
        JdbcUtils jdbcUtils = new JdbcUtils();
        Connection conn = jdbcUtils.isConnectedForTesting();
        // crate statement

            String sql = "UPDATE Position SET PositionName=? WHERE PositionID=?";
            PreparedStatement stm = conn.prepareStatement(sql);

            stm.setString(1, "devops");
            stm.setInt(2, 5);
            int hadResults = stm.executeUpdate();
        conn.close();
        return hadResults;
    }
    public static int question05(int id) throws SQLException {
        JdbcUtils jdbcUtils = new JdbcUtils();
        Connection conn = jdbcUtils.isConnectedForTesting();
        // crate statement

        String sql = "DELETE FROM Position WHERE PositionID=?";


        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, id);
        int hadResults = stm.executeUpdate();
        conn.close();
        return hadResults;
    }


}
