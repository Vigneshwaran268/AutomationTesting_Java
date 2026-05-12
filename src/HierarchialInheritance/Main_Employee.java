package HierarchialInheritance;

public class Main_Employee {

    public static void main(String[] args) {

        Developer obj = new Developer();
        obj.Work();
        obj.Code();

        Tester obj1 = new Tester();
        obj1.Work();
        obj1.Test();
    }
}
