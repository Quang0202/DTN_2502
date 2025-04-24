package repositories;

import entity.Department;
import entity.Position;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PositionRepository {
    private Connection connection;

    public PositionRepository(){
        connection = JdbcUtils.getConnection();
    }
    public Position getPositionByID(int id){
        String sql = "Select * from Position where PositionID= ?;";
        if (connection != null){
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    Position position = new Position();
                    position.setPositionId(resultSet.getInt("PositionID"));
                    position.setPositionName(resultSet.getString("PositionName"));
                    return position;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
