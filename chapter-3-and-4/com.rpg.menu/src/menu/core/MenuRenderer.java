package menu.core;

import gamestate.core.GameState;
import menu.api.ScreenRenderer;
import menu.api.ScreenType;

import java.util.Optional;
import java.util.ServiceLoader;

public class MenuRenderer {

    private ServiceLoader<ScreenRenderer> renderers;
    private ScreenRenderer activeScreen;

    public MenuRenderer() {
        renderers = ServiceLoader.load(ScreenRenderer.class);
    }

    public void renderPartyScreen(GameState gameState) {
        findRenderer(ScreenType.PARTY_SCREEN, gameState);
    }

    public void renderInventoryScreen(GameState gameState) {
        findRenderer(ScreenType.INVENTORY_SCREEN, gameState);
    }

    public void renderSaveScreen(GameState gameState) {
        findRenderer(ScreenType.SAVE_SCREEN, gameState);
    }

    private void findRenderer(ScreenType screenType, GameState gameState) {
        assertOnMainMenuScreen();
        renderers.forEach(r -> System.out.println(r.getName()));
        renderers.stream()
                .filter(renderer -> ScreenType.valueOf(renderer.get().getName()).equals(screenType))
                .findFirst()
                .ifPresent(renderer -> this.activeScreen = renderer.get());
        Optional.ofNullable(activeScreen).ifPresent(renderer -> renderer.render(gameState));
    }

    private void assertOnMainMenuScreen() {
        if (activeScreen != null) {
            throw new IllegalArgumentException("Subscreen was already open");
        }
    }

    public void backToMenu() {
        this.activeScreen = null;
    }
}
