package Sprite;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

import Screens.PlayScreen3;

public abstract class Enemy3 extends Sprite {
	protected World world;
	protected PlayScreen3 screen;
	public Body enemybody;
	public Vector2 velocity;

	public Enemy3(PlayScreen3 screen, float x, float y) {
		this.world = screen.getWorld();
		this.screen = screen;
		setPosition(x, y);
		defineEnemy();
		velocity = new Vector2(1, 0);
	}

	protected abstract void defineEnemy();

	public abstract void update(float dt);

	public void reverseVelocity(boolean x, boolean y) {
		if (x)
			velocity.x = -velocity.x;
		if (y)
			velocity.y = -velocity.y;
	}

}
