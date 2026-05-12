package MethodOverRiding;

public class VideoConsultation extends Appointment{

    @Override
    public void bookAppointment(String name, int age){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
        System.out.println("Video Consultation Appointment booking");
    }
}
