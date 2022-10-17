package SE1.Week2;

public class Main {
    public static void main(String[] args) throws Exception {
        Bus bus1 = new Bus("Grab", 20, 24, 6, 15000, 20, "ABCDE");
        bus1.travel("Ha Noi", "Da Nang", 15);
        System.out.println(bus1.toString());
        Car car1 = new Car("Grab", 20, 24, 2.4, 1500, 20, "ABCDE");
        car1.travel("Ha Noi", "Da Nang", 4);
        System.out.println(car1.toString());
    }
}
