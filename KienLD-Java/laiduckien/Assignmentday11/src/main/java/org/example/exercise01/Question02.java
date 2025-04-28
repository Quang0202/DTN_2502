package org.example.exercise01;

import org.example.JdbcUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Question02 {
    public static void main(String args[]) {
        ArrayList<Position> positions = new ArrayList<>();
        try {
            JdbcUtils jdbcUtils = new JdbcUtils();
            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement
            Statement stmt = conn.createStatement();
            String sql = "select * from Position";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
                positions.add(new Position(rs.getString(2)));

            }
            for ( Position p : positions) {
                System.out.println(p);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
