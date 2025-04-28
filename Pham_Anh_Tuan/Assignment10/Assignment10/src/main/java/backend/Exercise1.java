package backend;

import untils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercise1 {
    private Connection connection;

    public Exercise1() throws SQLException {
        connection = JdbcUtils.getConnection();
    }

    public void question1() throws SQLException {
        String sql = "select * from Position";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getByte("position_id");
            String name = resultSet.getString("position_name");
            System.out.println("ID: " + id + " - Name: " + name);
        }
    }

    public void question2(String position_name) throws SQLException {
        String sql = "INSERT INTO `testing_system`.`position`\n" +
                "`position_name`)\n" +
                "VALUES\n" +
                "<{position_name: } = ?>);\n";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,position_name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("position_name");
            System.out.println("Add Position: " + name + " Success");
        }
    }

    // Question 4: Update tên position (id = 5 thành "Dev")
    public void updatePositionName() throws SQLException {
        String sql = "UPDATE Position SET position_name = 'Dev' WHERE position_id = 5";
        PreparedStatement statement = connection.prepareStatement(sql);
        int result = statement.executeUpdate();
        if (result > 0) {
            System.out.println("Update success!");
        }
    }

    // Question 5: Delete position theo ID nhập vào
    public void deletePositionById(int id) throws SQLException {
        String sql = "DELETE FROM Position WHERE position_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        int result = statement.executeUpdate();
        if (result > 0) {
            System.out.println("Delete success!");
        }
    }
}
