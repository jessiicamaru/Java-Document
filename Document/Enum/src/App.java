import java.text.DecimalFormat;
import java.util.*;

interface Shape {
    void setValue(int... value);
    double calculateArea();
}

enum ShapeType implements Shape {
    CIRCLE {
        private int radius;

        @Override
        public void setValue(int... values) {
            if (values.length > 0) {
                this.radius = values[0];
            }
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        private int side;

        @Override
        public void setValue(int... values) {
            if (values.length > 0) {
                this.side = values[0];
            }
        }

        @Override
        public double calculateArea() {
            return side * side;
        }
    },
    RECTANGLE {
        private int height, width;

        @Override
        public void setValue(int... values) {
            if (values.length > 1) {
                this.width = values[0];
                this.height = values[1];
            }
        }

        @Override
        public double calculateArea() {
            return height * width;
        }
    },
}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your type of shape: ");
        String shape = scanner.nextLine();

        shape = shape.toUpperCase();

        switch (shape) {
            case "CIRCLE":
                System.out.print("Input radius: ");
                int radius = scanner.nextInt();

                DecimalFormat decimalFormat = new DecimalFormat("#.###");

                ShapeType circle = ShapeType.CIRCLE;
                circle.setValue(radius);

                System.out.println("Circle area is: " + decimalFormat.format(circle.calculateArea()));
                break;
            case "SQUARE":
                System.out.print("Input side: ");
                int side = scanner.nextInt();

                ShapeType square = ShapeType.SQUARE;
                square.setValue(side);

                System.out.println("Square area is: " + (int) square.calculateArea());
                break;
            case "RECTANGLE":
                System.out.print("Input width: ");
                int width = scanner.nextInt();

                System.out.print("Input height: ");
                int height = scanner.nextInt();

                ShapeType rectangle = ShapeType.RECTANGLE;
                rectangle.setValue(width, height);

                System.out.println("Square area is: " + (int) rectangle.calculateArea());
                break;
        }

        scanner.close();
    }
}
