import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)          
public class Tesla extends Support{
        private GreenfootImage punching1;
        private GreenfootImage punching2;
        private GreenfootImage punching3;
        private GreenfootImage punching1fw;
        private GreenfootImage punching2fw;
        private GreenfootImage punching3fw;
        private GreenfootImage punching4fw;
        private GreenfootImage punching5fw;
        private GreenfootImage punching6fw;
        private GreenfootImage kicking1;
        private GreenfootImage kicking2;
        private GreenfootImage kicking3;
        private GreenfootImage kicking4;
        private GreenfootImage kicking5;
        private GreenfootImage kicking6;
        private GreenfootImage kicking7;
        private GreenfootImage kicking8;
        private GreenfootImage kicking9;
        private GreenfootImage kicking1fw;
        private GreenfootImage kicking2fw;
        private GreenfootImage kicking3fw;
        private GreenfootImage kicking4fw;
        private GreenfootImage kicking5fw;
        private GreenfootImage kicking6fw;
        private GreenfootImage kicking7fw;
        private GreenfootImage kicking8fw;
        private GreenfootImage kicking9fw;
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
        int lifeTesla = 0;
        LifeBar healthBar = new LifeBar();
        p1wins pi1wins = new p1wins();
        String forward = "right";
        String backward = "left";
        String down = "down";
        String kick = "k";
        String punch = "p";
        String power = "m";
        private boolean isForward = false;
        public Tesla(){
            punching1 = new GreenfootImage("TeslaPunching1.png");
            punching2 = new GreenfootImage("TeslaPunching1.png");
            punching3 = new GreenfootImage("TeslaPunching1.png");
            kicking1 = new GreenfootImage("TeslaKicking1.png");
            kicking2 = new GreenfootImage("TeslaKicking2.png");
            kicking3 = new GreenfootImage("TeslaKicking3.png");
            kicking4 = new GreenfootImage("TeslaKicking4.png");
            kicking5 = new GreenfootImage("TeslaKicking5.png");
            kicking6 = new GreenfootImage("TeslaKicking6.png");
            kicking7 = new GreenfootImage("TeslaKicking7.png");
            kicking8 = new GreenfootImage("TeslaKicking8.png");
            kicking9 = new GreenfootImage("TeslaKicking9.png");
            /*punching1fw = new GreenfootImage("FlipTeslaPunching1.png");
            punching2fw = new GreenfootImage("FlipTeslaPunching2.png");
            punching3fw = new GreenfootImage("FlipTeslaPunching3.png");
            punching4fw = new GreenfootImage("FlipTeslaPunching4.png");
            punching5fw = new GreenfootImage("FlipTeslaPunching5.png");
            punching6fw = new GreenfootImage("FlipTeslaPunching6.png");
            kicking1fw = new GreenfootImage("FlipTeslaKicking1.png");
            kicking2fw = new GreenfootImage("FlipTeslaKicking2.png");
            kicking3fw = new GreenfootImage("FlipTeslaKicking3.png");
            kicking4fw = new GreenfootImage("FlipTeslaKicking4.png");
            kicking5fw = new GreenfootImage("FlipTeslaKicking5.png");
            kicking6fw = new GreenfootImage("FlipTeslaKicking6.png");
            kicking7fw = new GreenfootImage("FlipTeslaKicking7.png");
            kicking8fw = new GreenfootImage("FlipTeslaKicking8.png");
            kicking9fw = new GreenfootImage("FlipTeslaKicking9.png");
            */
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
                if(lifeTesla >= 15){
                    getWorld().addObject (new p1wins(), 310, 100);
                    Greenfoot.stop();
                }
                checkKeyPress();
                if (lifeSpawn < 1)
                    getWorld().addObject(healthBar, (getX()), (getY()-185));
                lifeSpawn++;
                if ((Greenfoot.isKeyDown("f")) && (!Greenfoot.isKeyDown(down)) && (isTouching(Hawking.class)))
            {
                isHit = true;
                if (damageApplier == 0)
                {
                    lifeTesla++;
                    damageApplier++;
                }
            }
            if (!Greenfoot.isKeyDown("f") && damageApplier > 0)
            {
                damageApplier = 0;
                isHit = false;
            }
            if ((Greenfoot.isKeyDown("g")) && (!Greenfoot.isKeyDown(down)) && (isTouching(Hawking.class)))
            {
                isHit = true;
                if (damageApplier1 == 0)
                {
                    lifeTesla++;
                    lifeTesla++;
                    damageApplier1++;
                    healthBar.lifeBarChange(lifeTesla);
                }
            }
            if (!Greenfoot.isKeyDown("g") && damageApplier1 > 0)
            {
                damageApplier1 = 0;
                isHit = false;
            }
            healthBar.lifeBarChange(lifeTesla);
            } 
        public void checkKeyPress()
            {
            if (Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(punch) && 
            !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(down) && 
            !Greenfoot.isKeyDown(power)){
                isForward = false;
                    moveBackwards();
                walkTimer ++;
                healthBar.setLocation(getX(),(getY()-185));
                    if(walkTimer == 0)
                        
                        setImage("TeslaWalking1.png");
                    if(walkTimer == 4)
                        setImage("TeslaWalking1.png");
                    if(walkTimer == 8)
                        setImage("TeslaWalking2.png");
                    if(walkTimer == 11)
                        setImage("TeslaWalking3.png");
                    if(walkTimer == 16)
                        setImage("TeslaWalking4.png");
                    if(walkTimer == 18) 
                        setImage("TeslaWalking5.png");
                    if(walkTimer == 21)
                    {
                        setImage("TeslaWalking6.png");
                        walkTimer = 0;
                    }
            }
            else
            {
                if(!Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(forward) && 
                !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(power))
                {
                if(isForward == true){
            setImage("FlipTeslaWalking1.png");
            }else{
            setImage("TeslaWalking1.png");
            }
                }
                }
            if (Greenfoot.isKeyDown(forward) && !Greenfoot.isKeyDown(punch) 
            && !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(down)  
        && !Greenfoot.isKeyDown(power) ){
            isForward = true;
            move();
             walkTimer2 ++;
            healthBar.setLocation(getX(),(getY()-185));
            if(walkTimer2 == 0)
                setImage("FlipTeslaWalking2.png");
            if(walkTimer2 == 6)
                setImage("FlipTeslaWalking3.png");
            if(walkTimer2 == 11)
                setImage("FlipTeslaWalking4.png");
            if(walkTimer2 == 16)
                setImage("FlipTeslaWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("FlipTeslaWalking6.png");
                walkTimer2 = 0;
            }
    }
    if (!isPunching && Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(power))
    {
            if(isForward == true){
            setImage(punching1fw);
            Greenfoot.delay(4);
            setImage(punching2fw);
            Greenfoot.delay(4);
            setImage(punching3fw);
            Greenfoot.delay(4);
            setImage(punching4fw);
            Greenfoot.delay(4);
            setImage(punching5fw);
            Greenfoot.delay(4);
            setImage(punching6fw);
            }else{
            setImage(punching1);
            }
            isPunching = true;
        }
    if (isPunching && !Greenfoot.isKeyDown(punch))
        {
            if(isForward == true){
            setImage("FlipTeslaWalking1.png");
            }else{
            setImage("TeslaWalking1.png");
            }
            isPunching = false;
        }
    if (!isKicking && Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(power))
    {
            if(isForward == true){
            setImage(kicking1fw);
            Greenfoot.delay(4);
            setImage(kicking2fw);
            Greenfoot.delay(4);
            setImage(kicking3fw);
            Greenfoot.delay(4);
            setImage(kicking4fw);
            Greenfoot.delay(4);
            setImage(kicking5fw);
            Greenfoot.delay(4);
            setImage(kicking6fw);
            Greenfoot.delay(4);
            setImage(kicking7fw);
            Greenfoot.delay(4);
            setImage(kicking8fw);
            Greenfoot.delay(4);
            setImage(kicking9fw);
            Greenfoot.delay(4);
            setImage("FlipTeslaWalking1.png");
            }else{
            setImage(kicking1);
            Greenfoot.delay(4);
            setImage(kicking2);
            Greenfoot.delay(4);
            setImage(kicking3);
            Greenfoot.delay(4);
            setImage(kicking4);
            Greenfoot.delay(4);
            setImage(kicking5);
            Greenfoot.delay(4);
            setImage("TeslaWalking1.png");
            }
            isKicking = true;
        }  
   
    if (isKicking && !Greenfoot.isKeyDown(kick))
        {   
            if(isForward == true){
            setImage("FlipTeslaWalking1.png");
            }else{
            setImage("TeslaWalking1.png");
            }
            isKicking = false;
        }
    if (Greenfoot.isKeyDown(down) && !Greenfoot.isKeyDown(power))
    {
        if(isForward == true){
        setImage("FlipTeslaBlocking.png");
        }else{
        setImage("TeslaBlocking.png");
        }
    }
    if (Greenfoot.isKeyDown(power))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("TeslaSpecial1.png");
            if(sTimer == 6)
                setImage("TeslaSpecial1.png");
            if(sTimer == 11)
                setImage("TeslaSpecial2.png");
            if(sTimer == 16)
                setImage("TeslaSpecial2.png");
            if(sTimer == 21)
                setImage("TeslaSpecial2.png");
            if(sTimer == 26)
                {
                    setImage("TeslaSpecial3.png");
                    getWorld().addObject(new tSpecial(), getX() - 20, getY());
                }
            if(sTimer == 56)
                setImage("TeslaSpecial3.png");
    }
    else {
            if (!Greenfoot.isKeyDown(power)){
                sTimer = 0;
            }
    }
    if(isTouching(Hadouken.class) && !Greenfoot.isKeyDown(down))
    {
            getWorld().addObject (new p1wins(), 300, 100);
            Greenfoot.stop();
    }
    }   
    }
