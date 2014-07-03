package com.teamseven.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.teamseven.game.Assets;


public class BoardGame extends Game {
	public static final String TITLE = "Board Game";
	
	
	SpriteBatch batch;
	BoardRenderer boardRenderer;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Assets.load();
		boardRenderer = new BoardRenderer(batch);
		
	}
	
	public void render(){
		boardRenderer.render();
		//this.resize(1200, 800);

		//setScreen(new MainMenuScreen(this));
	}
	
	
	
	
}
