package MethodOverRiding;

public class GeneralAppointment extends Appointment {

    @Override
    public void bookAppointment(String name, int age){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
        System.out.println("General Appointment booking");
    }

}
