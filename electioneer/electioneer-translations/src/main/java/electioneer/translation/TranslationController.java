package electioneer.translation;

public class TranslationController {

    public Translation getTranslation(String key) {
        return new TranslationService().translate(key);
    }
}
