package rpg.engine;

public class Application {
    public static void main(String[] args) {
        RpgEngine rpgEngine = new RpgEngine();
        rpgEngine.startNewGame();
        rpgEngine.openMenu();
        rpgEngine.openMenuItemParty();
        rpgEngine.backToMenu();
        rpgEngine.openMenuItemInventory();
        rpgEngine.backToMenu();
        rpgEngine.openMenuItemSave();
    }
}
