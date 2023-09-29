public class App {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setInformation("Mazda", "CXV", "73K5-2814");
        myCar.getInformation();
        System.out.println(myCar.getLicensePlates());
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getName());
        System.out.println();
    }
}
