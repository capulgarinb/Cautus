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
public class ladromArr {
    
    private Sprite sprite; 
    int x,y;
    
    public ladromArr(int x ,int y){
    
        this.x=x;
        this.y=y;
        sprite = new Sprite(new Texture("george.png"),105,0,34,34);  
        
    }
    
    
    public void render(final SpriteBatch batch){
            
     batch.draw(sprite, x, y);
     
        
        
    }
    
}
