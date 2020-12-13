import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
        }

        return inputLine;
    }
    
    /**
     * Read a line of text from standard imput (the text terminal),
     * and return it sas an interger.
     * 
     * @return Interger typed by user.
     */
    public int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(prompt);         // print prompt
            number = reader.nextInt();
            
            if(number > 0)
            {
                isValid = true;
            }
        }

        return number;
    }
}
