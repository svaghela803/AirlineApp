package flight;

import passenger.Passenger;

public class FlightInfo {
    
    public void bookFlight(Flight.Flight flight, Passenger passenger) {
        for (int i = 0; i<flight.getMaxCapacity(); i++){
            Passenger passengers = null;
            if (flight.getPassengersOnFlight()[i]==null || (flight.getPassengersOnFlight()[i].equals(passengers))==false){
                System.out.println("Booking completed! These are the details: Flight number: " +
                        flight.getFlightNumber()
                        + ", Destination: " + flight.getDestination());
                flight.getPassengersOnFlight()[i] = passenger;
                break;
            }
        }
    }
    public void cancelFlight(Flight.Flight flight, Passenger passenger) {
        for (int i = 0; i<flight.getMaxCapacity(); i++){
            if (passenger.equals(flight.getPassengersOnFlight()[i])){
                System.out.println("Your flight has been successfully cancelled! These are the details:" +
                        " Flight number: " + flight.getFlightNumber() +
                        ", Destination: " + flight.getDestination());
                flight.getPassengersOnFlight()[i] = null;
                break;
            }
        }
    }
    public int countPassengers(Flight.Flight){
        Passenger[] passengers = flight.getPassengersOnFlight();
        int numPassengers = 0;
        for (int i = 0; i < passengers.length; i++){
            if (passengers[i] != null){
                numPassengers += 1;
            } else {
                break;
            }
        }
        return numPassengers;
    }

    public void displayFlights(Airport airport){
        Flight[] flights = airport.getFlightsArray();
        int seatsLeft = 0;
        for (int i=0; i<flights.length; i++){
            seatsLeft = flights[i].getMaxCapacity() - countPassengers(flights[i]);
            System.out.println("Flight number: " + flights[i].getFlightNumber() +
                    ", Departure time: " + flights[i].getDepartureTime() + ", Destination: "
                    + flights[i].getDestination() + ", Seats remaining: " + seatsLeft);
        }
    }

    public Flight findFlightByNum(String flightNum, Airport airport){
        Flight[] flights = airport.getFlightsArray();
        for(int i=0; i<flights.length; i++){
            if (flights[i].getFlightNumber() == Integer.parseInt(flightNum)){
                return flights[i];
            }
        }
        return null;
    }

    public void viewBookings(Airport airport, Customer customer) {
        Flight[] flights = airport.getFlightsArray();
        boolean hasFlights = false;
        for (int i = 0; i < flights.length; i++) {
            Customer[] customers = flights[i].getCustomersOnFlight();
            for (int j = 0; j < customers.length; j++) {
                if (customers[j] == customer) {
                    System.out.println("Fetching Flight Information...");
                    System.out.println("Flight number: " + flights[i].getFlightNumber() +
                            ", Departure time: " + flights[i].getDepartureTime() + ", Destination: "
                            + flights[i].getDestination());
                    hasFlights = true;
                }
            }

        }
        if (hasFlights == false) {
            System.out.println("Sorry, you have no flights booked!");
        }

    }
}
    
}
