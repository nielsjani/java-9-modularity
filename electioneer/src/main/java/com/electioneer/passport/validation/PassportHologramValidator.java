package com.electioneer.passport.validation;

import com.electioneer.passport.domain.Passport;

public class PassportHologramValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        HologramServerTransmogrifier.transmogrify(passport.getHologramData());
    }
}
