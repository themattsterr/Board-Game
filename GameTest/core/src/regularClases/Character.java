package regularClases;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class Character extends Actor {
	private int health;
	private int attack;
	private int defense;
	private Texture texture;
	public float xPos = 0;
	public float yPos = 0;

	public Character(String texture) {
		this.texture = new Texture(texture);
	}

	public void draw(Batch batch, float alpha) {
		batch.draw(texture, xPos, yPos, 150, 150);
	}

	public void moveTo(Vector2 vec) {
		xPos = vec.x;
		yPos = vec.y;
	}

	public void changeX(int x) {
		xPos += x;
	}

	public void changeY(int y) {
		yPos += y;
	}

}
