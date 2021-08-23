
/**
 * This command transfers the player from
 * one room to another room provided the
 * two rooms are linked by a valid exit
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public  class GoCommand extends ZuulCommand
{
    String direction;
    
    public GoCommand(Game zuul, String direction)
    {
        super(zuul);
        this.direction = direction;
    }    

    public void execute()
    {
        if(direction == null) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }


        Map map = zuul.getMap();
        
        // Try to leave current room.
        Room nextRoom = map.getCurrentExit(direction);

        if (nextRoom == null) 
        {
            System.out.println("There is no door!");
        }
        else 
        {
            map.enterRoom(nextRoom);
            System.out.println(map.getCurrentRoom().getLongDescription());
        }
    }
}
