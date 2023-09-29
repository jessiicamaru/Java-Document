interface Shape {
    String calculatorArea();
}

enum ShapeType implements Shape {
    CIRCLE,
    SQUARE,
    TRIANGLE;

    private final int sides;

    ShapeType(int sides) {
        this.sides = sides;
    }

    @Override
    public String calculatorArea() {
        switch (this) {
            case CIRCLE:
                return "Circle " + this;
            case SQUARE:
                return "Square " + this;
            case TRIANGLE:
                return "Triangle " + this;
            default:
                return "false";
        }
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        for (ShapeType shapeType : ShapeType.values()) {
            System.out.println(shapeType + " is: " + shapeType.calculatorArea());
        }
    }
}
