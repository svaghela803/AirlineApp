import Airport.Airport;
import Flight.Flight;
import flight.Destination;
import flight.FlightInfo;
import passenger.Passenger;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    Airport airport = new Airport("BNTA London", 5)

    public static void main(String[] args) {
        Flight flight1 = new Flight(1, Destination.SOUTHAFRICA, 5, new Passenger[5]);
        Flight flight2 = new Flight(2, Destination.ANTARCTICA, 6, new Passenger[6]);
        Flight flight3 = new Flight(3, Destination.CHINA, 3, new Passenger[3]);
        Flight flight4 = new Flight(4, Destination.USA, 7, new Passenger[7]);
        Flight flight5 = new Flight(5, Destination.RUSSIA, 4, new Passenger[4]);

        Airport airport = new Airport("BNTA London", 5);
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);

        System.out.println("Welcome to BNTA Airlines");
        System.out.println("------------------------");
        boolean customerOrStaffValid = false;
        String name = null;
        String passportNumber = null;
        String phoneNumber = null;
        while (customerOrStaffValid == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 if you are a customer, enter 2 if you are staff");
            String customerOrStaff = scanner.nextLine();
            switch (customerOrStaff) {
                case "1":
                    System.out.println("Enter full name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
            }

            System.out.println("Enter passport number: ");
            passportNumber = scanner.nextLine();
        }

        Passenger passenger = new Passenger (name, phoneNumber, passportNumber);
        customerOrStaffValid = true;
        boolean viewBookOrCancelValid = false;
        while (viewBookOrCancelValid == false) {
            FlightInfo flightInfo = new FlightInfo();
            System.out.println("Enter 1 to view current flights, Enter 2 to book a new flight, Enter 3 to view your bookings, Enter 4 to a cancel a flight, Enter 5 to quit the program: ");
            String viewBookOrCancel = scanner.nextLine();
            switch (viewBookOrCancel) {
                case "1":
                    flightInfo.displayFlights(Airport);
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("Please enter the flight number of the flight you would like to book: ");
                    String flightNum = scanner.nextLine();
                    flightInfo.bookFlight(flightInfo.findFlightByNum(flightNum, Airport), passenger);
                    break;
                case "3":
                    flightInfo.viewBookings(Airport,passenger);
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("Please enter the flight number of the flight you would like to cancel: ");
                    flightNum = scanner.nextLine();
                    flightInfo.cancelFlight(flightInfo.findFlightByNum(flightNum, airport), passenger);
                    break;
                case "5":
                    System.out.println("Thank you for spending time with us!");
                    viewBookOrCancelValid = true;
                    break;
                default:
                    System.out.println("Must only enter 1, 2, 3, 4 or 5!");
            }
            System.out.println();
        }
        break;

        case "2":
        System.out.println("System is temporarily offline for staff.");
        customerOrStaffValid = true;
        break;
        default:
        System.out.println("Must only enter 1 or 2!");
    }
        }
