import java.util.ArrayList;
/**
 * Write a description of class HelpCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpCommand extends ZuulCommand
{
    private ArrayList<String> commands;

    public HelpCommand(Game zuul, ArrayList<String> commands)
    {
        super(zuul);
        this.commands = commands;
    }

    
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println(" You are lost. You are alone. You wander");
        System.out.println(" around at the university.");        
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        
        for(String command : commands)
        {
            System.out.println("  " + command);
        }
    }
}
