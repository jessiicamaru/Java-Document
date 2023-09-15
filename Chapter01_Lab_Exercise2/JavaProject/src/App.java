import java.util.*;

public class App {
    public static void main(String[] args) {
        
        String s;
        Scanner k = new Scanner(System.in);
        
        System.out.println("Input your string: ");

        s = k.nextLine();
        System.out.println("Your string's length is: " + s.length());

        k.close();

    }
}
