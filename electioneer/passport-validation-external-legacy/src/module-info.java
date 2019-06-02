import com.electioneer.legacy.LegacyPassportValidator;
import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.legacy {
    requires transitive com.electioneer.passportvalidationapi;
    provides PassportValidator with LegacyPassportValidator;
}