package com.teamseven.game;

import com.badlogic.gdx.Game;

public class BoardGame extends Game {
	public static final String TITLE = "7 Dungeons";
	public static final int WIDTH = 1200, HEIGHT=800;
	
	@Override
	public void create () {
		setScreen(new Splash());
		
		// display new game screen, take input
		
		gameInitialize();
		
		// end of game, ask to play again
		
	}
	
	// initializes all starting game data
	private static void gameInitialize(){
		// set player locations, classes, starting stats
		// randomize decks
		
		// get input from user
		numplayers = 2;
		
		// set player classes
		Player player1 = new Player();
		Player player2 = new Player();
		
		// start game
		gameBoard(numPlayers, player1, player2, player3, player4);
	}
	
	// maintain player data, pass turn to each player per round
	private static void gameBoard(int numPlayers, Player player1, Player player2, Player player3, Player player4){
		boolean dragonIsAlive = true;
		int winner = -1;
		
		// round loop
		while(dragonIsAlive){
		
			for(int i = 0; i < numPlayers; i++){
				// player i's turn
				
				// roll for movement, move
				
				// tile event
				
				// if combat, run combat function
				
				
				
				if(false/*dragon is dead*/){
					dragonIsAlive = false;
					winner = -1;//whatever player kills dragon
				}
			}
			
		}
		
		winScreen(winner);//display who won, play again or exit
		
		if(true/*play again selected*/)
			gameInitialize();
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
