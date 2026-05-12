package MethodOverloading;

public class PrintCharacter {

    public void print(char c){
        System.out.println(c);
    }

    public void print(char ch, int count){
        for(int i = 1; i<=count; i++){
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        PrintCharacter obj = new PrintCharacter();
        obj.print('A');
        obj.print('B', 5);
    }
}
