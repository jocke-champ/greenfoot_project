import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class splash_screen extends Actor
{   
    splash_screen(){
    GreenfootImage image = getImage();
    image.scale(image.getWidth() - 100,image.getHeight());
    setImage(image);
    }
    public void act() 
    {
        
    }    
}
