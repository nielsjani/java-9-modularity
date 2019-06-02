package electioneer.passport;


import electioneer.passportvalidation.Passport;
import electioneer.passportvalidation.PassportHologramValidator;
import electioneer.passportvalidation.PassportIdValidator;
import electioneer.passportvalidation.PassportUserdataValidator;

public class PassportValidatorController {

    public void validatePassport(Passport passport) {
        new PassportIdValidator().validate(passport);
        new PassportHologramValidator().validate(passport);
        new PassportUserdataValidator().validate(passport);
    }
}
