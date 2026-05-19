package Abstraction;

interface Animal {
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat Meows");
    }
}

class MainClass_8{
    public static void main(String[] args) {
        Animal obj;
        obj = new Dog();
        obj.sound();

        obj = new Cat();
        obj.sound();

    }
}


