import com.electioneer.passportvalidation.userdata.validator.PassportUserdataValidator;
import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.userdata {
    requires transitive com.electioneer.passportvalidationapi;
    provides PassportValidator with PassportUserdataValidator;
}