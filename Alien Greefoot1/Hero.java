import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveHero();
    }
    
    public void moveHero()
    {
        // Add your action code here.
        /*move(2);
        
        if (isAtEdge())
            setLocation(0,getY());
            
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-3);
        }*/
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
        }
        
          if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
        }
    }
}
