package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.Author;
import org.elsys.ip.books.model.Book;
import org.elsys.ip.books.service.AuthorService;

import javax.ws.rs.*;
import java.util.List;

@Path("/authors")
public class AuthorResource {

    AuthorService authorService = new AuthorService();

    @GET
    @Produces("application/json")
    public List<Author> getAuthors(){ return authorService.getAuthors();}

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Author addAuthor(Author author) {
        return authorService.addAuthor(author);
    }


    @GET
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Author getAuthorById(@PathParam("id") Integer id) {
        return authorService.getAuthorById(id);
    }

    //TODO Get authors by name

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Author updateAuthor(@PathParam("id") Integer id, Author author) {
        return authorService.updateAuthor(id, author);
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Author deleteAuthor(@PathParam("id") Integer id) {
        return authorService.deleteAuthor(id);
    }


    @GET
    @Path("/{id}/books")
    @Consumes("application/json")
    @Produces("application/json")
    public List<Book> getBooksByAuthor(@PathParam("id") Integer id) {
        return authorService.getBooksByAuthor(id);
    }
}
