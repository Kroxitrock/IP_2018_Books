package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.ReadList;
import org.elsys.ip.books.model.User;
import org.elsys.ip.books.resource.UserResource;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class ReadListRepository {

    public List<ReadList> getReadList(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();

        List readList = session.createCriteria(ReadList.class)
                .createCriteria("user", "u")
                .add( Restrictions.eq("u.id", id) )
                .list();
        return readList;
    }
    public List<ReadList> getByStatus(Integer status){
        return null;
    }

    public ReadList addInReadList(ReadList readList){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(readList);
        session.getTransaction().commit();
        return readList;
    }
    public ReadList updateReadList(Integer id, ReadList readList){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ReadList old = session.get(ReadList.class, id);
        old.setStatus(readList.getStatus());
        session.update(old);
        session.getTransaction().commit();
        session.close();
        return old;
    }
    public ReadList deleteReadList(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ReadList list = session.get(ReadList.class, id);
        session.delete(list);
        session.getTransaction().commit();
        session.close();
        return list;
    }
}
