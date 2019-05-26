package com.electioneer.passport.validation;

public class HologramServerTransmogrifier {
    public static void transmogrify(String hologramData) {
        if(hologramData.contains("This is an illegal hologram")) {
            throw new IllegalArgumentException("HOLOGRAM IS NOT CORRECT");
        }
    }
}
