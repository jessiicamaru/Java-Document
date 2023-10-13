import java.util.Scanner;

public class Cat extends Animal {

    private String color, breed;

    public Cat(String name, int age, String color, String breed) {
        super(name, age);
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{name='" + super.getName() + "', age=" + super.getAge() + "', color=" + this.color + "', breed=" + this.breed + '}';
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean equalBreed(Cat c) {
        System.out.println(c.breed + " " + c.getName());
        System.out.println(this.breed + " " + this.getName());

        return c.breed == this.breed;
    }
}
