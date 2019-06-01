package com.electioneer.translations;

public class TranslationController {

    public Translation getTranslation(String key) {
        return new TranslationService().translate(key);
    }
}
