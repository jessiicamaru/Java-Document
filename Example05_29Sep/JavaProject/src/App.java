import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (i % 2 == 1 && a[i] % 2 == 0) {
                t += a[i];
            }
        }

        System.out.println(t);
    }
}
