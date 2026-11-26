package nl.saxion.game.pressprotocol;

import com.badlogic.gdx.graphics.Color;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class PressProtocolGameScreen extends ScalableGameScreen {

    public float countdown = 5f;

    public PressProtocolGameScreen() {
        super(500, 500);
    }

    @Override
    public void show() {
        countdown = 5f;
        GameApp.addFont("roboto", "fonts/Roboto_SemiBold.ttf", 32);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        GameApp.clearScreen(24, 24, 36);
        countdown -= delta;

        if (countdown <= 0) {
            System.out.println("Time's up!");
            countdown = 5f;
        }

        GameApp.startSpriteRendering();
        GameApp.drawTextCentered(
            "roboto",
            "Hallo - time left: " + (int) Math.ceil(countdown),
            getWorldWidth() / 2f,
            getWorldHeight() / 2f,
            Color.WHITE
        );
        GameApp.endSpriteRendering();
    }

    @Override
    public void hide() {
    }
}
