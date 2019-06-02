package electioneer.votesubmission.controller;

public class VoteSubmission {
    private String citizenId;
    private String votingBootId;
    private String partyName;
    private String partyMemberId;

    public VoteSubmission(String citizenId, String votingBootId, String partyName, String partyMemberId) {
        this.citizenId = citizenId;
        this.votingBootId = votingBootId;
        this.partyName = partyName;
        this.partyMemberId = partyMemberId;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public String getVotingBootId() {
        return votingBootId;
    }

    public String getPartyName() {
        return partyName;
    }

    public String getPartyMemberId() {
        return partyMemberId;
    }
}
