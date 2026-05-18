package Encapsulation;

public class Patient {

    private int patient_Id;
    private String patient_Name;
    private String patient_Disease;

    public void setter(int id, String name, String disease){
        patient_Id = id;
        patient_Name = name;
        patient_Disease = disease;
    }

    public int getId(){
        return patient_Id;
    }

    public String getName(){
        return patient_Name;
    }

    public String getDisease(){
        return patient_Disease;
    }
}

class MainClass_9{
    public static void main(String[] args) {
        Patient obj = new Patient();
        obj.setter(323, "Vignesh", "Fever");
        System.out.println("Patient ID: "+obj.getId());
        System.out.println("Patient Name: "+obj.getName());
        System.out.println("Disease: "+obj.getDisease());
    }
}
