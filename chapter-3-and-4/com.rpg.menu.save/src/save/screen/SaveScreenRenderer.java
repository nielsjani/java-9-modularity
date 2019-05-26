package save.screen;

import gamestate.core.GameState;
import menu.api.ScreenRenderer;

public class SaveScreenRenderer implements ScreenRenderer {
    @Override
    public void render(GameState gameState) {
        System.out.println("\n Save screen \n------------\n Saving...please don't turn off the power.");
    }

    @Override
    public String getName() {
        return "SAVE_SCREEN";
    }
}
