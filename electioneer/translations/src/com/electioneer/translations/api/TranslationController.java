package com.electioneer.translations.api;

import com.electioneer.translations.service.TranslationService;

public class TranslationController {

    public Translation getTranslation(String key) {
        return new TranslationService().translate(key);
    }
}
