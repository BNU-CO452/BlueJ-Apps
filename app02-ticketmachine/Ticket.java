import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // Journey Destination
    private String destination;
    
    // this is the ticket price in pence
    private int price;
    
    // The date and time the ticket was issues
    private Date timeStamp;
    
    /**
     * Constructor for objects of class Ticket this will
     * 
     */
    public Ticket(String destination, int price)
    {
        timeStamp = new Date();
        this.destination = destination;
        this.price = price;
    }

    /**
     * Return the ticket's destination as a string
     * NOT NEEDED
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.print("Ticket to " + destination);
        System.out.print(" cost " + price + "p ");
        System.out.println("Issued: " + timeStamp);
    }
}
