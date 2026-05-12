package MethodOverRiding;

public class SpecialistAppointment extends Appointment{

    @Override
    public void bookAppointment(String name, int age){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
        System.out.println("Specialist Appointment booking");
    }
}
