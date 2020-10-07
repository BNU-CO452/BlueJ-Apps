
/**
 * This class stores information about mobile phones
 *
 * @author Derek Peacock
 * @version 7th Oct 2020
 */
public class MobilePhone
{
    // Attributes/Fields/Variables
    private String make;
    
    private String model;

    /**
     * Constructor for creating MobilePhone objects
     */
    public MobilePhone(String make, String model)
    {
        this.make = make;
        this.model = model;
    }
    
    public void print()
    {
        System.out.println("Mobile Make: " + make + " Model " + model );
        
    }
    

}
