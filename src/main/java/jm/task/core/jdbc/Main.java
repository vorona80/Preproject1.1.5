package jm.task.core.jdbc;

//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
//import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
     //   Util.getconnection(); //проверка подключения к базе данны
        Util.getSessionFactory();


 //       UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Name1", "LastName1", (byte) 20);
//        System.out.println(userService.getAllUsers().toString());
//        userService.saveUser("Name2", "LastName2", (byte) 25);
//        System.out.println(userService.getAllUsers().toString());
//        userService.saveUser("Name3", "LastName3", (byte) 31);
//        System.out.println(userService.getAllUsers().toString());
//        userService.saveUser("Name4", "LastName4", (byte) 38);
//        System.out.println(userService.getAllUsers().toString());
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
//    //    userDaoJDBC.removeUserById(3);
//        Util.slose();

    }
}
