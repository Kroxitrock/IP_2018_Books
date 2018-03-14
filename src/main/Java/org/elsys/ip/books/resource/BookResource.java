package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.service.BookService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/books")
public class BookResource {
    BookService bookService = new BookService();

    @GET
    @Produces("application/json")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Book getBookById(@PathParam("id") Integer id){
        return bookService.getBookById(id);
    }
}
