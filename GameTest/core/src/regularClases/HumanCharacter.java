package regularClases;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GameBoard;

public abstract class HumanCharacter extends Character {
	public int position = 0;
	public int level = 0;
	Random rand = new Random();
	GameBoard board;
	
	public HumanCharacter(String texture, GameBoard board) {
		super(texture);
		this.board = board;
	}
	
	public void move(){
		board.getTile(level, position).removePlayer(this);
		
		position += this.rollDice();
		
		switch (level){
			case 0: position %= 36;
					break;
			case 1: position %= 28;
					break;
			case 2: position %= 18;
					break;
		}
		
		board.getTile(level, position).addPlayer(this);
		super.moveTo(board.getTile(level, position).getVector());
		
	}
	
	private int rollDice(){
		return rand.nextInt(6) + 1;
	}
	
	
		
	
}
