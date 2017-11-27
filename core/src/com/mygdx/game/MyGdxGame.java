package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.delay;

public class MyGdxGame extends ApplicationAdapter {
    
    
	SpriteBatch batch;
	Texture img;
        Texture img2;
        private OrthographicCamera camera;
        private ladrom ladrom;
        private TextureFondo TextureFondo;
        private ladromDer ladromDer;
        private ladromIzq ladromIzq;
        private ladromArr ladromArr;
        private ladromDerMed ladromDerMed; 
        
        
        
	
	@Override
	public void create () {
            
		batch = new SpriteBatch();
		img = new Texture("george.png");
                //img2 = new Texture("george.png");
                
	        
                camera = new OrthographicCamera();
                camera.setToOrtho(false,385,385);
                camera.update();
                
                ladrom = new ladrom(70,330);
                TextureFondo = new TextureFondo(0,-55);
                ladromDer = new ladromDer(20,50);
                ladromIzq = new ladromIzq(0,0);
                ladromArr = new ladromArr(20,50);
                ladromDerMed = new ladromDerMed (40,50);
                
        }
        
        

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                camera.update();
                batch.setProjectionMatrix(camera.combined);
		
                
                
                
                batch.begin();
                
                TextureFondo.render(batch);
                
               ladromDerMed.render(batch);
                
               if(ladrom.x+2<=74 && ladrom.x-2>=64){ if(Gdx.input.isKeyPressed(Input.Keys.DOWN)||Gdx.input.isKeyPressed(Input.Keys.S)){
                     ladrom.y=ladrom.y-1;ladrom.render(batch);}} 
               if(ladrom.x+2<=138 && ladrom.x-2>=128){if(Gdx.input.isKeyPressed(Input.Keys.DOWN)||Gdx.input.isKeyPressed(Input.Keys.S)){
                     ladrom.y=ladrom.y-1;ladrom.render(batch);}} 
               if(ladrom.x+2<=204 && ladrom.x-2>=196){if(Gdx.input.isKeyPressed(Input.Keys.DOWN)||Gdx.input.isKeyPressed(Input.Keys.S)){
                     ladrom.y=ladrom.y-1;ladrom.render(batch);}} 
               if(ladrom.x+2<=268 && ladrom.x-2>=256){if(Gdx.input.isKeyPressed(Input.Keys.DOWN)||Gdx.input.isKeyPressed(Input.Keys.S)){
                     ladrom.y=ladrom.y-1;ladrom.render(batch);}} 
               
               
               
               
               if(ladrom.y+2<=206 && ladrom.y-2>=196){if(Gdx.input.isKeyPressed(Input.Keys.LEFT)||Gdx.input.isKeyPressed(Input.Keys.A)){
                     ladrom.x=ladrom.x-1;ladromDer.x=ladrom.x;ladromDer.y=ladrom.y;ladromDer.render(batch);delay(1000);}}
               if(ladrom.y+2<=142 && ladrom.y-2>=132){if(Gdx.input.isKeyPressed(Input.Keys.LEFT)||Gdx.input.isKeyPressed(Input.Keys.A)){
                     ladrom.x=ladrom.x-1;ladromDer.x=ladrom.x;ladromDer.y=ladrom.y;ladromDer.render(batch);delay(1000);}}
               if(ladrom.y+2<=270 && ladrom.y-2>=260){if(Gdx.input.isKeyPressed(Input.Keys.LEFT)||Gdx.input.isKeyPressed(Input.Keys.A)){
                     ladrom.x=ladrom.x-1;ladromDer.x=ladrom.x;ladromDer.y=ladrom.y;ladromDer.render(batch);delay(1000);}}
               if(Gdx.input.isKeyPressed(Input.Keys.LEFT)||Gdx.input.isKeyPressed(Input.Keys.A)){if(ladrom.y>=326 && ladrom.y<=332){
                     ladrom.x=ladrom.x-1;  ladromDer.x=ladrom.x;ladromDer.y=ladrom.y;ladromDer.render(batch);delay(1000); }}
               
               
               
               
               if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)||Gdx.input.isKeyPressed(Input.Keys.D)){if(ladrom.y>=326 && ladrom.y<=332){
                     ladrom.x=ladrom.x+1; ladromIzq.x=ladrom.x;ladromIzq.y=ladrom.y;ladromIzq.render(batch);delay(1000); }}
               if(ladrom.y+2<=142 && ladrom.y-2>=132){if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)||Gdx.input.isKeyPressed(Input.Keys.D)){
                     ladrom.x=ladrom.x+1; ladromIzq.x=ladrom.x;ladromIzq.y=ladrom.y;ladromIzq.render(batch);delay(1000);}} 
               if(ladrom.y+2<=206 && ladrom.y-2>=196){if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)||Gdx.input.isKeyPressed(Input.Keys.D)){
                     ladrom.x=ladrom.x+1;ladromIzq.x=ladrom.x;ladromIzq.y=ladrom.y;ladromIzq.render(batch);delay(1000);}} 
               if(ladrom.y+2<=270 && ladrom.y-2>=260){if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)||Gdx.input.isKeyPressed(Input.Keys.D)){
                     ladrom.x=ladrom.x+1;ladromIzq.x=ladrom.x;ladromIzq.y=ladrom.y;ladromIzq.render(batch);delay(1000);}} 
               
               
               
               if(ladrom.x+2<=74 && ladrom.x-2>=64){if(Gdx.input.isKeyPressed(Input.Keys.UP)||Gdx.input.isKeyPressed(Input.Keys.W)){
                     ladrom.y=ladrom.y+1;ladromArr.x=ladrom.x;ladromArr.y=ladrom.y;ladromArr.render(batch);delay(1000);}} 
               if(ladrom.x+2<=268 && ladrom.x-2>=256){if(Gdx.input.isKeyPressed(Input.Keys.UP)||Gdx.input.isKeyPressed(Input.Keys.W)){
                     ladrom.y=ladrom.y+1;ladromArr.x=ladrom.x;ladromArr.y=ladrom.y;ladromArr.render(batch);delay(1000);}} 
               if(ladrom.x+2<=138 && ladrom.x-2>=128){if(Gdx.input.isKeyPressed(Input.Keys.UP)||Gdx.input.isKeyPressed(Input.Keys.W)){
                     ladrom.y=ladrom.y+1;ladromArr.x=ladrom.x;ladromArr.y=ladrom.y;ladromArr.render(batch);delay(1000);}} 
               if(ladrom.x+2<=204 && ladrom.x-2>=196){if(Gdx.input.isKeyPressed(Input.Keys.UP)||Gdx.input.isKeyPressed(Input.Keys.W)){
                     ladrom.y=ladrom.y+1;ladromArr.x=ladrom.x;ladromArr.y=ladrom.y;ladromArr.render(batch);delay(1000);}} 
               
               
               
               
               
               
               
               
               
               
               
               ////MARCAS DE POSICION
               if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
                   System.out.println(ladrom.y);
                   System.out.println(ladrom.x);
               }
               ////
               
               if(Gdx.input.isKeyPressed(Input.Keys.A)!=true && Gdx.input.isKeyPressed(Input.Keys.D)!=true &&
                  Gdx.input.isKeyPressed(Input.Keys.W)!=true && Gdx.input.isKeyPressed(Input.Keys.S)!=true &&
                  Gdx.input.isKeyPressed(Input.Keys.LEFT)!=true && Gdx.input.isKeyPressed(Input.Keys.RIGHT)!=true &&
                  Gdx.input.isKeyPressed(Input.Keys.UP)!=true && Gdx.input.isKeyPressed(Input.Keys.DOWN)!=true        
                       
                       ){
                   
                   ladrom.render(batch);
               }
               
               
               
                
               
            
		    
                   
                
//batch.draw(img, 0, 0);
                
		batch.end();
                
                
                
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
                img2.dispose();
	}
}
