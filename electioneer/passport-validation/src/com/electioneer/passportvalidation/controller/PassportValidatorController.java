package com.electioneer.passportvalidation.controller;

import com.electioneer.passport.Passport;
import com.electioneer.passportvalidation.other.PassportHologramValidator;
import com.electioneer.passportvalidation.other.PassportIdValidator;
import com.electioneer.passportvalidation.other.PassportUserdataValidator;

public class PassportValidatorController {

    public void validatePassport(Passport passport) {
        new PassportIdValidator().validate(passport);
        new PassportHologramValidator().validate(passport);
        new PassportUserdataValidator().validate(passport);
    }
}
