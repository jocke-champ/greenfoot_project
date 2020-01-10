import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hawking extends Support
{
private GreenfootImage punching1;
private GreenfootImage punching2;
private GreenfootImage kicking1;
private GreenfootImage kicking2;
private GreenfootImage punching1bw;
private GreenfootImage punching2bw;
private GreenfootImage kicking1bw;
private GreenfootImage kicking2bw;
private boolean isPunching;
private boolean isKicking;
private boolean isWalking;
private int punchTimer;
private int kickTimer;
private int walkTimer;
private int walkTimer2;
private int sTimer;
private int lifeSpawn;
private boolean isHit = false;
private int damageApplier = 0;
private int damageApplier1 = 0;
int lifeHawking = 0;
LifeBar healthBar = new LifeBar();
p2wins pi2wins = new p2wins();
String forward = "d";
String backward = "a";
String punch = "f";
String kick = "g";
String power = "t";
String down = "s";
private boolean isForward = true;
public Hawking(){
    punching1 = new GreenfootImage("HawkingPunching1.png");
    punching2 = new GreenfootImage("HawkingPunching2.png");
    kicking1 = new GreenfootImage("HawkingKicking1.png");
    kicking2 = new GreenfootImage("HawkingKicking2.png");
    punching1bw = new GreenfootImage("FlipHawkingPunching1.png");
    punching2bw = new GreenfootImage("FlipHawkingPunching2.png");
    kicking1bw = new GreenfootImage("FlipHawkingKicking1.png");
    kicking2bw = new GreenfootImage("FlipHawkingKicking2.png");
    isPunching = false;
    isKicking = false;
    isWalking = false;
    punchTimer = 0;
    kickTimer = 0;
    walkTimer = 0;
    walkTimer2 = 0;
    sTimer = 0;
    lifeSpawn = 0;
} 
    public void act(){
        if(lifeHawking >= 15){
            getWorld().addObject (new p2wins(), 310, 100);
            Greenfoot.stop();
        }
        checkKeyPress();
        if (lifeSpawn < 1)
            getWorld().addObject(healthBar, (getX()), (getY()-185));
        lifeSpawn++;
        if ((Greenfoot.isKeyDown("p")) && (!Greenfoot.isKeyDown(down)) && (isTouching(Einstein.class))) 
    {
        isHit = true;
        if (damageApplier == 0)
        {
            lifeHawking++;
            damageApplier++;
            healthBar.lifeBarChange(lifeHawking);
        }
    }
    if (!Greenfoot.isKeyDown("p") && damageApplier > 0)
    {
        damageApplier = 0;
        isHit = false;
    }
    if ((Greenfoot.isKeyDown("k")) && (!Greenfoot.isKeyDown(down)) && (isTouching(Einstein.class)))
    {
        isHit = true;
        if (damageApplier1 == 0)
        {
            lifeHawking++;
            lifeHawking++;
            damageApplier1++;
            healthBar.lifeBarChange(lifeHawking);
        }
    }
    if (!Greenfoot.isKeyDown("k") && damageApplier1 > 0)
    {
        damageApplier1 = 0;
        isHit = false;
    }
    healthBar.lifeBarChange(lifeHawking);
    }
public void checkKeyPress()
    {
    if (Greenfoot.isKeyDown(forward) && !Greenfoot.isKeyDown(kick) && 
    !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(down) && 
    !Greenfoot.isKeyDown(power)){ 
        isForward = true;
        move();
        walkTimer ++;
        healthBar.setLocation(getX(),(getY()-185));
        
            if(walkTimer == 0)
                setImage("HawkingWalking1.png");
            if(walkTimer == 6)
                setImage("HawkingWalking1.png");
            if(walkTimer == 11)
                setImage("HawkingWalking3.png");
            if(walkTimer == 16)
                setImage("HawkingWalking2.png");
            if(walkTimer == 21){
                setImage("HawkingWalking2.png");
                walkTimer = 0;
            }
    }
    else{
        if(!Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(forward) && 
        !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(power))
        {
            if(isForward == true){
            setImage("HawkingWalking1.png");
        }else{
        setImage("FlipHawkingWalking1.png");
        }
    }
        }
    if (Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(kick) 
    && !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(down) && 
    !Greenfoot.isKeyDown(power) ){
        isForward = false;
        moveBackwards();
         walkTimer2 ++;
        healthBar.setLocation(getX(),(getY()-185));
            if(walkTimer2 == 0)
        {
                setImage("FlipHawkingWalking2.png");
            }
            if(walkTimer2 == 6)
                setImage("FlipHawkingWalking3.png");
            if(walkTimer2 == 11)
                setImage("FlipHawkingWalking4.png");
            if(walkTimer2 == 16)
                setImage("FlipHawkingWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("FlipHawkingWalking6.png");
                walkTimer2 = 0;
            }
    }
    if (!isPunching && Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(power))
    {
            if(isForward == true){
            setImage(punching1);
            Greenfoot.delay(4);
            setImage(punching2);
            Greenfoot.delay(4);
            setImage("HawkingWalking1.png");
        }else{
            setImage(punching1bw);
            Greenfoot.delay(4);
            setImage(punching2bw);
            Greenfoot.delay(4);
            setImage("FlipHawkingWalking1.png");
        }
            isPunching = true;
        }
    if (isPunching && !Greenfoot.isKeyDown(punch))
        {   
            if(isForward == true){
            setImage("HawkingWalking1.png");
        }else{
        setImage("FlipHawkingWalking1.png");
        }
            isPunching = false;
        }
    if (!isKicking && Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(power))
    {
        if(isForward == true){
        setImage(kicking1);
        Greenfoot.delay(4);
        setImage(kicking2);
        Greenfoot.delay(4);
        setImage("HawkingWalking1.png");
        }else{
            setImage(kicking1bw);
            Greenfoot.delay(4);
            setImage(kicking2bw);
            Greenfoot.delay(4);
            setImage("FlipHawkingWalking1.png");
        }
            isKicking = true;
        }
    if (isKicking && !Greenfoot.isKeyDown(kick)){
            if(isForward == true){
            setImage("HawkingWalking1.png");
        }else{
        setImage("FlipHawkingWalking1.png");
            
        }
        isKicking = false;
    }
    if (Greenfoot.isKeyDown(down) && !Greenfoot.isKeyDown(power))
    {
        setImage("HawkingBlocking.png");
    }
    if (Greenfoot.isKeyDown(power))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("HawkingHadouken1.png");
            if(sTimer == 11)
                setImage("HawkingHadouken2.png");
            if(sTimer == 19)
                setImage("HawkingHadouken3.png");
            if(sTimer == 27)
                setImage("HawkingHadouken5.png");
            if(sTimer == 32)
                setImage("HawkingHadouken6.png");
            if(sTimer == 40)
                setImage("HawkingHadouken7.png");
            if(sTimer == 49)
                setImage("HawkingHadouken7.png");
            if(sTimer == 54)
                {
                    setImage("HawkingHadouken8.png");
                    getWorld().addObject(new Hadouken(), getX() + 20, getY());
                }
            if(sTimer == 58)
                setImage("HawkingHadouken9.png");
    }
    else {
            if (!Greenfoot.isKeyDown(power)){
                sTimer = 0;
            }
    }
   if(isTouching(Hadoukan.class) && !Greenfoot.isKeyDown(down))
    {
            getWorld().addObject (new p2wins(), 900, 100);
            Greenfoot.stop();
    }
}
}

