
/**
 * Write a description of class Exercise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercise implements RobotStrategy 
{
    public String workout; 
   //when he is in the gym he will do whatever workout i tell him 
   //performAction() will make sure he performs the task and reports that he done it
    public void performAction()
    {
        setWorkout("pushups");
        System.out.println("I am at the gym. I will do 2 sets of "+ getWorkout() + "."); 
        
    }

    public void setWorkout(String d)
    {
        workout = d; 
    }

    public String getWorkout()
    {
        return workout; 
    }
}