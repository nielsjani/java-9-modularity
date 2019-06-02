package com.electioneer.passportvalidationapi;


import com.electioneer.passport.Passport;

public interface PassportValidator {

    public void validate(Passport passport);
}
