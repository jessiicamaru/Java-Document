abstract class Animal {

    private String name;
    private int legs;

    public abstract void scream();

    public void setAnimal(String name, int legs) {
        this.legs = legs;
        this.name = name;
    }

    public void getInformation() {
        System.out.println("Name: " + name);
        System.out.println("Legs: " + legs);
    }
}

class Pig extends Animal {

    public void scream() {
        System.out.println("Ec Ec");
    }
}
