package inventory.screen;

import gamestate.core.GameState;
import inventory.core.InventoryItem;
import menu.api.ScreenRenderer;

import java.util.function.Function;
import java.util.stream.Collectors;

public class InventoryScreenRenderer implements ScreenRenderer {

    @Override
    public void render(GameState gameState) {
        System.out.println("\n Inventory screen \n -------------------");
        gameState.getInventoryItems().stream().collect(Collectors.groupingBy(InventoryItem::getName, Collectors.counting()))
                .forEach((key, value) -> System.out.println("You have " + key + " x" + value));
    }

    @Override
    public String getName() {
        return "INVENTORY_SCREEN";
    }
}
