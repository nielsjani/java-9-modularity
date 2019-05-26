package rpg.engine;

import gamestate.core.GameState;
import menu.core.MenuRenderer;

public class RpgEngine {

    private GameState gameState;
    private MenuRenderer menuRenderer;


    public void openMenu() {
        menuRenderer = new MenuRenderer();
    }


    public void openMenuItemParty() {
        assertMenuOpen();
        menuRenderer.renderPartyScreen(gameState);
    }

    public void openMenuItemInventory() {
        assertMenuOpen();
        menuRenderer.renderInventoryScreen(gameState);
    }

    public void openMenuItemSave() {
        assertMenuOpen();
        menuRenderer.renderSaveScreen(gameState);
    }

    private void assertMenuOpen() {
        if(menuRenderer == null) {
            throw new IllegalArgumentException("Menu was not open!");
        }
    }

    public void startNewGame() {
        gameState = GameState.initialise();
    }

    public void backToMenu() {
        this.menuRenderer.backToMenu();
    }
}
