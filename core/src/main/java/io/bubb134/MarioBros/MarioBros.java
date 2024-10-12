package io.bubb134.MarioBros;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.bubb134.MarioBros.Screens.PlayScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class MarioBros extends Game {
    public static final int V_WIDTH = 400;
    public static final int V_HEIGHT = 208;
    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new PlayScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }
}
