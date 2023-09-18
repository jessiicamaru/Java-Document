import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = scanner.nextLine();

        System.out.print("Input your email: ");
        String email = scanner.nextLine();

        System.out.print("Input your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age, email);

        person.sayHello();

        scanner.close();
    }
}
