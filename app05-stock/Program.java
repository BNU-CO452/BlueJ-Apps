import java.io.IOException;
import java.lang.InterruptedException;

/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main() throws IOException, InterruptedException
    {
        app = new StockApp();
        app.run();
    }
}
