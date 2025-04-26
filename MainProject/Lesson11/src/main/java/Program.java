import repository.AccountRepository;
import repository.DepartmentRepository;
import repository.PositionRepository;
import utils.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        System.out.printf("%-10s| %-10s| %-10s \n","email","fullName","password");
        String str = "nguye nvana@vti.com.vn";
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+[.][a-zA-Z0-9.]+";
        System.out.println(str.matches(regex));
        if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){

        }

        String fullName = "abcm đ";
        System.out.println(fullName.matches("[\\p{L} ]+"));

//        Connection connection = utils.JdbcUtils.getConnection();
//        if(connection != null) {
//            String sql = "SELECT * FROM entity.Department\n" +
//                    "Where departmentID >4;\n";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            List<entity.Department> departments = new ArrayList<>();
//            while (resultSet.next()) {
////            System.out.println(resultSet.getInt(1)+" "+ resultSet.getString("DepartmentName"));
//                entity.Department department = new entity.Department(resultSet.getInt(1), resultSet.getString(2));
//                departments.add(department);
//            }
//
//            for (entity.Department department : departments) {
//                System.out.println(department);
//            }
//            String sql = "INSERT INTO department(departmentName)\n" +
//                    "VALUES ('test6');";
//            Statement statement = connection.createStatement();
////            int num = statement.executeUpdate(sql);
//            boolean result = statement.execute(sql);
//            ResultSet resultSet = statement.getResultSet();
//            int num = statement.getUpdateCount();
//            System.out.println(num);

//            String sql = "INSERT INTO `entity.Account`(Email, Username, FullName, DepartmentID, PositionID, CreateDate, entity.Gender)\n" +
//                    "VALUES (?, ?, ?, ?, ?, ?, ?);";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1,"nguyenvana@gmail.com");
//            preparedStatement.setString(2,"nguyenvana");
//            preparedStatement.setString(3,"nguyen van a");
//            preparedStatement.setInt(4,3);
//            preparedStatement.setInt(5,1);
//            LocalDateTime localDateTime = LocalDateTime.now();
//            preparedStatement.setTimestamp(6, Timestamp.valueOf(localDateTime));
//            preparedStatement.setString(7,"M");
//            preparedStatement.execute();

//        }
//        PositionRepository positionRepository = new PositionRepository();
//        List<entity.Position> positions = positionRepository.getAllPosition();
//        for(entity.Position p: positions){
//            System.out.println(p);
//        }
//        positionRepository.createPosition("Test");
//        positionRepository.updatePosition(2,"Dev");
//        System.out.println(positionRepository.checkPositionNameExists("dev2"));
//        DepartmentRepository departmentRepository = new DepartmentRepository();
//        departmentRepository.createProcedure();
//        departmentRepository.deleteDepartmentUsingProcedure(1);
//           String result = departmentRepository.getDepartmentNameUsingProcedure(2);
//        System.out.println(result);
//         AccountRepository accountRepository = new AccountRepository();
//
//        Connection connection = JdbcUtils.getConnection();
//        connection.setAutoCommit(false);
//        try{
//            accountRepository.deleteAccountByDepartmentID(3);
//            departmentRepository.deleteDepartmentByID(2);
//          connection.commit();
//            System.out.println("Success!");
//        } catch (Exception e){
//           connection.rollback();
//           e.printStackTrace();
//            System.out.println("Rollback");
//        }
//
//        connection.setAutoCommit(true);



    }
}
