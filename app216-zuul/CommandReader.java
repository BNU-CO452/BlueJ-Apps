import java.util.Scanner;
import java.util.ArrayList;
/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two-word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class CommandReader 
{
    public static final String GO_COMMAND = "go";
    public static final String QUIT_COMMAND = "quit";
    public static final String HELP_COMMAND = "help";
    
    private ArrayList<String> commands;
    
    private Game game;
    private Scanner reader; // source of command input

    private String commandWord = null;
    private String word2 = null;

    
    /**
     * Create a parser to read from the terminal window.
     */
    public CommandReader(Game game) 
    {
        this.game = game;
        reader = new Scanner(System.in);
        setupCommandList();
    }
    
    private void setupCommandList()
    {
        commands = new ArrayList<String>();
        
        commands.add(" " + GO_COMMAND + " <direction> go into another room/location");
        commands.add(" " + HELP_COMMAND + "\t\t list all commands");
        commands.add(" " + QUIT_COMMAND + "\t\t Quit the game!");
        
    }
    

    /**
     * @return The next command from the user.
     */
    public boolean getCommand() 
    {
        String inputLine;  
        
        System.out.print(" > ");
        inputLine = reader.nextLine().toLowerCase();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        
        if(tokenizer.hasNext()) 
        {
            commandWord = tokenizer.next();      // get first word
        
            if(tokenizer.hasNext()) 
            {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
            else word2 = null;
        }

        return executeCommand();
    }

    private boolean executeCommand()
    {
        if(commandWord.equals("go"))
        {
            GoCommand go = new GoCommand(game, word2);
            go.execute();
        }
        else if(commandWord.equals("help"))
        {
            showCommands();
        }
        else if(commandWord.equals("quit"))
        {
            return true;
        }

        return false;
    }
    
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void showCommands()
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
