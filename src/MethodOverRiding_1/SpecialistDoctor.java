package MethodOverRiding_1;

public class SpecialistDoctor extends Doctor{

    @Override
    public void treatPatient() {
        System.out.println("Specialist Doctor treats specific illness");
    }
}
