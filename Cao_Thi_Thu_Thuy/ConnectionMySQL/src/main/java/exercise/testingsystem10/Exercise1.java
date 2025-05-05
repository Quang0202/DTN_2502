package exercise.testingsystem10;

import entity.Position;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
    private Connection connection;
    public void q1(){
        connection = JdbcUtils.getConnection();
    }
    public void q2(){
        connection = JdbcUtils.getConnection();
        if (connection != null){
            String sql = "Select * from Position";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    Position position = new Position();
                    position.setPositionId(resultSet.getInt(1));
                    position.setPositionName(resultSet.getString(2));
                    System.out.println(position);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
