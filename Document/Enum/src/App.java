import java.util.*;

interface Shape {
    double calculateArea();
}

enum ShapeType implements Shape {
    CIRCLE {
        private int radius;

        public void setValue(int radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        private int side;

        public void setValue(int side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }
    },
    RECTANGLE {
        private int height, width;

        public void setValue(int height, int width) {
            this.height = height;
            this.width = width;
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

                ShapeType circle = ShapeType.CIRCLE;
                circle.setValue(radius);
                break;
            case "SQUARE":
                break;
            case "RECTANGLE":
                break;
        }

        scanner.close();
    }
}
