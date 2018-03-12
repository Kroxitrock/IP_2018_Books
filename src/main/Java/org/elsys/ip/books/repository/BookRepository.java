package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BookRepository {
    public List<Book> getBooks(){
        List<Book> books = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM org.elsys.ip.books.model.Book");
        books = (List<Book>) query.list();
        session.close();
        return books;
    }
}
