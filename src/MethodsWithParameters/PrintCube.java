package MethodsWithParameters;

public class PrintCube {

    public void cube(int a){
        System.out.println(a*a*a);
    }

    public static void main(String[] args) {
        PrintCube obj = new PrintCube();
        obj.cube(3);
    }
}
