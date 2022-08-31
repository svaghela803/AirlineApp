package passenger;

public class Passenger {


    private String name;
    private String phoneNumber;
    private String passportNumber;



    public Passenger(String name, String phoneNumber, String passportNumber) {
    }

    //    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;


        }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber (String passportNumber) {
        this.passportNumber = passportNumber;
    }
}


