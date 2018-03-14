package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AuthorRepository {
    public List<Author> getAuthor(){
        List<Author> author = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM org.elsys.ip.books.model.Author");
        author = (List<Author>) query.list();
        session.close();
        return author;
    }


    public List<Author> addAuthor(Author аuthor){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(аuthor);
        session.getTransaction().commit();
        return getAuthor();
    }

    public Author getAuthorById(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Author book = session.get(Author.class, id);
        session.close();
        return book;
    }
}
