
/**
 * Write a description of class Situat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Situation
{
    //this class will actually perform the action in the main tester. it assists 
    // with the robot strategy class which is the strategy pattern class
    public void actionPerformed(RobotStrategy action)
    {
        action.performAction();//perform action is the method in RobotStrategy 

    }
}