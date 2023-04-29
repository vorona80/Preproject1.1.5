package jm.task.core.jdbc.util;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
  //  private static final String Driver = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/preproject";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "йцукен80";

    public static Connection getconnection() {
        //   public static void main(String[] args) {
        Connection connection = null;
        try {
    //        Class.forName(Driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection OK");
            //         Statement statement = connection.createStatement();
            //        System.out.println(connection.isClosed());
            //         statement.execute("insert into users (name, lastName,age) values ('Ivan', 'Ivanov', 31)");
            //       statement.executeUpdate("TRUNCATE TABLE users");

        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);

        //    System.out.println("Ошибка подключения к базе данных");
        }
        return connection;
        // реализуйте настройку соеденения с БД

        }
        public static void slose () throws SQLException {
        getconnection().close();
            System.out.println("Connection close");
        }
    }
//}
