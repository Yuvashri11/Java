import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Welcome to the number guessing game!");
        int score=0;
        boolean playAgain=true;
        while(playAgain){
            int targetno=r.nextInt(100)+  1;
            int attempts=0;
            int maxAttempts=5;
            System.out.println("I have selected a number between 1 and 100.Can you guess it?");
            
            while(attempts<maxAttempts){
                System.out.println("Enter your guess:");
                int userGuess=sc.nextInt();
                sc.nextLine();
                attempts++;
                if(userGuess==targetno){
                    System.out.println("Congratulations,You guessed the number"+targetno+"in"+attempts+"attempts");
                    score++;
                    break;
                }
                else if(userGuess<targetno){
                    System.out.println("Too low!Try Again.");
                
                }
                else{
                    System.out.println("Too High!Try Again");
                }
            }
            if (attempts>maxAttempts){
                System.out.println("Sorry,You've run out of attempts.The correct number was"+targetno+".");
            }
            System.out.println("Do you want to play again?(yes/no):");
            String playAgainInput=sc.nextLine();
            playAgain=playAgainInput.equalsIgnoreCase("yes");

            }
            System.out.println("Game Over!Your Score:"+score);
            sc.close();
    }
}
