import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hadouken extends Support
{
    /**
     * Act - do whatever the Hodouken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        move();
        move();
        move();
        destroy();
        collide();
    }
/**
 * destroys object when it contacts an edge.
 */
public void destroy()
    {
        if (atWorldEdge() )
        {
            getWorld().removeObject(this);
        }
        if (contact(Einstein.class) && Greenfoot.isKeyDown("s"))
        {
            getWorld().removeObject(this);
        }
    }
public void collide()
    {
        if(contact(Hadoukan.class))
        {
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);
        }
}
}
