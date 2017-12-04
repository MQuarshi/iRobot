
/**
 * Write a description of class Sing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sing implements RobotStrategy
{
    //this is the strategy Sing 
    // when the robot is home , he will report that he is singin 
    public String song; 
    
    //this method is in the strategy pattern class
    //the robots performAction is to sing a song when he is home 
    public void performAction()
    { 
        setSong("Jingle Bells");
        System.out.println("I am at home. I feel like singing " + getSong() + "!"); 
    }
    
    //this allows me to set the song that he will sing 
    public void setSong(String s)
    {
        song = s; 
    }
    
    //this allows me to access the song that he is singing 
    public String getSong()
    {
        return song; 
    }
}