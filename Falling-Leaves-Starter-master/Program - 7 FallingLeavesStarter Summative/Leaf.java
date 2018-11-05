import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
        private int Leafspeed = Greenfoot.getRandomNumber(5) + 1;
        private int Rotation = 0;
    public Leaf()
    {
        
        int imageNum = Greenfoot.getRandomNumber(4) + 1;
        if( imageNum == 1)
        {
            
            setImage("cutoutleaf0.png");
        }
        else if(imageNum == 2)
        {
            
            setImage("cutoutleaf1.png");
        }
        else if(imageNum == 3)
        {
            
            setImage("cutoutleaf2.png");
        }
        else
        {
            
            setImage("cutoutleaf3.png");
        }

        
        
     }

    public void act() 
    {      
         setLocation(getX(), getY()+Leafspeed);
         Rotation ++;
         setRotation(Rotation);
         if(this.getY() >= getWorld().getHeight() -1)
         {
             getWorld().removeObject(this);
         }
         
    }   
       
}
