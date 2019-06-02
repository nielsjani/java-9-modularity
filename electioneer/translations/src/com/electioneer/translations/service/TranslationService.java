package com.electioneer.translations.service;

import com.electioneer.translations.api.Translation;

import java.util.ResourceBundle;

public class TranslationService {
    public Translation translate(String key) {
        ResourceBundle translations_en = ResourceBundle.getBundle("Translations_en");
        ResourceBundle translations_fr = ResourceBundle.getBundle("Translations_fr");
        ResourceBundle translations_nl = ResourceBundle.getBundle("Translations_nl");
        Translation translation = new Translation();
        translation.translationPerLanguage.put("ENGLISH", translations_en.getString(key));
        translation.translationPerLanguage.put("FRENCH", translations_fr.getString(key));
        translation.translationPerLanguage.put("DUTCH", translations_nl.getString(key));
        return translation;
    }
}
