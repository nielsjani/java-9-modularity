package com.electioneer.passportvalidation.internal;


import com.electioneer.passportvalidationapi.PassportValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import static com.electioneer.passport.Passport.passport;

public class PassportValidatorController {

    public void validatePassport(String id,
                                 String hologramData,
                                 String locationData,
                                 String personalData
    ) {
        readInPropertiesFileFromApiModule();
        ServiceLoader.load(PassportValidator.class).forEach(validator -> {
            System.out.println("Validating with " + validator.getClass().getSimpleName());
            validator.validate(passport()
                    .withId(id)
                    .withHologramData(hologramData)
                    .withLocationData(locationData)
                    .withPersonalData(personalData));
        });
    }

    private void readInPropertiesFileFromApiModule() {
        ModuleLayer.boot().findModule("com.electioneer.passportvalidationapi")
                .ifPresentOrElse(
                        res -> {
                            try {
                                InputStream resourceAsStream = res.getResourceAsStream("validator-settings.properties");
                                String result = new BufferedReader(new InputStreamReader(resourceAsStream))
                                        .lines().collect(Collectors.joining("\n"));
                                System.out.println(" \n Result from reading in properties file from another module");
                                System.out.println(result);
                                System.out.println("\n");
                            } catch (IOException e) {
                                System.out.println("Found properties file module, but could not get properties file");
                            }
                        },
                        () -> System.out.println("Not found :("));
    }
}
