package electioneer.passportvalidation;

public class PassportHologramValidator implements PassportValidator {
    @Override
    public void validate(Passport passport) {
        HologramServerTransmogrifier.transmogrify(passport.getHologramData());
    }
}
