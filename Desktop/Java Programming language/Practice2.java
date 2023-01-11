import java.util.*;

public class Practice2 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = a + b;         
        int subtraction = a - b;        
        int multiplication = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Addition of numbers :"+ addition);
        System.out.println("Subtaction of numbers :"+ subtraction);
        System.out.println("Multiplication of numbers :"+ multiplication);
        System.out.println("Division of numbers :"+ division);
        System.out.println("Modulo of numbers :"+ modulo);
    }
}
