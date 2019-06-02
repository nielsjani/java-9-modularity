package com.electioneer.passportvalidation.id.util;

public class IdValidationManager {

    public boolean validateId(String id){
        return id.contains("BE");
    }
}
