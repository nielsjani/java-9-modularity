package party.screen;

import gamestate.core.GameState;
import menu.api.ScreenRenderer;
import party.core.member.PartyMember;

public class PartyScreenRenderer implements ScreenRenderer {

    @Override
    public void render(GameState gameState){
        System.out.println("\n Party screen \n -------------------");
        gameState.getPartyMembers().forEach(this::doRender);
    }

    @Override
    public String getName() {
        return "PARTY_SCREEN";
    }

    private void doRender(PartyMember partyMember) {
        String name = partyMember.getName();
        //Can access stats even though it is not exported? ...or can it?
//        int atk = partyMember.getStats().getAtk();
        //Wont work unless exported + required
//                new PartyUtil()
        System.out.println(name + " : " + 9001);
    }

}
