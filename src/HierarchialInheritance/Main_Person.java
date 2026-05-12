package HierarchialInheritance;

public class Main_Person {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.Info();
        obj.Study();

        Teacher obj1 = new Teacher();
        obj1.Info();
        obj1.Teach();
    }
}
