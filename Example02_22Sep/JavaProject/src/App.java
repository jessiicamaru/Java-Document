import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input width: ");
        float width = scanner.nextFloat();

        System.out.print("Input length: ");
        float length = scanner.nextFloat();

        if (width == length && width > 0 && length > 0) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}
