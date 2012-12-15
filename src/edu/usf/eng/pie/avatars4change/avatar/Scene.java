package edu.usf.eng.pie.avatars4change.avatar;

import java.util.ArrayList;
import java.util.List;


import android.graphics.Canvas;

public class Scene {
	String name = "UNNAMED";	//scene name
	
	//list of all objects in the scene
	List<Sprite> sprites = new ArrayList<Sprite>();
	List<Animation> animations = new ArrayList<Animation>();
	List<Entity> entities = new ArrayList<Entity>();
	
	public Scene(){}
	public Scene(String NAME){
		name = NAME;
	}
	
	public void draw(Canvas c){
		if(!sprites.isEmpty()){	//do nothing if no sprites in list
			for (Sprite s : sprites){	//for each sprite 's' in spriteList
				s.draw(c);	//TODO add entity location 
			}
		}
		if(!animations.isEmpty()){//same for animations
			for (Animation a : animations){	
				a.draw(c);	
			}
		}
		if(!animations.isEmpty()){//same for entities
			for (Entity e : entities){	
				e.draw(c);	
			}
		}
	}
	
	public void nextFrame(){
		if(!entities.isEmpty()){	//do nothing if empty list
			for (Entity e : entities){ //for each entity
				e.nextFrame();
			}
		}
		if(!animations.isEmpty()){	//do nothing if nothing in list
			for (Animation a : animations){	//for each animation
				a.nextFrame();
			}
		}
		//do nothing with sprites
	}
	
	public void addEntity(Entity newEnt){
		entities.add(newEnt);
	}
	public void addAnimation( Animation newAnim ){
		animations.add(newAnim);
	}
	public void addSprite( Sprite newSp ){
		sprites.add(newSp);
	}
}
