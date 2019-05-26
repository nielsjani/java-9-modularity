package com.electioneer.passport.validation;

import com.electioneer.passport.domain.Passport;

public class PassportIdValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        if(!new IdValidationManager().validateId(passport.getId())) {
            throw new IllegalArgumentException("Id validation of passport failed");
        }
    }
}
