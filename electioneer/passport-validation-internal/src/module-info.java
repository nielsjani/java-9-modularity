import com.electioneer.passportvalidationapi.PassportValidator;

module com.electioneer.passportvalidation.internal {
    requires com.electioneer.passportvalidation.aggregator;
    exports com.electioneer.passportvalidation.internal;
    uses PassportValidator;
}