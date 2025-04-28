package com.vti.backend.datalayer;

import com.vti.entity.Admin;
import com.vti.entity.Employee;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

	private JDBCUtils jdbcUtils;

	public UserRepository() {
		jdbcUtils = new JDBCUtils();
	}

	public List<User> getListUsers(){
		List<User> users = new ArrayList<>();
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			Statement statement = connection.createStatement();

			// Step 3: Execute SQL query
			String sql = "SELECT * FROM `User` ORDER BY UserID ASC";
			ResultSet resultSet = statement.executeQuery(sql); // for select

			// Step 4: Handling Result Set
			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				boolean isAdmin = resultSet.getBoolean("isAdmin");

				if (isAdmin) {
					int expInYear = resultSet.getInt("ExpInYear");
					users.add(new Admin(id, fullName, email, expInYear));
				} else {
					String proSkill = resultSet.getString("ProSkill");
					users.add(new Employee(id, fullName, email, proSkill));
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}

		jdbcUtils.disconnect();

		return users;
	}

	public User getUserById(int userId) {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT * FROM `User` WHERE UserID = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, userId);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			// Step 4: Handling Result Set
			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				boolean isAdmin = resultSet.getBoolean("isAdmin");

				if (isAdmin) {
					int expInYear = resultSet.getInt("ExpInYear");
                    return new Admin(id, fullName, email, expInYear);
				} else {
					String proSkill = resultSet.getString("ProSkill");
                    return new Employee(id, fullName, email, proSkill);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			jdbcUtils.disconnect();
		}
		return null;
	}
	
	public boolean deleteUserExistsById(int userId)  {
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "DELETE FROM `User` WHERE UserID = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, userId);
	
			// Step 3: Execute SQL query
			return statement.executeUpdate() > 0;

		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			jdbcUtils.disconnect();
		}
		return false;

	}

	public User login(String in_email, String in_password){
		
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT * FROM `User` WHERE Email = ? AND `Password` = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, in_email);
			statement.setString(2, in_password);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			// Step 4: Handling Result Set
			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				boolean isAdmin = resultSet.getBoolean("isAdmin");

				if (isAdmin) {
					int expInYear = resultSet.getInt("ExpInYear");
					return new Admin(id, fullName, email, expInYear);
				} else {
					String proSkill = resultSet.getString("ProSkill");
					return new Employee(id, fullName, email, proSkill);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			jdbcUtils.disconnect();
		}
		return null;
	}

	
	public boolean isUserExistsByEmail(String email){

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT 1 FROM `User` WHERE Email = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			return resultSet.next() ;
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			jdbcUtils.disconnect();
		}
		return false;
	}

	public void createUser(String fullname, String email){
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "INSERT INTO `User`  (FullName	, 	Email	,	`Password`	,	ExpInYear	, 	ProSkill	, 	isAdmin		)" +
						 "VALUES		      (		?	,	  ?		, 	'A123456'	,		null	,	  null		,  false	)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fullname);
			statement.setString(2, email);
			
			// Step 3: Execute SQL query
			statement.executeUpdate();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			jdbcUtils.disconnect();
		}
	}
}
