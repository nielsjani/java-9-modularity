package com.electioneer.passportvalidation.hologram.validator;


import com.electioneer.passport.Passport;
import com.electioneer.passportvalidation.hologram.util.HologramServerTransmogrifier;
import com.electioneer.passportvalidationapi.PassportValidator;

public class PassportHologramValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        HologramServerTransmogrifier.transmogrify(passport.getHologramData());
    }
}
