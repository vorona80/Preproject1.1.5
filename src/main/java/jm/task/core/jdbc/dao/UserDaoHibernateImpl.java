package jm.task.core.jdbc.dao;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;

import javax.management.Query;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }
    private static Transaction transaction = null;

    @Override
    public void createUsersTable() {
  //      Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession();) {
        transaction = session.beginTransaction();

        session.createSQLQuery("CREATE TABLE IF NOT EXISTS users2 " +
                "(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50) NOT NULL, lastName VARCHAR(50) NOT NULL, " +
                "age TINYINT NOT NULL)").executeUpdate();
        transaction.commit();
        session.close();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        }
    }
    @Override
    public void dropUsersTable() {
 //       Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession();) {
        transaction = session.beginTransaction();
        session.createSQLQuery("DROP TABLE IF EXISTS users2").executeUpdate();
        transaction.commit();
        session.close();
    } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = Util.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        User user = new User(name,lastName,age);
        session.save(user);
        session.getTransaction().commit();
    }

    @Override
    public void removeUserById(long id) {
        try (Session session = Util.getSessionFactory().openSession();) {
            transaction = session.beginTransaction();
            User user = session.get(User.class,id);
            session.delete(user);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = Util.getSessionFactory().openSession()) {
            return session.createQuery("from User ", User.class).list();
        }
    }

    @Override
    public void cleanUsersTable() {
        try (Session session = Util.getSessionFactory().openSession();) {
            transaction = session.beginTransaction();
            session.createQuery("delete from User").executeUpdate();
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
