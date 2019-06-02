import com.electioneer.geoservice.api.GeoService;

module com.electioneer.votesubmission {
    exports com.electioneer.votesubmission.controller;
    requires com.electioneer.geoservice;
    uses GeoService;
}