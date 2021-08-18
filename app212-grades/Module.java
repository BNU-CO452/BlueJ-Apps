/**
 * Modules form part of a course and contain
 * credits that students achieve when they
 * pass the module with a mark of 40+
 *
 * @author Derek Peacock and Nicholas Day
 * @version 1.0 17/07/2021
 */
public class Module
{
    // Most modules are worth 15 credits
    public static final int CREDIT = 15;
    
    private String code;
    private String title;

    /**
     * Constructor for objects of class Module 
     * which initialises the module code and title
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

   
    public String getCode()
    {
        return code;
    }
    
    
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Print out the code and title of this module
     * but stay on the same line so that credits
     * can be added if needed.
     */
    public void print()
    {
        System.out.println();
        System.out.print(" " + code + ": " + "\t" + title);
    }
    
    /**
     * Print out the credit on the current line
     * so that a mark and grade could be added
     */
    public void printCredit()
    {
        System.out.print("\t  " + CREDIT + " credits");
    }
}
