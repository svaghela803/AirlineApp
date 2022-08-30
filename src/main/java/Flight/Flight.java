package Flight;

import Passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightID;
    private ArrayList<Passenger> passenger;

    public Flight(String destination, int flightID){
        this.destination = destination;
        this.flightID = flightID;
        this.passenger = new ArrayList<>();
    }

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
        return passenger;
    }

    public void setPassenger(ArrayList<Passenger> passenger) {
        this.passenger = passenger;
    }
}

