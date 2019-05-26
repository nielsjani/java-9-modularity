package electioneer.passport;

import electioneer.passportvalidation.PassportValidator;

public class PassportValidatorController {

    public void validatePassport(Passport passport) {
        new PassportValidator().validateHologram(passport.getHologramData());
    }
}
