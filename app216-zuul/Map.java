
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    private Location outside, theater, pub, lab, office;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     */
    private void createLocations()
    {
        createOutside();
        createTheatre();
        createPub();
        createLab();
        createOffice();

        currentLocation = outside;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createOutside()
    {
        outside = new Location("outside the main entrance of the university");
        
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createPub()
    {
        pub = new Location("in the campus pub");
        pub.setExit("east", outside);
    }
    /**
     * Create the office linked to the lab
     */
    private void createOffice()
    {
        office = new Location("in the computing admin office");
        office.setExit("west", lab);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createTheatre()
    {
        theater = new Location("in a lecture theater");
        theater.setExit("west", outside);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createLab()
    {
        // create the Locations
        lab = new Location("in a computing lab");
        
        lab.setExit("north", outside);
        lab.setExit("east", office);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
