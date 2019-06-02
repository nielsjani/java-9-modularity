package com.electioneer.passportvalidation.internal;


import com.electioneer.passportvalidationapi.PassportValidator;

import java.util.ServiceLoader;

import static com.electioneer.passport.Passport.passport;

public class PassportValidatorController {

    public void validatePassport(String id,
                                 String hologramData,
                                 String locationData,
                                 String personalData
    ) {
        ServiceLoader.load(PassportValidator.class).forEach(validator -> {
            System.out.println("Validating with " + validator.getClass().getSimpleName());
            validator.validate(passport()
                    .withId(id)
                    .withHologramData(hologramData)
                    .withLocationData(locationData)
                    .withPersonalData(personalData));
        });
    }
}
