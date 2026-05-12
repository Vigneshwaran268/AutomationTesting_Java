package MethodOverRiding_1;

public class Main_AnimalSoundSystem {

    public static void main(String[] args) {
        Animal obj;

        obj = new Dog();
        obj.sound();

        obj = new Cat();
        obj.sound();

        obj = new Cow();
        obj.sound();
    }
}
