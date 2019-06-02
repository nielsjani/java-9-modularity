package com.electioneer.votesubmission.domain;

public class VotingBootRepository {

    public VotingBoot findVotingBootById(String id) {
        if (id.equals("ERROR")) {
            return new VotingBoot(id, "-1", "12.25");
        }
        return new VotingBoot(id, "1", "12.25");
    }
}
