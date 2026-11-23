package nl.saxion.game;

import nl.saxion.game.pressprotocol.PressProtocolGameScreen;
import nl.saxion.gameapp.GameApp;

public class Main {
    public static void main(String[] args) {
        // Add screens
        GameApp.addScreen("PressProtocol", new PressProtocolGameScreen());

        // Start game loop and show game screen
        GameApp.start("Press Protocol", 650, 650, 60, false, "PressProtocol");
    }
}
