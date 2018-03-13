package org.elsys.ip.books.service;

import org.elsys.ip.books.model.Language;
import org.elsys.ip.books.repository.LanguageRepository;

import java.util.List;

public class LanguageService {
    private LanguageRepository languageRepository = new LanguageRepository();

    public List<Language> getLanguages(){ return languageRepository.getLanguages();}
    public List<Language> addLanguages(Language language){ return languageRepository.addLanguages(language);}
    public Language updateLanguage(Integer id, Language language) {
        return languageRepository.updateLanguage(id, language);
    }
}
