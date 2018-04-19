package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.model.BookDescription;
import org.elsys.ip.books.model.Comments;
import org.elsys.ip.books.service.BookService;

import javax.ws.rs.*;
import java.util.List;

@Path("/books")
public class BookResource {
    BookService bookService = new BookService();

    @GET
    @Path("/admin")
    @Produces("application/json")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GET
    @Path("/bestBook")
    @Produces("application/json")
    public List<Book> getBestBook(){
        return bookService.getBestBook();
    }


    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }


    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Book updateBook(@PathParam("id") Integer id, Book book) {
        return bookService.updateBook(id, book);
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Book deleteBook(@PathParam("id") Integer id) {
        return bookService.deleteBook(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Book getBookById(@PathParam("id") Integer id){
        return bookService.getBookById(id);
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public List<BookDescription> getDescriptionByName(@DefaultValue("") @QueryParam("name") String name){
        return bookService.getDescriptionByName(name);
    }
    //TODO getLocalisedDescription(int, int)

    @POST
    @Path("/{id}/description")
    @Produces("application/json")
    public BookDescription addDescription(BookDescription description){
        return bookService.addDescription(description);
    }

    @PUT
    @Path("/{id}/description/{descriptionId}")
    @Consumes("application/json")
    @Produces("application/json")
    public BookDescription updateDescription(@PathParam("descriptionId") Integer id, BookDescription description){
        return bookService.updateDescription(id, description);
    }

    @DELETE
    @Path("/{id}/description/{descriptionId}")
    @Consumes("application/json")
    @Produces("application/json")
    public BookDescription deleteDescription(@PathParam("descriptionId") Integer id){return bookService.deleteDescription(id);}


    @GET
    @Path("/{id}/comments")
    @Produces("application/json")
    public Comments getBookComments(@PathParam("id") Integer id){
        return bookService.getCommentsByBook(id);
    }

    @POST
    @Path("/{id}/comments")
    @Produces("application/json")
    public Comments addComment(Comments comment){
        return bookService.addComment(comment);
    }

    @PUT
    @Path("/{id}/comments/{commentId}")
    @Consumes("application/json")
    @Produces("application/json")
    public Comments updateComment(@PathParam("commentId") Integer id, Comments comment){
        return bookService.updateComment(id, comment);
    }

    @DELETE
    @Path("/{id}/comments/{commentId}")
    @Consumes("application/json")
    @Produces("application/json")
    public Comments deleteComment(@PathParam("commentId") Integer id){return bookService.deleteComment(id);}




}
