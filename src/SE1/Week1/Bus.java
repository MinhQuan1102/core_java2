package SE1.Week1;

public class Bus extends Vehicle{
    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) throws Exception {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        if (!validateRegistrationNumber(registrationNumber)) {
            throw new Exception("Invalid registration number!");
        }
        if (!validateWeight(weight)) {
            throw new Exception("Invalid weight!");
        }
        if (!validateLength(length)) {
            throw new Exception("Invalid length!");
        }
    }

    protected boolean validateWeight(double weight) {
        return (weight >= 5000.0 && weight <= 20000.0);
    }

    protected boolean validateLength(double length) {
        return (length >= 4.0 && length <= 10.0);
    }

    protected boolean validateRegistrationNumber(String registrationNumber) {
        String regex = "^[a-zA-Z0-9]+$";
        return (registrationNumber.matches(regex) && registrationNumber.length() > 0
                && registrationNumber.length() < 8);
    }

    @Override
    public void travel(String startPoint, String endPoint, int numOfPassengers) {

    }
}
