class Vehicle {

    //Sử dụng protected để lớp con Car có thể thừa hưởng lại attributes brand và name của Vehicle
    //Do đó có thể dùng phương thức getBrand hoặc getName ở dưới lớp Car
    protected String brand;
    protected String name;

    protected void setInformation(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    protected void getInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
    }
}

public class Car extends Vehicle {

    private String licensePlates;

    public void setInformation(String brand, String name, String licensePlates) {
        super.setInformation(brand, name);
        this.licensePlates = licensePlates;
    }

    public String getLicensePlates() {
        return this.licensePlates;
    }

    //Lợi ích của sử dụng protected
    public String getBrand() {
        return this.brand;
    }

    //Lợi ích của sử dụng protected
    public String getName() {
        return this.name;
    }
}
