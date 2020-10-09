
/**
 * This class will store information about a university course
 * Courses have an official title and a UCAS course code.
 *
 * @author Derek
 * @version 0.1 9/10/2020
 */
public class Course
{
    // Attributes/Variables/Fields
    private String title;
    
    private String codeNo;
    
    /**
     * Constructor for objects of class Course it
     * stores the title and the code no
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }
    
    /**
     * This will pint out the title and codeNo
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNo);
    }
    
}// end of class
