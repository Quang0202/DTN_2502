package entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository {
    private Connection connection;

    public PositionRepository() {
        connection = JdbcUtils.getConnection();
    }

    public List<Position> getAllPosition() {
        String sql = "Select * from position;";
        List<Position> positions = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                positions.add(new Position(resultSet.getInt(1), resultSet.getString(2)));
            }

            return positions;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void createPosition(String positionName) {
        String sql = "INSERT INTO `position`(positionName) \n" +
                "VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, positionName);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updatePosition(int id, String newName) {
        String sql = "UPDATE `Position` \n" +
                "SET potisionName = ?\n" +
                "WHERE potisionId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Update success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletePosition(int id) {
        String sql = "DELETE FROM `position`\n" +
                "WHERE positionId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Delete success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
