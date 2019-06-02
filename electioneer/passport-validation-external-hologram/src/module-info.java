import com.electioneer.passportvalidation.hologram.validator.PassportHologramValidator;
import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.hologram {
    requires transitive com.electioneer.passportvalidationapi;
    provides PassportValidator with PassportHologramValidator;
}