import com.electioneer.passportvalidation.future.validator.Passport2020Validator;
import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.future {
    requires transitive com.electioneer.passportvalidationapi;
    provides PassportValidator with Passport2020Validator;
}