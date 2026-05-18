package Encapsulation;

public class Passenger {

    private String passengerName;
    private int passportNumber;
    private int seatNumber;

    public void setter(String name, int passNum, int seatNum){
        passengerName = name;
        passportNumber = passNum;
        seatNumber = seatNum;
    }

    public String getName(){
        return passengerName;
    }

    public int getPassNum(){
        return passportNumber;
    }

    public int getSeatNum(){
        return seatNumber;
    }
}

class MainClass_17{
    public static void main(String[] args) {
        Passenger obj = new Passenger();
        obj.setter("Ram", 78906, 15);
        System.out.println("Passenger Name: "+obj.getName());
        System.out.println("Passport Number: "+obj.getPassNum());
        System.out.println("Seat Number: "+obj.getSeatNum());
    }
}
