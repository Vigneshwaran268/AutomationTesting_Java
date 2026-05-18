package Encapsulation;

class Example_1 {

    private int empId;
    private String empName;

    public void setter(int id, String name){
        empId = id;
        empName = name;
    }

    public int getterId(){
        return empId;
    }

    public String getterName(){
        return empName;
    }
}

class MainClass_1{
    public static void main(String[] args) {

        Example_1 obj = new Example_1();
        obj.setter(33333, "Vikki");
        System.out.println("Employee Name: "+obj.getterName());
        System.out.println("Employee Id: "+obj.getterId());

    }
}


