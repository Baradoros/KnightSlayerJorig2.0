package entity;

/**
 * 
 * @author Drew
 */
public abstract class Entity {

   float x, y, width, height;
   
   public abstract void update();

   public abstract void draw();
}
