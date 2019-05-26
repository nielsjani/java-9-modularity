package gamestate.core;

import inventory.core.InventoryItem;
import party.core.member.PartyMember;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private List<PartyMember> partyMembers;
    private List<InventoryItem> inventoryItems;

    public static GameState initialise(){
        GameState gameState = new GameState();
        gameState.partyMembers = new ArrayList<>();
        gameState.partyMembers.add(new PartyMember("Andre"));
        gameState.partyMembers.add(new PartyMember("Stijn"));

        gameState.inventoryItems = new ArrayList<>();
        gameState.inventoryItems.add(new InventoryItem("Potion"));
        gameState.inventoryItems.add(new InventoryItem("Potion"));
        gameState.inventoryItems.add(new InventoryItem("Potion"));
        gameState.inventoryItems.add(new InventoryItem("Masamune"));

        return gameState;
    }

    public List<PartyMember> getPartyMembers() {
        return partyMembers;
    }

    public List<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }
}
