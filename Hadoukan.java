import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hadoukan extends Support
{
    /**
     * Act - do whatever the Hadoukan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveBackwards();
        moveBackwards();
        moveBackwards();
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
        if (contact(Hawking.class) && Greenfoot.isKeyDown("down"))
        {
            getWorld().removeObject(this);
        }
    }
public void collide()
    {
        if(contact(Hadouken.class))
        {
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
