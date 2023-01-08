import java.util.Scanner;

public class Area {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
    
        int area = side*side;           //side*side
        System.out.println(area);
    }
    
}
