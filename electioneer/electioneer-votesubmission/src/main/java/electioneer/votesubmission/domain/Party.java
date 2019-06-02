package electioneer.votesubmission.domain;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private String name;
    private List<PartyMember> partyMembers = new ArrayList<>();
    private List<String> voteableMunicipalities = new ArrayList<>();
    private VotingRegion votingRegion;

    public static Party party() {
        return new Party();
    }

    public String getName() {
        return name;
    }

    public Party withName(String name) {
        this.name = name;
        return this;
    }

    public List<PartyMember> getPartyMembers() {
        return partyMembers;
    }

    public Party withPartyMembers(List<PartyMember> partyMembers) {
        this.partyMembers = partyMembers;
        return this;
    }

    public List<String> getVoteableMunicipalities() {
        return voteableMunicipalities;
    }

    public Party withVoteableMunicipalities(List<String> voteableMunicipalities) {
        this.voteableMunicipalities = voteableMunicipalities;
        return this;
    }

    public VotingRegion getVotingRegion() {
        return votingRegion;
    }

    public Party withVotingRegion(VotingRegion votingRegion) {
        this.votingRegion = votingRegion;
        return this;
    }
}
