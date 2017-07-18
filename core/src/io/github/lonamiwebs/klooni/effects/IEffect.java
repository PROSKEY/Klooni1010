package io.github.lonamiwebs.klooni.effects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import io.github.lonamiwebs.klooni.game.Cell;

public interface IEffect {
    void setInfo(Cell deadCell, Vector2 culprit);
    void draw(SpriteBatch batch);
    boolean isDone();
}