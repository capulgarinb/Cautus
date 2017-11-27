/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Camilo
 */
public class ladrom {
    
    private Sprite sprite; 
    int x,y;
    
    public ladrom(int x ,int y){
    
        this.x=x;
        this.y=y;
        sprite = new Sprite(new Texture("george.png"),30,31);  
        
    }
    
    
    public void render(final SpriteBatch batch){
            
     batch.draw(sprite, x, y);
     
        
        
    }
    
}
