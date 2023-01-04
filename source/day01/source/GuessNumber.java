package day01.source;

import java.security.SecureRandom;
import java.util.Random;
import java.io.Console;

public class GuessNumber {
    public static void main(String[] args){
        //Create a random number generator
        Random rand = new SecureRandom();
        //Randomly generate a number between 1 and 10
        int toGuess = rand.nextInt(10)+1;
        System.out.printf("toGuess: %d\n",toGuess);

        //Game start
        int tries = 3;
        Console cons = System.console();
        while (tries >= 1){
            String userGuess = cons.readLine("What is your guess (%d tries)? ",tries);
            if (toGuess == Integer.parseInt(userGuess.trim())){
                System.out.printf("Correct! You Win! ");
                break;
            }
            else if (toGuess < Integer.parseInt(userGuess.trim())){
                System.out.printf("Lower\n");
            } else {
                System.out.printf("Higher\n");
            }
            tries --;
        }
        if (tries <= 0){
            System.out.printf("The number is %s! You lose! ",toGuess);
        }
    }
}