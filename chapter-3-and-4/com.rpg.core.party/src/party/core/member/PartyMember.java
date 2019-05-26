package party.core.member;

import party.core.stats.Stats;

public class PartyMember {
    private String name;
    private Stats stats;

    public PartyMember(String name) {
        this.name = name;
        this.stats = new Stats();
    }

    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }
}
