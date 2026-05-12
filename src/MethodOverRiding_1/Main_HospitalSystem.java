package MethodOverRiding_1;

public class Main_HospitalSystem {

    public static void main(String[] args) {
        Doctor obj;

        obj = new GeneralDoctor();
        obj.treatPatient();

        obj = new SpecialistDoctor();
        obj.treatPatient();

        obj = new EmergencyDoctor();
        obj.treatPatient();
    }
}
