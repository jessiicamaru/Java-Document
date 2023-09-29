import java.util.*;

public class App {

    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();

        System.out.println("N! = " + calc(n));

        scanner.close();
    }
}
