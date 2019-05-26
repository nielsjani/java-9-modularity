import inventory.screen.InventoryScreenRenderer;
import menu.api.ScreenRenderer;

module com.rpg.menu.inventory {
    requires com.rpg.core.inventory;
    requires com.rpg.core.gamestate;
    requires com.rpg.menu.api;

    provides ScreenRenderer with InventoryScreenRenderer;
}