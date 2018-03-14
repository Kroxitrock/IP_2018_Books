package org.elsys.ip.books.service;

import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.repository.BookRepository;

import java.util.List;

public class BookService {
    BookRepository bookRepository = new BookRepository();

    public List<Book> getBooks(){return bookRepository.getBooks();}

    public Book getBookById(Integer id){return bookRepository.getBookById(id);}
}
