package com.electioneer.passportvalidation.other;

public class IdValidationManager {

    public boolean validateId(String id){
        return id.contains("BE");
    }
}
