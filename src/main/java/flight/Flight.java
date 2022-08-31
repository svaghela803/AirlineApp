package Flight;.Passenger

import passenger.Passenger;
import passengreimport passenger.Passenger;

public class Flight {

    private int flightNumber;


//    create an enum
    private Destination destination;

    private int maxCapacity;

//    create an array
    private Passenger[] passengersOnFlight;

//    private ArrayList<Passenger> passengers;


    public Flight(int flightNumber, Destination destination, int maxCapacity, Passenger[] passengersOnFlight){
        this.flightNumber = flightNumber;
                this.destination = destination;
                this.maxCapacity = maxCapacity;
                this.passengersOnFlight = passengersOnFlight;
                }


//                getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Passenger[] getPassengersOnFlight() {
        return passengersOnFlight;
    }

    public void setPassengersOnFlight(Passenger[] passengersOnFlight) {
        this.passengersOnFlight = passengersOnFlight;
    }
}

