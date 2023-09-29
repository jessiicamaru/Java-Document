import java.util.*;

public class App {

    public static boolean check(int n) {
        if (n % 2 == 0) return true; else return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();

        System.out.println(check(n) ? "Even" : "Odd");

        scanner.close();
    }
}
