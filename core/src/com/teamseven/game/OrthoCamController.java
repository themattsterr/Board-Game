package com.teamseven.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;

public class OrthoCamController extends InputAdapter {
        

		final OrthographicCamera camera;
        final Vector3 curr = new Vector3();
        final Vector3 last = new Vector3(-1, -1, -1);   
        final Vector3 delta = new Vector3();
        
        public OrthoCamController(OrthographicCamera camera) {
                this.camera = camera;
        }
        
        

        
        @Override public boolean touchDragged (int x, int y, int pointer) {
                camera.unproject(curr.set(x, y,0));
                if(!(last.x == -1 && last.y == -1 && last.z == -1)) {
                        camera.unproject(delta.set(last.x, last.y, 0));                 
                        delta.sub(curr);
                        camera.position.add(delta.x, delta.y, 0);
                }
                last.set(x, y, 0);
                return false;
        }
        
        @Override public boolean touchUp(int x, int y, int pointer, int button) {
                last.set(-1, -1, -1);
                return false;
        }
        
        final Plane xyPlane = new Plane(new Vector3(0, 0, 1), 0);
    	final Vector3 intersection = new Vector3();
        
        public String checkTileTouched() {
    		String coordinates = " not just touched";
    		if(Gdx.input.justTouched()) {
    			Ray pickRay = camera.getPickRay(Gdx.input.getX(), Gdx.input.getY());
    			Intersector.intersectRayPlane(pickRay, xyPlane, intersection);
    			int x = (int)intersection.x;
    			int y = (int)intersection.y;
    			
    			coordinates = (" x: " + x + ", y: " + y);
    			System.out.println(coordinates);
    			System.out.println(Gdx.input.getX() + ", " + Gdx.input.getY());
    			System.out.println();
  
    		}
    		
    		return coordinates;
    	}
       
        
        
}