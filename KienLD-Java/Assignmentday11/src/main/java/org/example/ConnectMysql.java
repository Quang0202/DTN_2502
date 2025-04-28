package org.example;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ConnectMysql {
    public static void main(String args[]) {
        try {

            JdbcUtils jdbcUtils = new JdbcUtils();

            Connection conn = jdbcUtils.isConnectedForTesting();
            // crate statement

            Statement stmt = conn.createStatement();


//            ResultSet rs = stmt.executeQuery("select * from Department");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
//
//            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
