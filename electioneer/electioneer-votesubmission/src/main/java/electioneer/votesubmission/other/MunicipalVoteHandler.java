package electioneer.votesubmission.other;

public class MunicipalVoteHandler {



    public void handleVote(String partyMemberId, String citizenId) {
        new LocalVoteRegistrationService().register(partyMemberId);
        new CitizenVotingRecordService().register(citizenId, "MUNICIPAL");
    }
}
