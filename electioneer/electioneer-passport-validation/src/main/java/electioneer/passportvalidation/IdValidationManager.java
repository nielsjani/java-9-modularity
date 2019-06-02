package electioneer.passportvalidation;

public class IdValidationManager {

    public boolean validateId(String id){
        return id.contains("BE");
    }
}
