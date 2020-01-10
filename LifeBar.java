import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LifeBar extends Actor
{
public String[] life =
{"LifeBar.png","LifeBar2.png", "LifeBar3.png", "LifeBar4.png", "LifeBar5.png", "LifeBar6.png", 
"LifeBar7.png", "LifeBar8.png", "LifeBar9.png", "LifeBar10.png", "LifeBar11.png", 
"LifeBar12.png", "LifeBar13.png", "LifeBar14.png", "LifeBar15.png", "LifeBar16.png"};
public LifeBar(){

}
public void lifeBarChange(int l){
    if (l >= 15){
        l = 15;
    }
    setImage(new GreenfootImage((life[l])));
}
}
