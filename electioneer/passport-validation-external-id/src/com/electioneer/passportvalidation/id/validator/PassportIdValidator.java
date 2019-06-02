package com.electioneer.passportvalidation.id.validator;


import com.electioneer.passport.Passport;
import com.electioneer.passportvalidation.id.util.IdValidationManager;
import com.electioneer.passportvalidationapi.PassportValidator;

public class PassportIdValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        if(!new IdValidationManager().validateId(passport.getId())) {
            throw new IllegalArgumentException("Id validation of passport failed");
        }
    }
}
