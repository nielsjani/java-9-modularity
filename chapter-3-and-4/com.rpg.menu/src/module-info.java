
module com.rpg.menu {
    requires com.rpg.core.gamestate;
    requires com.rpg.menu.api;
    exports menu.core;

    uses menu.api.ScreenRenderer;
}