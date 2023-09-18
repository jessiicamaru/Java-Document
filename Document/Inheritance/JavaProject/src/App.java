import java.util.*;

public class App {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you teacher[t] or student[s]:");
        char check = scanner.next().charAt(0);
        scanner.nextLine();

        if (check == 's' || check == 'S') {
            System.out.print("StudentCard: ");
            String studentCard = scanner.nextLine().trim();

            System.out.print("Name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Email: ");
            String email = scanner.nextLine().trim();

            System.out.print("Phone: ");
            String phone = scanner.nextLine().trim();

            student.setInfo(name, email, phone, studentCard);
            student.introduceMyself();
        }
    }
}
