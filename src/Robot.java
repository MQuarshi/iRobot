/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot implements BasicRobot
{
    //This class implements the methods from the interface named BasicRobot 
    
    public String currLocation; //This is the current location of the robot and it will be string format 
    public String[] robotLocation;  //this arraylist object holds our locations(gym,cafe,etc....)
    public Situation context; //this instantiates the Situation class

    public Robot()
    { 
        this.currLocation= "home";
        robotLocation = new String[4]; //String array of my locations
       
        robotLocation[0] = "gym"; 
        robotLocation[1] = "library";
        robotLocation[2] = "cafe"; 
        robotLocation[3] = "home"; 
    }
    
 
    public void setLocation(String c)
    { 
        this.currLocation = c; //sets the location of robot 
    }
    public String getLocation()
    {
        return currLocation;//accesses the location of robot 
    }
    
    //public 
  
}
