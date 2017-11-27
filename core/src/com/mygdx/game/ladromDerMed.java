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
public class ladromDerMed {
    
    private Sprite sprite; 
    int x,y;
    
    public ladromDerMed(int x ,int y){
    
        this.x=x;
        this.y=y;
        sprite = new Sprite(new Texture("george.png"),142,0,33,33); 
        
        
    }
    
    
    public void render(final SpriteBatch batch){
            
     batch.draw(sprite, x, y);
     
        
        
    }
    
}
