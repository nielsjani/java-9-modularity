package menu.api;

import gamestate.core.GameState;

public interface ScreenRenderer {

    public void render(GameState gameState);
    public String getName();
}
