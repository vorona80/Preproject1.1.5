package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl userDaoHibernate;

    {
        try {
            userDaoHibernate = new UserDaoHibernateImpl();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }

    public void createUsersTable() throws SQLException {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoHibernate.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) throws SQLException {
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDaoHibernate.cleanUsersTable();
    }
}
