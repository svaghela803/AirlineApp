package Passenger;

public class Passenger {

    String name;
    int contactNo;
    int iD;
    
    public Passenger(String name, int contactNo, int iD){
        this.name = name;
        this.contactNo = contactNo;
        this.iD = iD;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int contactNo(){
        return contactNo;
    }

    public void setcontactNo(int contactNo){
        this.contactNo = contactNo;
    

    public int getiD(){
        return iD;
    }
    
    public void setiD(int iD) {
        this.iD = iD;
    }
}
