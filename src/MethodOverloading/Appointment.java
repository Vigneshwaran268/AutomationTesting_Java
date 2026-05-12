package MethodOverloading;

public class Appointment {

    //General Doctor Consultation
    public void bookAppointment(String name, int age){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Age: "+age);
    }

    //Specialist Consultation
    public void bookAppointment(String doctor_name, String Specialist_Type){
        System.out.println("Doctor Name: "+doctor_name);
        System.out.println("Specialist Type: "+Specialist_Type);
    }

    //Video Consultation
    public void bookAppointment(String doctor_name, String Specialist_Type, String time){
        System.out.println("Doctor Name: "+doctor_name);
        System.out.println("Specialist Type: "+Specialist_Type);
        System.out.println("Consultation Time: "+time);
    }

    public static void main(String[] args) {
        Appointment obj = new Appointment();
        obj.bookAppointment("Vikki", 25);
        obj.bookAppointment("Ram", "Cardiologist");
        obj.bookAppointment("Prabhu", "Neurologist", "10.30 AM");
    }
}
