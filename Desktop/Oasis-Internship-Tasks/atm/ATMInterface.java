    package atm;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class ATMInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pin=6969;
        System.out.println("Welcome.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your pin:");
        if(pin==sc.nextInt())
        {
            atm();
        }
        else
        {
            System.out.println("Wrong pin.");
            System.out.println("Try again by removing"+" and inserting the card again.");
            
        }
        sc.close();
        
    }
    public static void atm()
    {
        int balance=100000;
        Scanner sc=new Scanner (System.in);
        System.out.print("Please enter your desired operation: ");
        String checker=sc.nextLine();
        switch(checker)
        {
            case"withdraw":
            {
                System.out.print("Please enter the amount: ");
                balance-=sc.nextInt();
                System.out.println("Collect your money and card");
                System.out.println("Total balance: Rs."+balance+".");
                break;
            }
            case"deposit":
            {
                System.out.print("Please enter the amount: ");
                balance+=sc.nextInt();
                System.out.println("Your money has been successfully deposited");
                System.out.println("Total balance: Rs."+balance+".");
                break;
            }
            case "check balance":
            {
                System.out.println("Your balance is "+balance+".");
                break;
            }

        }
        System.out.println("Thank you for visiting our bank"
                +",please come again.");
        sc.close();
        
    }
    
}
