
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }

}
