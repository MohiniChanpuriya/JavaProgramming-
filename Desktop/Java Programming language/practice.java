import java.util.Scanner;

public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        System.out.println("Bill is : "+ total);

        //With 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : "+ newTotal);
    }
    
}
