package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.BookDescription;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BookDescriptionRepository {

    private List<BookDescription> getBookDescriptions(){
        List<BookDescription> bookDescriptions = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM org.elsys.ip.books.model.Author");
        bookDescriptions = (List<BookDescription>) query.list();
        session.close();
        return bookDescriptions;
    }
    //TODO
    public BookDescription getLocalisedDescription(Integer languageId, Integer bookId){
        BookDescription bookDescriptions = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT desc FROM org.elsys.ip.books.model.BookDescription desc " +
                "WHERE desc " + + " ");
        bookDescriptions = (List<BookDescription>) query.list();
        session.close();
        return bookDescriptions;
    }
    public List<BookDescription> getByName(String name){
        List<BookDescription> bookDescriptions = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT desc FROM org.elsys.ip.books.model.BookDescription desc " +
                "WHERE desc.name LIKE'%" + name +"%'");
        bookDescriptions = (List<BookDescription>) query.list();
        session.close();
        return bookDescriptions;
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
