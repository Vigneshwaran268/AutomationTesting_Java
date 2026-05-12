package MethodsWithParameters;

public class PrintMultiplicationTable {

    public void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }

    public static void main(String[] args) {
        PrintMultiplicationTable obj = new PrintMultiplicationTable();
        obj.table(5);
    }

}
