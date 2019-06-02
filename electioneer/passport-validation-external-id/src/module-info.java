import com.electioneer.passportvalidation.id.validator.PassportIdValidator;
import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.id {
    requires transitive com.electioneer.passportvalidationapi;
    provides PassportValidator with PassportIdValidator;
}