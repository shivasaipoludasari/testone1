import java.util.ArrayList;

class Ride {
    private int id;
    private String source;
    private String destination;
    private double fare;
    private String status;

    public Ride(int id, String source, String destination, double fare) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Ride ID: " + id + ", Source: " + source + ", Destination: " + destination + ", Fare: " + fare + ", Status: " + status;
    }
}

class Rapido {
    private ArrayList<Ride> rides;

    public Rapido() {
        rides = new ArrayList<>();
    }

    public void bookRide(int id, String source, String destination, double fare) {
        Ride ride = new Ride(id, source, destination, fare);
        rides.add(ride);
        System.out.println("Ride booked successfully. Ride ID: " + id);
    }

    public void displayRides() {
        if (rides.isEmpty()) {
            System.out.println("No rides available.");
        } else {
            for (Ride ride : rides) {
                System.out.println(ride);
            }
        }
    }

    public void startRide(int id) {
        for (Ride ride : rides) {
            if (ride2.id == id) {
                ride.setStatus("Ongoing");
                System.out.println("Ride started. Ride ID: " + id);
                return;
            }
        }
        System.out.println("Ride not found.");
    }

    public void completeRide(int id) {
        for (Ride ride : rides) {
            if (ride2.id == id && ride.status.equals("Ongoing")) {
                ride.setStatus("Completed");
                System.out.println("Ride completed. Ride ID: " + id);
                return;
            }
        }
        System.out.println("Ride not found or already completed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Rapido rapido = new Rapido();

        // Book a ride
        rapido.bookRide(1, "A", "B", 50.0);
        rapido.bookRide(2, "C", "D", 70.0);

        // Display all rides
        rapido.displayRides();

        // Start and complete a ride
        rapido.startRide(1);
        rapido.completeRide(1);

        // Display rides after completion
        rapido.displayRides();
    }
}
 