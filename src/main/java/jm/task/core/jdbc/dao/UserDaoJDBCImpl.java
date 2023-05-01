package jm.task.core.jdbc.dao;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//    public UserDaoJDBCImpl() throws SQLException {
//
//
//    }
//        Connection connection = Util.getconnection();
//    public void createUsersTable() throws SQLException {
//        try {
//        connection.prepareStatement("CREATE TABLE IF NOT EXISTS preproject.users1" +
//                                "( id int NOT NULL AUTO_INCREMENT, " +
//                                "name VARCHAR(25), " +
//                                "lastName VARCHAR(25), " +
//                                "age tinyint, " +
//                                "PRIMARY KEY (id))")
//                .execute();
//            System.out.println("Creat table");
//    } catch (SQLException e) {
//            System.out.println("SQL Exeption: " + e.getMessage());
//  //      } finally {
//  //          Util.slose();
//        }
//
//    }
//
//    public void dropUsersTable() throws SQLException {
// //       Connection connection = Util.getconnection();
//        connection.prepareStatement("DROP TABLE IF EXISTS users1").execute();
//        System.out.println("Delete table");
//       // Util.slose();
//
//
//    }
//
//    public void saveUser(String name, String lastName, byte age) throws SQLException {
// //       connection.prepareStatement("insert into users (name, lastName, age) values (?,?,?)");
//        String sql = "insert into users1 (name, lastName, age) values (?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1,name);
//        preparedStatement.setString(2,lastName);
//        preparedStatement.setByte(3,age);
//        preparedStatement.execute();
//   //     Util.slose();
//    }
//
//    public void removeUserById(long id) throws SQLException {
//        String sql = "DELETE FROM preproject.users1 where id = ?";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setLong(1,id);
//        preparedStatement.executeUpdate();
//    }
//
//    public List<User> getAllUsers() throws SQLException {
//        List<User> usersList = new ArrayList<>();
//        ResultSet resultSet = connection.prepareStatement("select * from preproject.users1").executeQuery();
//        while (resultSet.next()) {
//            User user = new User();
//            user.setId(resultSet.getLong(1));
//            user.setName(resultSet.getString(2));
//            user.setLastName(resultSet.getString(3));
//            user.setAge(resultSet.getByte(4));
//            usersList.add(user);
//        }
//        return usersList;
//    }
//
//    public void cleanUsersTable() throws SQLException {
//        connection.prepareStatement("TRUNCATE TABLE users1").executeUpdate();
//        System.out.println("Clear table");
//      //  Util.slose();
//    }
//}
