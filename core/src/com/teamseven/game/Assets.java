package com.teamseven.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	public static Texture background;
	public static TextureRegion backgroundRegion;
	
	public static Texture menus;
	public static TextureRegion mainMenu;
	
	public static Texture tiles;
	public static TextureRegion[][] splitTiles;
	/*
	
	public static BitmapFont font;
	public static Sound clickSound;
	*/
	public static Texture loadTexture (String file) {
		return new Texture(Gdx.files.internal(file));
	}

	public static void load () {
		background = loadTexture("img/board.png");
		backgroundRegion = new TextureRegion(background, 0, 0, 480, 320);
		
		menus = loadTexture("img/scroll_772x1078.png");
		mainMenu = new TextureRegion(menus, 0, 0, 772, 1078);
		
		tiles = loadTexture("img/tiles_10_30x22.png");
		splitTiles = TextureRegion.split(tiles, 30, 22);
		
	}
	
	/*
	public static void playSound (Sound sound) {
		if (Settings.soundEnabled) sound.play(1);
	}
	*/
}
