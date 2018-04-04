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

    public Book getBookById(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

    public Book addBook(Book book){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        return book;
    }

    //TODO
    public List<Book> getBestBook(){ return null;}
    public List<Book> getBooksByAuthor(Integer authorId){
        return null;
    }

    public Book updateBook(Integer id, Book book){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Book old = session.get(Book.class, id);
        old.setAuthor(book.getAuthor());
        old.setCoverPath(book.getCoverPath());
        old.setGenre(book.getGenre());
        old.setPrefferedLanguage(book.getPrefferedLanguage());
        old.setReleaseDate(book.getReleaseDate());
        session.update(old);
        session.getTransaction().commit();
        session.close();
        return old;
    }
    public Book deleteBook(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Book book = session.get(Book.class, id);
        session.delete(book);
        session.getTransaction().commit();
        session.close();
        return book;
    }

}
