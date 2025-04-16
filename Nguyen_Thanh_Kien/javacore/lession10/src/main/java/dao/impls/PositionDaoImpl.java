package dao.impls;

import dao.Dao;
import model.Position;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PositionDaoImpl implements Dao<Position> {
    private static Connection connect;
    private static PreparedStatement pst;
    private static ResultSet rs;

    public PositionDaoImpl() {
        getConnection();
    }

    @Override
    public List<Position> getAll() {
        return List.of();
    }

    @Override
    public Optional<Position> findById(int id) {
        getConnection();
        Position position = new Position();
        try {
            pst = connect.prepareStatement("SELECT * FROM Position WHERE position_id = ?");
            pst.setInt(1, id);
            pst.setMaxRows(1);
            rs = pst.executeQuery();
            if (!rs.next()) {
                throw new RuntimeException("Position id: " + id + " not found");
            }
            position.setPositionId(rs.getInt("position_id"));
            position.setPositionName(rs.getString("position_name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return Optional.of(position);
    }

    @Override
    public List<Position> findByName(String name) {
        return List.of();
    }

    @Override
    public void save(Position position) {
        getConnection();
        try {
            pst = connect.prepareStatement("INSERT INTO `Position`(position_name) VALUES(?)");
            pst.setString(1, position.getPositionName());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    @Override
    public void update(Position position) {
        getConnection();
        try {
            pst = connect.prepareStatement("UPDATE Position SET position_name = ? WHERE position_id = ?");
            pst.setString(1, position.getPositionName());
            pst.setInt(2, position.getPositionId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    @Override
    public void delete(Position position) {
        getConnection();
        try {
            pst = connect.prepareStatement("DELETE FROM Position WHERE position_id = ?");
            pst.setInt(1, position.getPositionId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    public List<Position> getAll(String[] columns) {
        getConnection();
        List<Position> positions = new ArrayList<>();
        try {
            if (columns != null && columns.length > 0) {
                String columnName = String.join(",", columns);
                pst = connect.prepareStatement("SELECT " + columnName + " FROM Position");
                rs = pst.executeQuery();
                while (rs.next()) {
                    Position position = new Position();
                    if (columnName.contains("position_id")) {
                        position.setPositionId(rs.getInt("position_id"));
                    }
                    if (columnName.contains("position_name")) {
                        position.setPositionName(rs.getString("position_name"));
                    }
                    positions.add(position);
                }
            } else {
                throw new RuntimeException("Columns is empty");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return positions;
    }

    private static void getConnection() {
        try {
            connect = ConnectionUtil.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void close() {
        try {
            if (rs != null) rs.close();
            if (connect != null) connect.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
