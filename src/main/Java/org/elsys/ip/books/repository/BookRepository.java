package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.Author;
import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.model.BookDescription;
import org.elsys.ip.books.model.Comments;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.sql.JoinType;

import java.util.List;

public class BookRepository {
    public List<Book> getBooks(){
        List<Book> books = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
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

    public Book addBook(Book book)  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        return book;
    }

    //TODO
    public List<Book> getBestBook(){
        List<Book> books = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM Comments c " +
                "right outer join Book b " +
                "order by c.rating asc");
        books = (List<Book>) query.list();
        session.close();
        return books;
    }

    public List<Book> getBooksByAuthor(Integer authorId){
        Session session = HibernateUtil.getSessionFactory().openSession();

        List books = session.createCriteria(Book.class)
                .createCriteria("author", "auth")
                .add( Restrictions.eq("auth.id", authorId) )
                .list();
        return books;
    }

    public Book updateBook(Integer id, Book book){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Book old = session.get(Book.class, id);
        old.setAuthor(book.getAuthor());
        old.setCoverPath(book.getCoverPath());
        old.setGenre(book.getGenre());
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
