package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.BookDescription;
import org.hibernate.Session;

public class BookDescriptionRepository {
    //TODO
    public BookDescription getLocalisedDescription(Integer languageId, Integer bookId){
        return null;
    }
    public BookDescription getByName(String name){
        return null;
    }

    public BookDescription addDescription(BookDescription bookDescription){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(bookDescription);
        session.getTransaction().commit();
        return bookDescription;
    }
    public BookDescription updateDescription(Integer id, BookDescription bookDescription){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        BookDescription old = session.get(BookDescription.class, id);
        old.setName(bookDescription.getName());
        old.setBook(bookDescription.getBook());
        old.setDescription(bookDescription.getDescription());
        old.setLanguage(bookDescription.getLanguage());
        session.update(old);
        session.getTransaction().commit();
        session.close();
        return old;
    }
    public BookDescription deleteDescription(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        BookDescription bookDescription = session.get(BookDescription.class, id);
        session.delete(bookDescription);
        session.getTransaction().commit();
        session.close();
        return bookDescription;
    }
}
