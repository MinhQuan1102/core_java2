package SE1.Week2;

import java.util.Scanner;

public class IronSuit extends Vehicle{
    private String durability;
    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, String durability) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.durability = durability;
    }

    public void fly() {
        Scanner sc = new Scanner(System.in);
        System.out.println("From: ");
        String fromDes = sc.nextLine();
        System.out.println("To: ");
        String toDes = sc.nextLine();
        System.out.println("Type the distance: (km)");
        double distance = sc.nextDouble();
        System.out.println("Type the velocity: (km/h)");
        double velocity = sc.nextDouble();
        velocity = velocity / (3.6);
        double time = (distance * 1000) / velocity;
        int milies = 1000;
        System.out.println("You are flying from " + fromDes + " to " + toDes + " with the distance of " + distance + " km, estimated time: " + time + " seconds");
        try {
            int i = 0;
            while (i < time) {
                Thread.sleep(milies);
                System.out.println("Flying...");
                i++;
            }
            System.out.println("Arrived!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        IronSuit ironSuit = new IronSuit("Iron", 10, 10, 10, 10, 1, "ABCDEF", "Good");
        System.out.println("\uD83D\uDE97");
        System.out.println("\uD83D\uDE8C");
    }
}
