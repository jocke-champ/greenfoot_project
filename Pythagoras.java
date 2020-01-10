import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)          
public class Pythagoras extends Support{
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
        int lifePythagoras = 0;
        LifeBar healthBar = new LifeBar();
        p1wins pi1wins = new p1wins();
        String forward = "right";
        String backward = "left";
        String down = "down";
        String kick = "k";
        String punch = "p";
        String power = "m";
        private boolean isForward = false;
        public Pythagoras(){
            punching1 = new GreenfootImage("PythagorasPunching1.png");
            punching2 = new GreenfootImage("PythagorasPunching1.png");
            punching3 = new GreenfootImage("PythagorasPunching1.png");
            kicking1 = new GreenfootImage("PythagorasKicking1.png");
            kicking2 = new GreenfootImage("PythagorasKicking2.png");
            kicking3 = new GreenfootImage("PythagorasKicking3.png");
            kicking4 = new GreenfootImage("PythagorasKicking4.png");
            kicking5 = new GreenfootImage("PythagorasKicking5.png");
            kicking6 = new GreenfootImage("PythagorasKicking6.png");
            kicking7 = new GreenfootImage("PythagorasKicking7.png");
            kicking8 = new GreenfootImage("PythagorasKicking8.png");
            kicking9 = new GreenfootImage("PythagorasKicking9.png");
            /*punching1fw = new GreenfootImage("FlipPythagorasPunching1.png");
            punching2fw = new GreenfootImage("FlipPythagorasPunching2.png");
            punching3fw = new GreenfootImage("FlipPythagorasPunching3.png");
            punching4fw = new GreenfootImage("FlipPythagorasPunching4.png");
            punching5fw = new GreenfootImage("FlipPythagorasPunching5.png");
            punching6fw = new GreenfootImage("FlipPythagorasPunching6.png");
            kicking1fw = new GreenfootImage("FlipPythagorasKicking1.png");
            kicking2fw = new GreenfootImage("FlipPythagorasKicking2.png");
            kicking3fw = new GreenfootImage("FlipPythagorasKicking3.png");
            kicking4fw = new GreenfootImage("FlipPythagorasKicking4.png");
            kicking5fw = new GreenfootImage("FlipPythagorasKicking5.png");
            kicking6fw = new GreenfootImage("FlipPythagorasKicking6.png");
            kicking7fw = new GreenfootImage("FlipPythagorasKicking7.png");
            kicking8fw = new GreenfootImage("FlipPythagorasKicking8.png");
            kicking9fw = new GreenfootImage("FlipPythagorasKicking9.png");
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
                if(lifePythagoras >= 15){
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
                    lifePythagoras++;
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
                    lifePythagoras++;
                    lifePythagoras++;
                    damageApplier1++;
                    healthBar.lifeBarChange(lifePythagoras);
                }
            }
            if (!Greenfoot.isKeyDown("g") && damageApplier1 > 0)
            {
                damageApplier1 = 0;
                isHit = false;
            }
            healthBar.lifeBarChange(lifePythagoras);
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
                        
                        setImage("PythagorasWalking1.png");
                    if(walkTimer == 4)
                        setImage("PythagorasWalking1.png");
                    if(walkTimer == 8)
                        setImage("PythagorasWalking2.png");
                    if(walkTimer == 11)
                        setImage("PythagorasWalking3.png");
                    if(walkTimer == 16)
                        setImage("PythagorasWalking4.png");
                    if(walkTimer == 18) 
                        setImage("PythagorasWalking5.png");
                    if(walkTimer == 21)
                    {
                        setImage("PythagorasWalking6.png");
                        walkTimer = 0;
                    }
            }
            else
            {
                if(!Greenfoot.isKeyDown(backward) && !Greenfoot.isKeyDown(forward) && 
                !Greenfoot.isKeyDown(punch) && !Greenfoot.isKeyDown(kick) && !Greenfoot.isKeyDown(power))
                {
                if(isForward == true){
            setImage("FlipPythagorasWalking1.png");
            }else{
            setImage("PythagorasWalking1.png");
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
                setImage("FlipPythagorasWalking2.png");
            if(walkTimer2 == 6)
                setImage("FlipPythagorasWalking3.png");
            if(walkTimer2 == 11)
                setImage("FlipPythagorasWalking4.png");
            if(walkTimer2 == 16)
                setImage("FlipPythagorasWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("FlipPythagorasWalking6.png");
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
            setImage("FlipPythagorasWalking1.png");
            }else{
            setImage("PythagorasWalking1.png");
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
            setImage("FlipPythagorasWalking1.png");
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
            setImage("PythagorasWalking1.png");
            }
            isKicking = true;
        }  
   
    if (isKicking && !Greenfoot.isKeyDown(kick))
        {   
            if(isForward == true){
            setImage("FlipPythagorasWalking1.png");
            }else{
            setImage("PythagorasWalking1.png");
            }
            isKicking = false;
        }
    if (Greenfoot.isKeyDown(down) && !Greenfoot.isKeyDown(power))
    {
        if(isForward == true){
        setImage("FlipPythagorasBlocking.png");
        }else{
        setImage("PythagorasBlocking.png");
        }
    }
    if (Greenfoot.isKeyDown(power))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("PythagorasSpecial1.png");
            if(sTimer == 6)
                setImage("PythagorasSpecial1.png");
            if(sTimer == 11)
                setImage("PythagorasSpecial2.png");
            if(sTimer == 16)
                setImage("PythagorasSpecial2.png");
            if(sTimer == 21)
                setImage("PythagorasSpecial2.png");
            if(sTimer == 26)
                {
                    setImage("PythagorasSpecial3.png");
                    getWorld().addObject(new pSpecial(), getX() - 20, getY());
                }
            if(sTimer == 56)
                setImage("PythagorasSpecial3.png");
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
