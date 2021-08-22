
/**
 * This class is reponsible for creating and
 * linking all the rooms in the game to
 * form a 2D or 3D network
 *
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    private Room currentRoom;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office;
      
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        
        // initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);

        theater.setExit("west", outside);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);

        currentRoom = outside;  // start game outside
    }
    
    public Room getCurrentRoom()
    {
        return currentRoom;
    }
    
    public Room getCurrentExit(String direction)
    {
        return currentRoom.getExit(direction);
    }

    public void enterRoom(Room nextRoom)
    {
        currentRoom = nextRoom;
    }
}
