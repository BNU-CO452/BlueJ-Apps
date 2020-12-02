import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 *
 * Modified and extended by Dr Derek Peacock
 * December 1st 2020
 */
public class InputReader2
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader2()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Prompt the user to enter a string and Read a line of text
     * from standard input (the text terminal), and return a String.
     *
     * @return  A String typed by the user.
     */
    public String getString(String prompt)
    {
        String value = null;
        boolean isValid = false;

        while(isValid == false)
        {
            System.out.println(prompt);
            value = reader.nextLine();

            if(value.isBlank() || value.isEmpty())
            {
                System.out.println("Your input is blank");
            }
            else isValid = true;
        }

        return value;
    }
    
    /**
     * Prompt the user to enter an int
     * Read an int from standard input 
     * (the text terminal),
     * and return it as an int.
     *
     * @return  A String typed by the user.
     */
    public int getInt(String prompt)
    {
        boolean isValid = false;
        int number = 0;

        while(isValid == false)
        {
            System.out.println(prompt);

            try
            {
                number = reader.nextInt();
                isValid = true;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid integer!\n");
            }

        }
        return number;
    }

    /**
     * Display a prompt and Get an integer value between min and max
     * @param prompt the message to the user to enter an int
     * @param min the minimum allowed value
     * @param max the maximum allowed value
     * @return the integer number
     */
    public int getInt(String prompt, int min, int max)
    {
        boolean isValid = false;
        int number = 0;

        while(isValid == false)
        {
            number = getInt(prompt);
            if(number < min || number > max)
            {
                System.out.println("Number must be between " + min + " and " + max);
            }
            else
                isValid = true;
        }
        return number;
    }
}
