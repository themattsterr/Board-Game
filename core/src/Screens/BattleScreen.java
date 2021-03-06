package Screens;

import regularClases.HumanCharacter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.GameTest;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class BattleScreen implements Screen {

	GameTest game;
	
	HumanCharacter fighter;
	HumanCharacter defender;
	
	private Stage battleStage;
	Sound music;
	public BattleScreen(GameTest game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	
	}

	public void setBattle(HumanCharacter player1, HumanCharacter player2){
		fighter = player1;
		defender = player2;
		//music = Gdx.audio.newSound(Gdx.files.internal("sab.mp3"));
	//	music.play();
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		fighter.drawFighter();
		defender.drawDefennder();
		
		if(Gdx.input.isKeyPressed(Keys.ENTER)){
			game.setScreen(game.boardScreen);
			//this.dispose();
		}
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
		//music.dispose();
	}

}
