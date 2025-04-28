package com.programming.nhatanh.lesson10.backend.repository;

import com.programming.nhatanh.lesson10.backend.Utils.JdbcUtils;
import com.vti.entity.Position;

import java.io.IOException;
import java.sql.*;

public class PositionRepository {

    private final Connection connection;

    public PositionRepository() throws SQLException, ClassNotFoundException, IOException {
        connection = JdbcUtils.getConnection();
    }

    //E1Q2
    public void getPositionInfo() throws SQLException {
        String sql = "SELECT * FROM Position";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + "\t");
                System.out.print(resultSet.getString(2) + "\t");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //E1Q2
    public Position getPositionById(int id) throws SQLException {
        String sql = "SELECT * FROM Position "  +
                "WHERE positionID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Position(resultSet.getInt(1),resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    //E1Q3
    public void createPosition(String positionName) throws SQLException {
        String sql = "INSERT INTO position(positionName) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, positionName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //E1Q4
    public void updatePosition(int positionId, String positionName) throws SQLException {
        String sql = "UPDATE Position SET positionName = ? WHERE positionId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, positionName);
            preparedStatement.setInt(2, positionId);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //E1Q5
    public void deletePosition(int positionId) throws SQLException {
        String sql = "DELETE FROM Position WHERE positionId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, positionId);

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Boolean existByPositionName(String positionName) {
        String sql = "SELECT * FROM Position WHERE PositionName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, positionName);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }



}
