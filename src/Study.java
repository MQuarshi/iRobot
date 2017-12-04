
/**
 * Write a description of class Study here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Study implements RobotStrategy 
{
    public String subject; 

    //when the robot is at the library, he will study any subjet i give him 
    public void performAction()
    { 
        setSubject("Math");
        System.out.println("I am at the library. I have to study for " + getSubject() + " class."); 
    }

    //allows me to set the subject 
    public void setSubject(String v)
    {
        subject = v; 
    }

    //access subject 
    public String getSubject()
    {
        return subject; 
    }
}