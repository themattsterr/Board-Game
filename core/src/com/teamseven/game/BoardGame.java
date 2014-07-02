package com.teamseven.game;

import com.badlogic.gdx.Game;

public class BoardGame extends Game {
	public static final String TITLE = "Board Game";
	public static final int WIDTH = 480,HEIGHT=800;
	
	@Override
	public void create () {
		setScreen(new Splash());
	}
	
}



// Holds a deck of a specific type of card and int to hold index for the top card location
class Deck{
	
	
	
	
	
}

// Class defining all character able to take part in combat
class Character{
	int health;
	int attack;
	int defense;
}

// Class defining player information
class Player extends Character{
	int player_ID;
	//++ some sort of inventory container
}

class NPC extends Character{
	int NPC_ID;
}

// Holds the information of a single card
class Card{
	int card_ID;
}


// Equippable item cards
// 3 digit Card ID's beginning with 1
class ItemCard extends Card{
	int healthBonus;
	int attackBonus;
	int defenseBonus;	
}

// One-off usable spell cards
// 3 digit Card ID's beginning with 2
class SpellCard extends Card{
	
}

// Quest cards describing objective and reward
// 3 digit Card ID's beginning with 3
class QuestCard extends Card{
	
}

// Fortune card describing buffs and special advantages
// 3 digit Card ID's beginning with 4
class FortuneCard extends Card{
	
}





//
//package com.teamseven.game;
//
//import com.badlogic.gdx.ApplicationAdapter;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//
//public class BoardGame extends ApplicationAdapter {
//	SpriteBatch batch;
//	Texture img;
//	
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//	}
//
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
//}
