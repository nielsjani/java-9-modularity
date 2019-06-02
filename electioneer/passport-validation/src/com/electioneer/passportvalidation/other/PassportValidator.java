package com.electioneer.passportvalidation.other;


import com.electioneer.passport.Passport;

public interface PassportValidator {

    public void validate(Passport passport);
}
