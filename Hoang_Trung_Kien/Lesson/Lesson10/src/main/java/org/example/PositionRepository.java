package org.example;

import java.sql.*;

import java.time.LocalDateTime;
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
                "WHERE potisionid = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery();
            Timestamp timestamp = resultSet.getTimestamp("CreateDate");
            LocalDateTime localDateTime = timestamp.toLocalDateTime();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
