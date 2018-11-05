import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{
    //this is a private variable for the scoreboard
    private Scoreboard score;

    /**
     * This makes the size of the world appear on the window. The 
     * class a catcher class added on the window. This class makes 
     * the scoreboard set in the top left corner of the window.
     */
    
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        addObject(new Catcher(),375,475);
        score = new Scoreboard();
        addObject(score, 100,50);
    }
    
   /**
    * This makes the leaf class spawn in random spots at the top 
    * of the screen on the window.
    */
    public void act()
    {
       if(Greenfoot.getRandomNumber(100)== 0)
        {
           addObject(new Leaf(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    //this updates the score to the scoreboard
    public void update()
    {
      score.addToScore();
    }
}
