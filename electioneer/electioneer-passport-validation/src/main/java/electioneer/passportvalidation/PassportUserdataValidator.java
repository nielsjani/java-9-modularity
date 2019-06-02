package electioneer.passportvalidation;


public class PassportUserdataValidator implements PassportValidator{
    @Override
    public void validate(Passport passport) {
        if(isRetardDetected(passport)) {
            throw new IllegalArgumentException("Detected retard");
        }
    }

    private boolean isRetardDetected(Passport passport) {
        return passport.getPersonalData().contains("Van Langenhoven") || passport.getPersonalData().contains("Van Grieken");
    }
}
