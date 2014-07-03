package com.teamseven.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;

public class BoardRenderer {
	
	private TiledMap map;
	private TiledMapRenderer renderer;
	private OrthographicCamera camera;
	private OrthoCamController cameraController;
	
	//private Texture tiles;
	//private Texture texture;
	private BitmapFont font;
	SpriteBatch batch;
	
	public BoardRenderer (SpriteBatch batch) {
		this.batch = batch;
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();

		camera = new OrthographicCamera();
		//camera.setToOrtho(false, (w / h) * 320, 320);
		camera.setToOrtho( false, (w / h) * 640,640);
		camera.update();

		cameraController = new OrthoCamController(camera);
		Gdx.input.setInputProcessor(cameraController);

		font = new BitmapFont();
		//batch = new SpriteBatch();
		
		
		//tiles = new Texture(Gdx.files.internal("img/tiles_10_30x22.png"));
		
		//TextureRegion[][] splitTiles = TextureRegion.split(tiles, 30, 22);
		map = new TiledMap();
		
		MapLayers layers = map.getLayers();
		//for (int l = 0; l < 5; l++) {
			TiledMapTileLayer layer = new TiledMapTileLayer(20, 20, 30, 22);
			
			for (int x = 0; x < 20; x++) {
				for (int y = 0; y < 20; y++) {
					//int ty = (int)(Math.random() * splitTiles.length);
					//int tx = (int)(Math.random() * splitTiles[ty].length);
					int ty = (int)(x % Assets.splitTiles.length);
					int tx = (int)(y % Assets.splitTiles[ty].length);
					Cell cell = new Cell();
					StaticTiledMapTile cellTile = new StaticTiledMapTile(Assets.splitTiles[ty][tx]);
					if (x == 0 || y == 19)
						cellTile.setOffsetY(3);
					cell.setTile(cellTile);
					
					
					layer.setCell(x, y, cell);
				}
			}
			layers.add(layer);
		//}
	
	
		renderer = new IsometricTiledMapRenderer(map,3f);
		
	}
	
	public void render () {
		Gdx.gl.glClearColor(100f / 255f, 100f / 255f, 250f / 255f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		renderer.setView(camera);
		
		renderer.render();
		
		
		batch.begin();
		
		font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond() + cameraController.checkTileTouched(), 10, 20);
		
		
		batch.end();
	}
	
	
	
 
	
	
	
	
	
}
