import greenfoot.*;
public class Controls extends Actor{
    public void load(){
    if(Greenfoot.isKeyDown("Enter")){
    Greenfoot.setWorld(new PlayerWorld());
    }
    }
    public void act() {
        load();
    }    
}
