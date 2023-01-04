// The Package name (the class file will be created under this folder name 'day01')
package day01.source;

//Using the class
import java.io.Console; 

//Write the program
public class GettingToKnowYou {
    // entry point
    public static void main(String[] args){
        //Read from the command line
        //Get the console
        Console cons = System.console();
        //Prompt the user and read a line
        String name = cons.readLine("What is your name? ");
        //Prompt the user for the email
        String email =cons.readLine("What is your email? ");
        //Check if both inputs are not empty
        if (email.length()>0 && name.length()>0){
            //Print out the name and email
            System.out.printf("Hello %s!\nYour email is %s.\n",name,email);
        } else {
            System.err.println("You have not told me both your name and email!");
        }
        //Check if name is Fred
        if (name.equals("Fred")){
            System.out.println("Yo Fred!");
        }
    }
}