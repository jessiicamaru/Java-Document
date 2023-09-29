import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();

        System.out.print("Input b: ");
        int b = scanner.nextInt();

        System.out.print(a > b ? a : b);
    }
}
