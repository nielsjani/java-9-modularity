package com.electioneer.votesubmission.controller;

import com.electioneer.votesubmission.other.FederalVoteHandler;
import com.electioneer.votesubmission.locationverifier.LocationVerifier;
import com.electioneer.votesubmission.other.MunicipalVoteHandler;
import com.electioneer.votesubmission.other.RegionalVoteHandler;

public class VoteController {

    private LocationVerifier locationVerifier = new LocationVerifier();


    public void voteLocally(VoteSubmission voteSubmission) {
        locationVerifier.verifyVoteCanBeSubmittedFromVotingBooth(voteSubmission);
        new MunicipalVoteHandler().handleVote(voteSubmission.getPartyMemberId(), voteSubmission.getCitizenId());
    }

    public void voteRegionally(VoteSubmission voteSubmission) {
        locationVerifier.verifyVoteCanBeSubmittedFromVotingBooth(voteSubmission);
        new RegionalVoteHandler().handleVote(voteSubmission.getPartyMemberId(), voteSubmission.getCitizenId());
    }

    public void voteFederal(VoteSubmission voteSubmission) {
        locationVerifier.verifyVoteCanBeSubmittedFromVotingBooth(voteSubmission);
        new FederalVoteHandler().handleVote(voteSubmission.getCitizenId(), voteSubmission.getPartyMemberId());
    }
}
