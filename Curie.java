import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)          
public class Curie extends Support{
        private GreenfootImage punching1;
        private GreenfootImage punching2;
        private GreenfootImage punching3;
        private GreenfootImage punching4;
        private GreenfootImage punching5;
        private GreenfootImage punching6;
        private GreenfootImage punching7;
        private GreenfootImage punching8;
        private GreenfootImage punching9;
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
        private GreenfootImage kicking10;
        private GreenfootImage kicking11;
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
        int lifeCurie = 0;
        LifeBar healthBar = new LifeBar();
        p1wins pi1wins = new p1wins();
        String forward = "right";
        String backward = "left";
        String down = "down";
        String kick = "k";
        String punch = "p";
        String power = "m";
        private boolean isForward = false;
        public Curie(){
            punching1 = new GreenfootImage("CuriePunch1.png");
            punching2 = new GreenfootImage("CuriePunch1.png");
            punching3 = new GreenfootImage("CuriePunch1.png");
            kicking1 = new GreenfootImage("CurieKick1.png");
            kicking2 = new GreenfootImage("CurieKick2.png");
            kicking3 = new GreenfootImage("CurieKick3.png");
            kicking4 = new GreenfootImage("CurieKick4.png");
            kicking5 = new GreenfootImage("CurieKick5.png");
            kicking6 = new GreenfootImage("CurieKick6.png");
            kicking7 = new GreenfootImage("CurieKick7.png");
            kicking8 = new GreenfootImage("CurieKick8.png");
            kicking9 = new GreenfootImage("CurieKick9.png");
            kicking10 = new GreenfootImage("CurieKick10.png");
            kicking11 = new GreenfootImage("CurieKick11.png");
            /*punching1fw = new GreenfootImage("FlipCuriePunching1.png");
            punching2fw = new GreenfootImage("FlipCuriePunching2.png");
            punching3fw = new GreenfootImage("FlipCuriePunching3.png");
            punching4fw = new GreenfootImage("FlipCuriePunching4.png");
            punching5fw = new GreenfootImage("FlipCuriePunching5.png");
            punching6fw = new GreenfootImage("FlipCuriePunching6.png");
            kicking1fw = new GreenfootImage("FlipCurieKicking1.png");
            kicking2fw = new GreenfootImage("FlipCurieKicking2.png");
            kicking3fw = new GreenfootImage("FlipCurieKicking3.png");
            kicking4fw = new GreenfootImage("FlipCurieKicking4.png");
            kicking5fw = new GreenfootImage("FlipCurieKicking5.png");
            kicking6fw = new GreenfootImage("FlipCurieKicking6.png");
            kicking7fw = new GreenfootImage("FlipCurieKicking7.png");
            kicking8fw = new GreenfootImage("FlipCurieKicking8.png");
            kicking9fw = new GreenfootImage("FlipCurieKicking9.png");
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
                if(lifeCurie >= 15){
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
                    lifeCurie++;
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
                    lifeCurie++;
                    lifeCurie++;
                    damageApplier1++;
                    healthBar.lifeBarChange(lifeCurie);
                }
            }
            if (!Greenfoot.isKeyDown("g") && damageApplier1 > 0)
            {
                damageApplier1 = 0;
                isHit = false;
            }
            healthBar.lifeBarChange(lifeCurie);
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
                        
                        setImage("CurieWalking1.png");
                    if(walkTimer == 8)
                        setImage("CurieWalking2.png");
                    if(walkTimer == 11)
                        setImage("CurieWalking3.png");
                    if(walkTimer == 21)
                    {
                        setImage("CurieWalking4.png");
                        walkTimer = 0;
                    }
            }
            else
            {
                if(!Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(forward) && 
                !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(power))
                {
                if(isForward == true){
            setImage("FlipCurieWalking1.png");
            }else{
            setImage("CurieWalking1.png");
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
                setImage("FlipCurieWalking1.png");
            if(walkTimer2 == 6)
                setImage("FlipCurieWalking2.png");
            if(walkTimer2 == 11)
                setImage("FlipCurieWalking3.png");
            if(walkTimer2 == 21)
            {
                setImage("FlipCurieWalking4.png");
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
            Greenfoot.delay(4);
            setImage(punching2);
            Greenfoot.delay(4);
            setImage(punching3);
            Greenfoot.delay(4);
            setImage(punching4);
            Greenfoot.delay(4);
            }
            isPunching = true;
        }
    if (isPunching && !Greenfoot.isKeyDown(punch))
        {
            if(isForward == true){
            setImage("FlipCurieWalking1.png");
            }else{
            setImage("CurieWalking1.png");
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
            setImage("FlipCurieWalking1.png");
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
            setImage(kicking6);
            Greenfoot.delay(4);
            setImage(kicking7);
            Greenfoot.delay(4);
            setImage(kicking8);
            Greenfoot.delay(4);
            setImage(kicking9);
            Greenfoot.delay(4);
            setImage(kicking10);
            Greenfoot.delay(4);
            setImage(kicking11);
            Greenfoot.delay(4);
            
            setImage("CurieWalking1.png");
            }
            isKicking = true;
        }  
   
    if (isKicking && !Greenfoot.isKeyDown(kick))
        {   
            if(isForward == true){
            setImage("FlipCurieWalking1.png");
            }else{
            setImage("CurieWalking1.png");
            }
            isKicking = false;
        }
    if (Greenfoot.isKeyDown(down) && !Greenfoot.isKeyDown(power))
    {
        if(isForward == true){
        setImage("FlipCurieBlocking.png");
        }else{
        setImage("CurieBlocking.png");
        }
    }
    if (Greenfoot.isKeyDown(power))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("CurieSpecial1.png");
            if(sTimer == 6)
                setImage("CurieSpecial1.png");
            if(sTimer == 11)
                setImage("CurieSpecial2.png");
            if(sTimer == 16)
                setImage("CurieSpecial2.png");
            if(sTimer == 21)
                setImage("CurieSpecial2.png");
            if(sTimer == 26)
                {
                    setImage("CurieSpecial3.png");
                    getWorld().addObject(new cSpecial(), getX() - 20, getY());
                }
            if(sTimer == 56)
                setImage("CurieSpecial3.png");
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
