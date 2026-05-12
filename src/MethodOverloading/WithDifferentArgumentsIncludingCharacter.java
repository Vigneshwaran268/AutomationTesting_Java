package MethodOverloading;

public class WithDifferentArgumentsIncludingCharacter {

    public void show(int a){
        System.out.println(a);
    }

    public void show(double a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        WithDifferentArgumentsIncludingCharacter obj = new WithDifferentArgumentsIncludingCharacter();
        obj.show(45);
        obj.show(3.14);
        obj.show('A');
    }
}
