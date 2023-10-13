import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = scanner.nextLine();

        System.out.print("Input age: ");
        int age = scanner.nextInt();

        System.out.print("Input score: ");
        int score = scanner.nextInt();

        System.out.print("Input positionX: ");
        int positionX = scanner.nextInt();

        System.out.print("Input positionY: ");
        int positionY = scanner.nextInt();

        Player player1 = new Player(name, age, score, positionX, positionY);
        Player player2 = new Player(name, age, score, positionX, positionY);

        scanner.close();
    }
}
