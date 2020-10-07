
/**
 * This class will contain inforamtion about the
 * course title and its ucas course code
 *
 * @author Derek Peacock
 * @version 0.1 7/10/2020
 */
public class Course
{
    // Attributes/Fields/Variables
    
    private String title;
    
    // This is a UCAS code number
    private String codeNumber;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        codeNumber = code;
    }
    
    public void print()
    {
        System.out.println("Coure: " + title + ", Code " + codeNumber);
    }
}
