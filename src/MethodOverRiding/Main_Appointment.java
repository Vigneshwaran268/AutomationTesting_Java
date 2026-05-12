package MethodOverRiding;

public class Main_Appointment {

    public static void main(String[] args) {

        Appointment obj;
        obj = new GeneralAppointment();
        obj.bookAppointment("Vikki", 25);

        obj = new SpecialistAppointment();
        obj.bookAppointment("Ram", 65);

        obj = new VideoConsultation();
        obj.bookAppointment("Sam", 19);
    }
}
