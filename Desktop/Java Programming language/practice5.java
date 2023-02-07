import java.util.*;
public class practice5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your Number : ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
    
}
