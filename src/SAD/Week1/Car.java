package SAD.Week1;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;
    private String carName;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getSalePrice() {
        if (this.getColor().equals("black")) {
            return this.regularPrice * 1.5;
        } else {
            return this.regularPrice * 1.2;
        }
    }

    public String toString() {
        return this.getCarName() + " car whose speed is "
                + this.getSpeed() + ", color "
                + this.getColor() + " with regular price = "
                + this.getRegularPrice() + " and sale price = "
                + this.getSalePrice();
    }

    public static void main(String[] args) {
        Car car1 = new Car(80, 5000, "red");
        car1.setCarName("Ford Mendeo");
        Car car2 = new Car(80, 6000, "black");
        car2.setCarName("Toyota Camry");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
