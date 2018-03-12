package org.elsys.ip.books.resource;

import org.elsys.ip.books.model.Language;
import org.elsys.ip.books.service.LanguageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/languages")
public class LanguageResource {
    LanguageService languageService = new LanguageService();

    @GET
    @Produces("application/json")
    public List<Language> getLanguages(){ return languageService.getLanguages();}

}
