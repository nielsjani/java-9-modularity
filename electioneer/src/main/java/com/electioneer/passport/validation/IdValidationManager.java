package com.electioneer.passport.validation;

public class IdValidationManager {

    public boolean validateId(String id){
        return id.contains("BE");
    }
}
