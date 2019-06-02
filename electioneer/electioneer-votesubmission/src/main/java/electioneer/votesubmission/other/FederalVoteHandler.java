package electioneer.votesubmission.other;

public class FederalVoteHandler {
    public void handleVote(String citizenId, String partyMemberId) {
        new EuropeanFederalVoteHandler().handle(citizenId, partyMemberId, "BELGIUM");
    }
}
