import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends Actor
{
    enter(){
    GreenfootImage image = getImage();
    image.scale(image.getWidth() + 50,image.getHeight() + 30);
    setImage(image);
    }
    public void load(){
    if(Greenfoot.isKeyDown("Enter")){
    Greenfoot.setWorld(new ControlWorld());
    }
    }
    public void act() 
    {
       GreenfootImage i = getImage();
       int t = i.getTransparency();
       i.setTransparency(0);
       Greenfoot.delay(25);
       i.setTransparency(t);
       Greenfoot.delay(25);
       load();
       
    }    
}
