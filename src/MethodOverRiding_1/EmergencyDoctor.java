package MethodOverRiding_1;

public class EmergencyDoctor extends Doctor {

    @Override
    public void treatPatient() {
        System.out.println("Emergency Doctor treats emergency sickness");
    }
}
