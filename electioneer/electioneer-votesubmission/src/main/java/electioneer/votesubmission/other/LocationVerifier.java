package electioneer.votesubmission.other;

import electioneer.geoservice.GeoService;
import electioneer.geoservice.GeoServiceImpl;
import electioneer.geoservice.LocationData;
import electioneer.votesubmission.controller.VoteSubmission;
import electioneer.votesubmission.domain.Party;
import electioneer.votesubmission.domain.PartyRepository;
import electioneer.votesubmission.domain.VotingBoot;
import electioneer.votesubmission.domain.VotingBootRepository;

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
