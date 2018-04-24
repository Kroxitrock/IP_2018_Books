package org.elsys.ip.books.service;

import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.model.BookDescription;
import org.elsys.ip.books.model.Comments;
import org.elsys.ip.books.repository.BookDescriptionRepository;
import org.elsys.ip.books.repository.BookRepository;
import org.elsys.ip.books.repository.CommentsRepository;

import javax.management.Descriptor;
import java.util.List;

public class BookService {
    private BookRepository bookRepository = new BookRepository();
    private BookDescriptionRepository bookDescriptionRepository = new BookDescriptionRepository();
    private CommentsRepository commentsRepository = new CommentsRepository();

    public List<Book> getBooks(){return bookRepository.getBooks();}
    public List<Book> getBestBook(){return bookRepository.getBestBook();}
    public Book getBookById(Integer id){return bookRepository.getBookById(id);}
    public Book addBook(Book book){return bookRepository.addBook(book);}
    public Book updateBook(Integer id, Book book){return bookRepository.updateBook(id, book);}
    public Book deleteBook(Integer id){return bookRepository.deleteBook(id);}

    public BookDescription getLocalisedDescription(Integer languageId, Integer bookId){return bookDescriptionRepository.getLocalisedDescription(languageId, bookId);}
    public BookDescription addDescription(BookDescription description){return bookDescriptionRepository.addDescription(description);}
    public List<BookDescription> getDescriptionByName(String name){return bookDescriptionRepository.getByName(name);}
    public BookDescription updateDescription(Integer id, BookDescription description){return bookDescriptionRepository.updateDescription(id,description);}
    public BookDescription deleteDescription(Integer id){return bookDescriptionRepository.deleteDescription(id);}

    public List<Comments> getCommentsByBook(Integer id){return commentsRepository.getCommentByBook(id);}
    public Comments addComment(Comments comment){return commentsRepository.addComment(comment);}
    public Comments updateComment(Integer id, Comments comment){return commentsRepository.updateComment(id, comment);}
    public Comments deleteComment(Integer id){return commentsRepository.deleteComment(id);}
}

