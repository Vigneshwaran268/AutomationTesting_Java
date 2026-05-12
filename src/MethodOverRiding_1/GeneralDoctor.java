package MethodOverRiding_1;

public class GeneralDoctor extends Doctor {

    @Override
    public void treatPatient() {
        System.out.println("General doctor treats common issue");
    }
}
