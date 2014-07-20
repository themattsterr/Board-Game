package Screens;

import regularClases.HumanCharacter;

import com.badlogic.gdx.Screen;
import com.mygdx.game.GameTest;

public class BattleScreen implements Screen {

	GameTest game;
	HumanCharacter fighter;
	Character defender;
	
	
	public BattleScreen(GameTest game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	
	}

	public void setBattle(HumanCharacter player1, Character player2){
		fighter = player1;
		defender = player2;
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
