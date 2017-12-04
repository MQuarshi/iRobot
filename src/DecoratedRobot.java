
/**
 * Write a description of class DecoratedRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DecoratedRobot implements RobotDecorator
{
    public String name; //decorator allows you to get/set the name of the robot 
    public String location; 
    public String[] robotLocation;  //this arraylist object holds our locations(gym,caf,etc....)
    public Situation context;
   
    
    public DecoratedRobot(String name,String location)
    {
        this.name = name; 
        this.location= location;
        robotLocation = new String[4]; 
        
        
        
        robotLocation[0] = "gym"; 
        robotLocation[1] = "library";
        robotLocation[2] = "cafe"; 
        robotLocation[3] = "home"; 
    }

    public DecoratedRobot(String location)
    { 
        this.name = "Silicone"; 
        this.location= location;
        robotLocation = new String[4];
         
        robotLocation[0] = "gym"; 
        robotLocation[1] = "library";
        robotLocation[2] = "cafe"; 
        robotLocation[3] = "home"; 
    }

    public void setLocation(String c)
    { 
        this.location = c; 
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getName()
    {
        return name; 
    }

    public void setName(String n)
    {
        this.name = n; 
    }
}
