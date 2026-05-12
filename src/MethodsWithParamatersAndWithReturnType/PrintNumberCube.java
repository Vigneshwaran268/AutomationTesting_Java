package MethodsWithParamatersAndWithReturnType;

public class PrintNumberCube {

    public int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        PrintNumberCube obj = new PrintNumberCube();
        int result = obj.cube(3);
        System.out.println(result);
    }
}
