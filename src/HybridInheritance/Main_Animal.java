package HybridInheritance;

public class Main_Animal {

    public static void main(String[] args) {

        Cat obj = new Cat();
        obj.eat();
        obj.meow();

        Puppy obj1 = new Puppy();
        obj1.eat();
        obj1.Bark();
        obj1.weep();
    }
}
