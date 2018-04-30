package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.List;

public class UserRepository {

    public List<User> getUsers(){
        List<User> users = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM org.elsys.ip.books.model.User");
        users = (List<User>) query.list();
        session.close();
        return users;
    }


    public User addUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        return user;
    }

    public User getUserById(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    public User updateUser(Integer id, User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User old = session.get(User.class, id);
        old.setName(user.getName());
        old.setEmail(user.getEmail());
        old.setPassword(user.getPassword());
        old.setPreferredLanguage(user.getPreferredLanguage());
        session.update(old);
        session.getTransaction().commit();
        session.close();
        return old;
    }

    public User deleteUser(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }
}
