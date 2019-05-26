import menu.api.ScreenRenderer;
import save.screen.QuickSaveScreenRenderer;
import save.screen.SaveScreenRenderer;

module com.rpg.menu.save {
    requires com.rpg.menu.api;
    requires com.rpg.core.gamestate;

    exports save.screen;
    provides ScreenRenderer with SaveScreenRenderer, QuickSaveScreenRenderer;
}