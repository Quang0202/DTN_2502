package backend.repository;

import com.mysql.cj.jdbc.JdbcConnection;
import entity.Manufacturer;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManufacturerRepository implements IManufacturerRepository {
    Connection connection = JdbcUtils.getConnection();

    public Manufacturer findManufacturerById(int id) {
        String sql = "SELECT * FROM manufacturer\n" +
                "WHERE manufacturerId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Manufacturer manufacturer = new Manufacturer(resultSet.getInt(1), resultSet.getString(2));
            return manufacturer;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
