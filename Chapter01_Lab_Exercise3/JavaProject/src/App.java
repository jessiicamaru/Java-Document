import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your rectangle width: ");
        int width = scanner.nextInt();
        
        System.out.print("Input your rectangle height: ");
        int height = scanner.nextInt();

        System.out.println("The area is: " + width*height);
        System.out.print("The perimeter is: " + (width+height)*2);

        scanner.close();
    }
}
