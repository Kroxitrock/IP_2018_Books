package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.Language;
import org.elsys.ip.books.service.LanguageService;

import javax.ws.rs.*;
import java.util.List;

@Path("/languages")
public class LanguageResource {
    LanguageService languageService = new LanguageService();

    @GET
    @Produces("application/json")
    public List<Language> getLanguages(){ return languageService.getLanguages();}

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Language addLanguage(Language language) {
        return languageService.addLanguages(language);
    }


    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Language updateLanguage(@PathParam("id") Integer id, Language language) {
        return languageService.updateLanguage(id, language);
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Language deleteLanguage(@PathParam("id") Integer id) {
        return languageService.deleteLanguage(id);
    }
}
