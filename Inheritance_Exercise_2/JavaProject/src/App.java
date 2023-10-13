import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Cat a[] = new Cat[2];
        String name, breed, color;
        int age;

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name of the animal: ");
            name = scanner.nextLine();

            System.out.print("Enter age of the animal: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter color of the animal: ");
            color = scanner.nextLine();

            System.out.print("Enter breed of the animal: ");
            breed = scanner.nextLine();

            a[i] = new Cat(name, age, color, breed);
        }

        for (int i = 0; i < 2; i++) {
            a[i].toString();
        }

        System.out.println();
        System.out.println("Birth = " + a[1].getYearOfBirth());
        System.out.println(a[0].equalBreed(a[1]));
        scanner.close();
    }
}
