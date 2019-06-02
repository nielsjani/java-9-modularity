package com.electioneer.votesubmission.locationverifier;

import com.electioneer.geoservice.api.GeoService;
import com.electioneer.geoservice.api.LocationData;
import com.electioneer.votesubmission.controller.VoteSubmission;
import com.electioneer.votesubmission.domain.Party;
import com.electioneer.votesubmission.domain.PartyRepository;
import com.electioneer.votesubmission.domain.VotingBoot;
import com.electioneer.votesubmission.domain.VotingBootRepository;

import java.util.ServiceLoader;

public class LocationVerifier {

    private GeoService geoService = ServiceLoader.load(GeoService.class).findFirst()
            .orElse(new BackupGeoService());

    private VotingBootRepository votingBootRepository = new VotingBootRepository();
    private PartyRepository partyRepository = new PartyRepository();

    public void verifyVoteCanBeSubmittedFromVotingBooth(VoteSubmission voteSubmission) {
        VotingBoot votingBoot = votingBootRepository.findVotingBootById(voteSubmission.getVotingBootId());
        LocationData votingBootLocation = geoService.getLocation(votingBoot.getxCoordinate(), votingBoot.getyCoordinate());
        Party party = partyRepository.findPartyByName(voteSubmission.getPartyName());

        if (!party.getVoteableMunicipalities().contains(votingBootLocation.getMunicipality())) {
            throw new IllegalArgumentException("Voting booth can not vote for this party");
        }
    }
}
