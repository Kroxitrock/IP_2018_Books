package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.Comments;
import org.hibernate.Session;

public class CommentsRepository {
    //TODO
    public Comments getCommentByBook(Integer id){
        return null;
    }

    public Comments addComment(Comments comment){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(comment);
        session.getTransaction().commit();
        return comment;
    }
    public Comments updateComment(Integer id, Comments comment){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Comments old = session.get(Comments.class, id);
        old.setBody(comment.getBody());
        old.setRating(comment.getRating());
        session.update(old);
        session.getTransaction().commit();
        session.close();
        return old;
    }
    public Comments deleteComment(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Comments comment = session.get(Comments.class, id);
        session.delete(comment);
        session.getTransaction().commit();
        session.close();
        return comment;
    }
}
