package com.electioneer.application;

import com.electioneer.passportvalidation.internal.PassportValidatorController;
import com.electioneer.translations.api.Translation;
import com.electioneer.translations.api.TranslationController;
import com.electioneer.votesubmission.controller.VoteController;
import com.electioneer.votesubmission.controller.VoteSubmission;


public class Application {

    public static void main(String[] args) {
        getTranslations();
        validatePassport();
        vote();
    }

    private static void vote() {
        VoteSubmission voteSubmission = new VoteSubmission("BE123", "1", "Partij tegen de dieren", "1");
        new VoteController().voteLocally(voteSubmission);
        new VoteController().voteRegionally(voteSubmission);
        try {
            VoteSubmission voteSubmissionFake = new VoteSubmission("BE123", "ERROR", "Partij tegen de dieren", "1");
            new VoteController().voteFederal(voteSubmissionFake);
            throw new IllegalStateException("Should not be allowed to vote");
        } catch (IllegalArgumentException e) {
            System.out.println("Voting failed (as expected)");
        }
    }

    private static void getTranslations() {
        Translation kebabTranslation = new TranslationController().getTranslation("kebab");
        kebabTranslation.translationPerLanguage.entrySet()
                .forEach(entry -> System.out.println("Kebab in " + entry.getKey() + " is " + entry.getValue()));
    }

    private static void validatePassport() {
        new PassportValidatorController().validatePassport("BE123456789", "This is a legal hologram.", "Somewhere over the rainbow", "Mr. Swamp-thing");

        try {
            new PassportValidatorController().validatePassport("USA123456789", "This is a legal hologram.", "Somewhere over the rainbow", "Mr. Swamp-thing");
            throw new IllegalStateException("Should have failed!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
