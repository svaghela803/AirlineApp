package Flight;

import Passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private int flightNumber;

    private LocalDateTime departureTime;

//    create an enum
    private FlightDestination destination;

    private int maxCapacity;

//    create an array
    private passengers[] customersOnFlight;

//    private ArrayList<Passenger> passengers;


    public Flight(flightNumber, LocalDateTime, String destination, int flightID){
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();
    }

// Getters and setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public ArrayList<Passenger> getPassenger() {
        return passengers;
    }

    public void setPassenger(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

// method to add passengers
    public void addpassengers(Passenger passenger) {this.passengers.add(passenger);
    }
}

