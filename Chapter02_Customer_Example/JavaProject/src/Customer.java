public class Customer {

    private String name;
    private String address;
    private String model;
    private String saleMan;

    public Customer(String name, String address, String model, String saleMan) {
        this.name = name;
        this.address = address;
        this.addressModel = model;
        this.saleMan = saleMan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSaleMan(String saleMan) {
        this.saleMan = saleMan;
    }

    public void getInfomation() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Model: " + this.model);
        System.out.println("Sale Man: " + this.saleMan);
    }
}
