//package Main;
//
//import java.util.Scanner;
//
//public class OldMain {
//
//
//    static Scanner scanner1 = new Scanner(System.in);
//    static String name;
//    static int contactNo;
//    static int iD;
//    static String[] flightlist = {"1) IT1", "2) FR2 ", "3) GE3"};
//
//    public static void getName() {
//        System.out.println("Please enter your name");
//        name = scanner1.nextLine();
//        getDetails();
//    }
//
//    public static void getDetails() {
//        System.out.println("Please enter your telephone number");
//        contactNo = Integer.parseInt(scanner1.nextLine());
//        System.out.println("Please enter your Passport Number");
//        iD = Integer.parseInt(scanner1.nextLine());
//
//        System.out.println("Hi " + name + ", your telephone number is " + contactNo + " and your passport number is " + iD);
//        getFlight();
//    }
//
//    public static void getFlight() {
//        System.out.println("Please select a flight");
//        for (int i = 0; i < flightlist.length; i++) {
//            System.out.println(flightlist[i]);
//        }
//        int flightselect = scanner1.nextInt();
//        System.out.println("you selected flight " + flightselect);
//
//
//////        try {  //used if we expect a coding error, and want to send a message.
//////            // also doesn't crash the whole code
//////            ---------------------------------------------
//////        } catch (InputMismatchException exception) {
//////            System.out.println("please enter flight's margin number, not actual flight number"); //Instead of  just crashing we can enter a msg
//////        }
//    }
//
//
//        public static void main(String[]args){
//            getName();
//        } } 
////
////
////
//////private Flight IT1;
//////private Flight  FR2;
//////private Flight GE3;
//////public App ( Flight IT1, Flight FR2,Flight GE3){
//////    this.IT1= IT1;
//////    this.FR2 = FR2;
//////    this.GE3= GE3;
//////}
//////
//////// getters and setters
//////    public Flight getIT1() {return IT1;}
//////
//////    public void setIT1(Flight IT1) {this.IT1 = IT1;}
//////
//////    public Flight getFR2() {return FR2;}
//////
//////    public void setFR2(Flight FR2) {this.FR2 = FR2;}
//////
//////    public Flight getGE3() {return GE3;}
//////
//////    public void setGE3(Flight GE3) {this.GE3 = GE3;}
////
//////    public void addPassengerToFlight(Passenger passengers, Flight flight){
//////        flight.addpassengers(passengers);
//////    }
////    }
////}
////
