package com.electioneer.votesubmission.other;

public class RegionalVoteHandler {
    public void handleVote(String partyMemberId, String citizenId) {
        new RegionalVoteRegistrationService().register(partyMemberId);
        new CitizenVotingRecordService().register(citizenId, "REGIONAL");
    }
}
