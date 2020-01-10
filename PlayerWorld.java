import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;
public class PlayerWorld extends World
{
    GifImage bg = new GifImage("scene1.gif");
    public PlayerWorld(){    
        super(1200, 720, 1); 
        
        
        
        addObject(new Hawking(), 400, 560);
        addObject(new Einstein(), 900, 560);
        
    }
    public void act(){
    setBackground(bg.getCurrentImage());
    }
    }
