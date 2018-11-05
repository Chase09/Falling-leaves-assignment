 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    /**
     * This will make it so when you press the left key the 
     * catcher will move left. Also when you press the right key 
     * the catcher will move right.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        checkForFood();
    } 
    /**
     * This makes it so when the catcher touches the leaves, the
     * leaves will disappear.
     */
    private void checkForFood()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            //call the method update from the KittyWorld class
            ((AutumnWorld)getWorld()).update();
        }
    }
    
}
