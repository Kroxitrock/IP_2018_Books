package org.elsys.ip.books.service;

import org.elsys.ip.books.model.Language;
import org.elsys.ip.books.repository.LanguageRepository;

import java.util.List;

public class LanguageService {
    private LanguageRepository languageRepository = new LanguageRepository();

    public List<Language> getLanguages(){ return languageRepository.getLanguages();}
}
