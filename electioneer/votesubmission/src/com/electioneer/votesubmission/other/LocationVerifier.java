package com.electioneer.votesubmission.other;

import com.electioneer.geoservice.GeoService;
import com.electioneer.geoservice.GeoServiceImpl;
import com.electioneer.geoservice.LocationData;
import com.electioneer.votesubmission.controller.VoteSubmission;
import com.electioneer.votesubmission.domain.Party;
import com.electioneer.votesubmission.domain.PartyRepository;
import com.electioneer.votesubmission.domain.VotingBoot;
import com.electioneer.votesubmission.domain.VotingBootRepository;

public class LocationVerifier {

    private GeoService geoService = new GeoServiceImpl();
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
