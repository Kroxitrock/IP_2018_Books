package org.elsys.ip.books.service;

import org.elsys.ip.books.model.Author;
import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.repository.AuthorRepository;
import org.elsys.ip.books.repository.BookRepository;

import java.util.List;

public class AuthorService {
    private AuthorRepository authorRepository = new AuthorRepository();
    private BookRepository bookRepository = new BookRepository();

//    public List<Author> getAuthors(String name){if (name == "") return authorRepository.getAuthor();
//    else return getAuthorByName("name")}

    public Author addAuthor(Author author){return authorRepository.addAuthor(author);}

    public Author getAuthorById(Integer id){return authorRepository.getAuthorById(id);}

    public List<Author> getAuthorByName(String name){return authorRepository.getAuthorByName(name);}

    public Author updateAuthor(Integer id, Author author){return authorRepository.updateAuthor(id, author);}

    public Author deleteAuthor(Integer id){return authorRepository.deleteAuthor(id);}

    public List<Book> getBooksByAuthor(Integer id){return bookRepository.getBooksByAuthor(id);}
}
