
/**
 * Write a description of class Main here.
 *
 * @author (Erick Tepale)
 * @version (1.0 5/21/19)
 */
import java.util.Scanner;
import java.util.Random;

public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int tempNumber = -1; //stores temp guess
        int mysteryNumber = rand.nextInt(100) + 1;
        int count = 0;
        
        System.out.println("Can you guess my mystery integer number? It is between 1 - 100" + mysteryNumber);
        int guess = input.nextInt();
        if(tempNumber != guess) count++;
            
        while(guess != mysteryNumber){
            System.out.println( (guess < mysteryNumber) ? "Too Small Try Again." : "Too Large Try Again." );
            tempNumber = guess;
            guess = input.nextInt();
            if(tempNumber != guess) count++;
        }
        
        if(count == 0) count++;
        System.out.println("You Got It! It only took you " + count + 
                            ( (count > 1) ? " times." : " time.") );
    }
}
