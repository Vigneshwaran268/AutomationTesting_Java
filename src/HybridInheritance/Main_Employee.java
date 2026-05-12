package HybridInheritance;

public class Main_Employee {

    public static void main(String[] args) {

        Tester obj = new Tester();
        obj.Work();
        obj.Test();

        SenDeveloper obj1 = new SenDeveloper();
        obj1.Work();
        obj1.Code();
        obj1.Design();
    }
}
