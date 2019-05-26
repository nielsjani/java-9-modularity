package save.screen;

import gamestate.core.GameState;
import menu.api.ScreenRenderer;

public class QuickSaveScreenRenderer implements ScreenRenderer {
    @Override
    public void render(GameState gameState) {
        System.out.println("\n Quicksaving... \n-------------------\n Error!");
    }

    @Override
    public String getName() {
        return "QUICK_SAVE_SCREEN";
    }
}
