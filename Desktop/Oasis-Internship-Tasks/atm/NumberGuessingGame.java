import java.util.Random;
import java.util.Scanner;

import javax.swing.*;


public class NumberGuessingGame {
    static Random r =new Random();
    static Scanner sc = new Scanner(System.in);
    static int gn;
    static int count;
    static int userAnswer;
    public static void main(String[] args) {
         gn=r.nextInt(100);
         userAnswer = sc.nextInt();
         count = 0;

        while(userAnswer!=gn){
            String response = JOptionPane.showInputDialog(null,"Enter a Guess between 1 to 100","Guessing Game",3);
            userAnswer = Integer.parseInt(response);
            // JOptionPane.showMessageDialog(null,"" +determineGuess());
            count++;
        }
    }
    public void determineGuess(){
        if(userAnswer <= 0 || userAnswer > 100){
            System.out.println("Your Guess is invailid");
        }

        else if(userAnswer == gn){
            System.out.println("Correct1\nTotal Guesses: "+ count);
        }

        else if(userAnswer > gn){
            System.out.println("Your guess is too high, try again.\nTry Number: "+count);
        }
        
        else if(userAnswer < gn){
           System.out.println("Your number is too low, try again.\nTry Number: "+count);
        }
        
        else{
            System.out.println( "Your guess is incorrect\nTry Number: "+count);
        }
    }

    
}

