package com.electioneer.passport.controller;

import com.electioneer.passport.domain.Passport;
import com.electioneer.passport.validation.PassportHologramValidator;
import com.electioneer.passport.validation.PassportIdValidator;
import com.electioneer.passport.validation.PassportUserdataValidator;

public class PassportValidatorController {

    public void validatePassport(Passport passport) {
        new PassportIdValidator().validate(passport);
        new PassportHologramValidator().validate(passport);
        new PassportUserdataValidator().validate(passport);
    }
}
