/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Camilo
 */
public class GameScreen extends Fondo{

     private SpriteBatch batch;
     private Texture texture;

    public GameScreen(SpriteBatch batch, Texture texture, MyGdxGame main) {
        super(main);
        this.batch = batch;
        this.texture = texture;
    }
    
   @Override
   public void show(){
       batch = new SpriteBatch();
       texture = new Texture("fondo1.jpeg");
   }
   @Override 
   public void render(float f){
         Gdx.gl.glClearColor(1, 1, 1, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(texture, 0, 0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.end();
        
   }
}
