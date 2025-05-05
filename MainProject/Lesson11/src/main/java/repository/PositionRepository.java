package repository;

import entity.Position;
import utils.JdbcUtils;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
* Author: doquang
* CreateDate: 25/4/25
* Depcription:
*/
public class PositionRepository {
    private Connection connection;
    public PositionRepository(){
        connection = JdbcUtils.getConnection();
    }

    public List<Position> getAllPosition(){
        String sql = "SELECT * FROM position;";
        try {
            Statement statement = connection.createStatement();
           ResultSet resultSet =  statement.executeQuery(sql);
           List<Position> positions = new ArrayList<>();
           while (resultSet.next()){
               Position position = new Position(resultSet.getString(2),resultSet.getInt(1));
               positions.add(position);
           }
           return positions;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void createPosition(String positionName){
        String sql = "INSERT INTO `entity.Position`(positionName) \n" +
                "VALUES (?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,positionName);
            preparedStatement.executeUpdate();
            System.out.println("Create entity.Position Success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updatePosition(int id, String newPositionName){
        String sql = "UPDATE position \n" +
                "SET positionName = ? \n" +
                "Where positionId = ? ;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newPositionName);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
            System.out.println("Update entity.Position Success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Boolean checkPositionNameExists(String positionName){

        String sql = "SELECT * FROM entity.Position\n" +
                "WHERE PositionName = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, positionName);
            ResultSet resultSet = preparedStatement.executeQuery();
            Timestamp timestamp = resultSet.getTimestamp("CreateDate");
            Date date = resultSet.getDate(2);
            LocalDate localDate = date.toLocalDate();
            LocalDateTime localDateTime = timestamp.toLocalDateTime();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
