package SE1.Week2;

public class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    private String registrationNumber;

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        if (validateWeight(weight)) {
            this.length = length;
        } else {
            System.out.println("Invalid length: " + length);
        }
        if (validateWeight(weight)) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight: " + weight);
        }
        this.seatingCapacity = seatingCapacity;
        if (validateRegistrationNumber(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Invalid registration number: " + registrationNumber);
        }

    }

    private boolean validateWeight(double weight) {
        return weight > 0.0;
    }

    private boolean validateLength(double length) {
        return length > 0.0;
    }

    private boolean validateRegistrationNumber(String registrationNumber) {
        String regex = "^[a-zA-Z0-9]+$";
        return (registrationNumber.matches(regex) && registrationNumber.length() > 0
                && registrationNumber.length() < 12);
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [name= " + name + ", width= " + width + ", height= " + height
                + ", length= " + length + ", weight= " + weight + ", sitingCapacity= " + seatingCapacity
                + ", registrationNumber= " + registrationNumber + "]";
    }

    public void travel(String startPoint, String endPoint, int numOfPassengers) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
