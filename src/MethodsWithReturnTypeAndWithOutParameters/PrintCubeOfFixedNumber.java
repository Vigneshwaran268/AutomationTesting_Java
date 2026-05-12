package MethodsWithReturnTypeAndWithOutParameters;

public class PrintCubeOfFixedNumber {

    public int cube(){
        int n = 3;
        int result = n*n*n;
        return result;
    }

    public static void main(String[] args) {
        PrintCubeOfFixedNumber obj = new PrintCubeOfFixedNumber();
        int cube = obj.cube();
        System.out.println(cube);
    }
}
