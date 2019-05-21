
/**
 * Write a description of class Main here.
 *
 * @author (Erick Teplale)
 * @version (1.0 5/21/19)
 */
import java.util.Scanner;

public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main(String[] args)
    {
        int mysteryNumber = 66;
        int count = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Can you guess my mystery integer number? It is between 1 - 100");
        int guess = input.nextInt();
        
        while(guess != mysteryNumber){
            System.out.println( (guess < mysteryNumber) ? "Too Small Try Again." : "Too Large Try Again." );
            count++;
            guess = input.nextInt();
        }
        
        
        System.out.println("You Got It! It only took you " + count + 
                            ( (count > 1) ? " times." : " time.") );
    }
}
