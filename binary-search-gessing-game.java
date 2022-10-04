import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        long secretNumber = (long)(Math.random() * Long.MAX_VALUE);
        System.out.println("the secret number is " + secretNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 0 and " + Long.MAX_VALUE);
        System.out.println("I will guess the number faster than your puny brain can.");
        long left = 0;
        long right = Long.MAX_VALUE;
        long mid = Long.MAX_VALUE/2;
        int numGuesses = 0;
        while ( left <= right ) {
            numGuesses++;
            mid = left + (right - left)/2;
            System.out.println("guessing " + mid + "...");
            if ( mid < secretNumber ) {
                left = mid + 1;
                System.out.println("too small");
            } else if ( mid > secretNumber ) {
                right = mid - 1;
                System.out.println("too big");
            } else {
                break;
            }
        }
        System.out.println("i guessed in only " + numGuesses + " guesses haha im so smart");
        System.out.println("the number is " + mid);
       
    }
}