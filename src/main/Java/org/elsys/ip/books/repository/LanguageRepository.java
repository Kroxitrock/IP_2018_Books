package org.elsys.ip.books.repository;

import org.elsys.ip.books.config.HibernateUtil;
import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.model.Language;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LanguageRepository {
    public List<Language> getLanguages(){
        List<Language> languages = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM org.elsys.ip.books.model.Language");
        languages = (List<Language>) query.list();
        session.close();
        return languages;
    }
}
