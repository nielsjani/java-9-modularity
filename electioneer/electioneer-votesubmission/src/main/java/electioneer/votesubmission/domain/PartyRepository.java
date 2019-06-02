package electioneer.votesubmission.domain;

import java.util.ArrayList;
import java.util.List;

import static electioneer.votesubmission.domain.Party.party;

public class PartyRepository {

    public Party findPartyByName(String partyName) {
        List<PartyMember> partyMembers = new ArrayList<>();
        partyMembers.add(new PartyMember("1"));
        partyMembers.add(new PartyMember("2"));
        partyMembers.add(new PartyMember("3"));

        List<String> municipalities = new ArrayList<>();
        municipalities.add("Boortmeerbeekegem");
        municipalities.add("Stiekem Puerto Rico");
        municipalities.add("Inspiratieisoppegem");

        return party()
                .withName(partyName)
                .withPartyMembers(partyMembers)
                .withVoteableMunicipalities(municipalities)
                .withVotingRegion(VotingRegion.VLAANDEREN);
    }
}
