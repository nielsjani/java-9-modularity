package electioneer.application;


import electioneer.passport.PassportValidatorController;
import electioneer.passportvalidation.Passport;
import electioneer.translation.Translation;
import electioneer.translation.TranslationController;
import electioneer.votesubmission.controller.VoteController;
import electioneer.votesubmission.controller.VoteSubmission;

import static electioneer.passportvalidation.Passport.passport;

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
        Passport validPassport = passport()
                .withHologramData("This is a legal hologram.")
                .withId("BE123456789")
                .withLocationData("Somewhere over the rainbow")
                .withPersonalData("Mr. Swamp-thing");
        new PassportValidatorController().validatePassport(validPassport);

        Passport invalidPassport = passport()
                .withHologramData("This is a legal hologram.")
                .withId("USA123456789")
                .withLocationData("Somewhere over the rainbow")
                .withPersonalData("Mr. Swamp-thing");
        try {
            new PassportValidatorController().validatePassport(invalidPassport);
            throw new IllegalStateException("Should have failed!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}