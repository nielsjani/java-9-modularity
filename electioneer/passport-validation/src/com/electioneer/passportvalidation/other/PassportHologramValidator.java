package com.electioneer.passportvalidation.other;


import com.electioneer.passport.Passport;

public class PassportHologramValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        HologramServerTransmogrifier.transmogrify(passport.getHologramData());
    }
}
