import greenfoot.*;
public class StartWorld extends World
{
    //GreenfootImage splashscreen = new GreenfootImage("splash_screen.gif");
    public StartWorld(){
        super(800, 600, 1); 
        addObject(new splash_screen(), 400, 100);
        addObject(new press(), 400, 250);
        addObject(new enter(), 400, 350);
        addObject(new tostart(), 400, 450);
    }
}
