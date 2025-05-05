package backend.repositories;

import entity.Position;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PositionRepository implements IPositionRepository {
    private Connection connection;
    public PositionRepository(){
        connection = JdbcUtils.getConnection();
    }
    public Position getPositionByID(int id){
        String sql = "Select * from Position where PositionID = ?;";
        Position position = new Position();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                position.setPositionId(resultSet.getInt("PositionID"));
                position.setPositionName(resultSet.getString("PositionName"));
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return position;
    }
}
