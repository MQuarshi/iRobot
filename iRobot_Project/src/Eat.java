
/**
 * Write a description of class Eat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eat implements RobotStrategy
{
    public String lunch; 
    //when robot is in the cafe , he will eat whatever i tell him to eat 
    public void performAction()
    {
        setLunch("cheeseburger and fries");
        System.out.println("I am in the cafe. I am hungry. I want " + getLunch() + "!"); 
        
    }
    
    public void setLunch(String z)
    {
        lunch = z; 
    }
    
    public String getLunch()
    {
        return lunch; 
    }
}
    