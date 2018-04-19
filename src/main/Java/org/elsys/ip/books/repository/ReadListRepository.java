package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.ReadList;
import org.elsys.ip.books.model.User;
import org.elsys.ip.books.resource.UserResource;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ReadListRepository {
    //TODO
    public List<ReadList> getReadList(Integer id){
        List<ReadList> list = null;
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("SELECT list FROM org.elsys.ip.books.model.ReadList list " +
//                "WHERE list.user_id =" + id);
//        list = (List<ReadList>) query.list();
//        session.close();
        return list;
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
