import java.util.Scanner;

public class Typeconversion {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        //int number = sc.nextFloat();
        float number = sc.nextInt();
        System.out.println(number);

        // int num = sc.nextDouble();
        double num = sc.nextInt();
        System.out.println(num);

        //Type Casting 
        float a = 124.78f;
        int b = (int)a;
        System.out.println(b);

        char ch = 'a';
        char ch2= 'b';
        int num1 = ch;
        int num2 = ch2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
