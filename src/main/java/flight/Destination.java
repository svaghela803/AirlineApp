package Flight;

//We use an enum here because our constraints are fixed. i.e our locatios will never change
// They are predefined values to represent the textual date (our destinations)
public enum Destination {

    ANTARCTICA(1),
    SOUTHAFRICA(2),
    CHINA(3),
    RUSSIA(4),
    USA(5);

    private final int flightNumber;

    Destination(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }
}

