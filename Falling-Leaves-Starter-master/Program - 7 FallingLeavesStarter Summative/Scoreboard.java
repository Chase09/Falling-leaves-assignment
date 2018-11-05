import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    //This is a private variable for the points on the scoreboard 
    private int points;
    //This is a private variable for the font of the scoreboard
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /**
     * This makes the scoreboard actually run. without this code
     * th scoreboard would be useless. It also sets where the 
     * scoreboard image is on the screen.
     */
    public Scoreboard() 
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,100);
        img.setFont( myFont );
        img.setColor(new Color(255,255,255));
        img.drawString("Score: " + points, 5,25);
        setImage(img);
        
    }  
    /**
     * This makes the point system run. this makes the points go
     * up every time the catcher class touches the leaf class.
     * This makes it so when you reach 10 points a soud effect
     * goes off and the game stops.
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(new Color(255,255,255));
        img.drawString("Score: " + points, 5,25); 
        if(points < 10)
        {
            img.drawString("Score: " + points, 5,25); 
        }
        else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.stop();
            Greenfoot.playSound("Explosion.wav");
        }        
    }    
}
