package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Position;

public class Exercise1 {
    private Connection connection;

    public Exercise1() throws Exception {
        connection = JdbcUtils.getInstance().connect();
    }

    // Question 1: Connect database
    public void connectDatabase() {
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connect success!");
            } else {
                System.out.println("Connect failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Question 2: Get all positions
    public void getAllPositions() throws SQLException {
        String sql = "SELECT * FROM `Position`";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("PositionID");
            String name = resultSet.getString("PositionName");
            System.out.println(new Position(id, name));
        }
    }

    // Question 3: Create Position
    public void createPosition() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input position name (Dev/Test/Scrum Master/PM): ");
        String name = scanner.nextLine();

        String sql = "INSERT INTO `Position` (PositionName) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        int result = preparedStatement.executeUpdate();
        if (result > 0) {
            System.out.println("Create position success!");
        }
    }

    // Question 4: Update Position
    public void updatePositionName() throws SQLException {
        String sql = "UPDATE `Position` SET PositionName = 'Dev' WHERE PositionID = 5";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        int result = preparedStatement.executeUpdate();
        if (result > 0) {
            System.out.println("Update position success!");
        } else {
            System.out.println("Position with id=5 not found!");
        }
    }

    // Question 5: Delete Position
    public void deletePositionById() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM `Position` WHERE PositionID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        int result = preparedStatement.executeUpdate();
        if (result > 0) {
            System.out.println("Delete position success!");
        } else {
            System.out.println("Position with id=" + id + " not found!");
        }
    }
}
