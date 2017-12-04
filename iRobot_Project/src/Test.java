import java.util.Scanner;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    RobotStrategy strategy;
    DecoratedRobot robot;
    //Situation situation;  not 
    public Test()
    {
        //this.strategy = strategy;
        this.robot = new DecoratedRobot("","");
        userInterface(robot);
    }
    
    public void setStrategy(RobotStrategy newStrategy)
    {
        //set the strategy to exercise
        strategy = newStrategy;
    }
    
   public void getStrategyAction()
    {
        strategy.performAction();
    }
   
    public void userInterface(DecoratedRobot myRobot)
    {
        System.out.println("Enter your robot's name: ");
        Scanner scan = new Scanner(System.in);
        
        myRobot.setName(scan.next()); //set robot name 
        System.out.println("Hi my name is: " + myRobot.getName());
        
        System.out.println("\n");
        System.out.println("-----ROBOT DESTINATIONS-----");
        System.out.println("Gym");
        System.out.println("Cafe");
        System.out.println("Library");
        System.out.println("Home");
        System.out.println("\n");
        
        System.out.println("From the list above, pick a destination for the robot (case-sensitive): ");
        String place = scan.next();
        
        System.out.println("\nROBOT " + myRobot.getName().toUpperCase() + " OUTPUT: ");
        myRobot.setLocation(place);
        logic(myRobot);
        scan.close();
    }
    //this is where it determines what strategy to use depending on location 
    public void logic(BasicRobot r)
    {
        if(r.getLocation().equals("gym"))
        {
            setStrategy(new Exercise());
            getStrategyAction();
        }
        else if (r.getLocation().equals("cafe"))
        {
            setStrategy(new Eat());
            getStrategyAction();
        }
        else if (r.getLocation().equals("library"))
        {
           setStrategy(new Study());
           getStrategyAction();           
        }
        else if (r.getLocation().equals("home"))
        {
            setStrategy(new Sing());
            getStrategyAction();
        }
        else
        {
        	System.out.println("Wrong answer. Exiting program.");
        }
    }
    
    public static void main(String[] args)
    {
        Test bot = new Test();
    }
    
}
