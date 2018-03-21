package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.ReadList;
import org.elsys.ip.books.model.User;
import org.elsys.ip.books.service.UserService;

import javax.ws.rs.*;
import java.util.List;

public class UserResource {

    UserService userService = new UserService();

    @GET
    @Produces("application/json")
    public List<User> getUsers(){ return userService.getUsers();}

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public User addUser(User user) {
        return userService.addUser(user);
    }


    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public User updateUser(@PathParam("id") Integer id, User user) {
        return userService.updateUser(id, user);
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public User deleteUser(@PathParam("id") Integer id) {
        return userService.deleteUser(id);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public User getUserById(@PathParam("id") Integer id){
        return userService.getUserById(id);
    }


    @GET
    @Path("/{id}/readList/")
    @Produces("application/json")
    public List<ReadList> getReadList(@PathParam("id") Integer id){
        return userService.getReadList(id);
    }

    @POST
    @Path("/{id}/readList")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadList addReadList(ReadList readList) {
        return userService.addInReadList(readList);
    }


    @PUT
    @Path("/{id}/readList/{readListID}")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadList updateReadList(@PathParam("readListID") Integer id, ReadList readList) {
        return userService.updateReadList(id, readList);
    }

    @DELETE
    @Path("/{id}/readList/{readListID}")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadList deleteReadList(@PathParam("readListID") Integer id) {
        return userService.deleteReadList(id);
    }

}
