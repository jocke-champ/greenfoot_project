import greenfoot.*;
public class ControlWorld extends World{

    public ControlWorld(){    
        super(800, 600, 1);
        addObject(new Controls(), 400, 300);
    }
}
