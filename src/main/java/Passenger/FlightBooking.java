package Passenger;

import java.util.Scanner;

public class FlightBooking {


    static Scanner scanner1 = new Scanner(System.in);
    static String name;
    static int contactNo;
    static int iD;
    static String [] flightlist= {"1) IT1" , "2) FR2, ", "3) GE3"};

    public static void getname(){
        System.out.println("Please enter your name");
        name= scanner1.nextLine();
        getDetails(); }

        public static void getDetails(){
        System.out.println("Please enter your telephone number");
        contactNo= Integer.parseInt(scanner1.nextLine());
        System.out.println("Please enter your Passport Number");
        iD= Integer.parseInt(scanner1.nextLine());

            System.out.println("Hi " + name + ", your telephone number is "+contactNo+ " and your passport number is " + iD);
    }


    public static void main(String[] args) {
        getname();
    }

//private Flight IT1;
//private Flight  FR2;
//private Flight GE3;
//public App ( Flight IT1, Flight FR2,Flight GE3){
//    this.IT1= IT1;
//    this.FR2 = FR2;
//    this.GE3= GE3;
//}
//
//// getters and setters
//    public Flight getIT1() {return IT1;}
//
//    public void setIT1(Flight IT1) {this.IT1 = IT1;}
//
//    public Flight getFR2() {return FR2;}
//
//    public void setFR2(Flight FR2) {this.FR2 = FR2;}
//
//    public Flight getGE3() {return GE3;}
//
//    public void setGE3(Flight GE3) {this.GE3 = GE3;}

//    public void addPassengerToFlight(Passenger passengers, Flight flight){
//        flight.addpassengers(passengers);
//    }
}

