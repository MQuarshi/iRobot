
/**
 * Write a description of interface RobotDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface RobotDecorator extends BasicRobot
{
    //this class extends the basic robot 
    //this is the decorator pattern strategy. it has the same methods but now it 
    // has get/set name which "decorates" it 
    public String getLocation(); 

    public void setLocation(String c); 

    public String getName(); 
    
    public void setName(String n); 
}
