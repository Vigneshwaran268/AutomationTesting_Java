package HybridInheritance;

public class Main_Person {

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.Info();
        obj.Teach();

        CollegeStudent obj1 = new CollegeStudent();
        obj1.Info();
        obj1.Study();
        obj1.Write();
    }
}
