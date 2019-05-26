package com.electioneer.passport.validation;

import com.electioneer.passport.domain.Passport;

public interface PassportValidator {

    public void validate(Passport passport);
}
