import menu.api.ScreenRenderer;
import party.screen.PartyScreenRenderer;

module com.rpg.menu.party {
    requires com.rpg.core.party;
    requires com.rpg.core.gamestate;
    requires com.rpg.menu.api;

    provides ScreenRenderer with PartyScreenRenderer;
}