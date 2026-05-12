package MethodOverloading;

public class Display {

    public void show(int a, String b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("________________________________________________");
    }

    public void show(String b, int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println("___________________________________________________");
    }

    public void show(int a, String b, char c, String d){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("_______________________________________________");
    }

    public void show(String b, int a, double c){
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(4,"Vikki");
        obj.show("Vikki", 7);
        obj.show(8, "Vikki", 'S', "Vignesh");
        obj.show("Vikki", 7, 3.12);
    }
}
