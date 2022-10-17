package SE1.Week2;

public class Motorbike extends Vehicle{
    private String model;
    private double price;
    public Motorbike(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, String model, double price) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.model = model;
        this.price = price;
    }
}
