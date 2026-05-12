package MethodsWithParamatersAndWithReturnType;

public class AsciiValueOfCharacter {

    public int ascii(char c){
        return (int) c;
    }

    public static void main(String[] args) {
        AsciiValueOfCharacter obj = new AsciiValueOfCharacter();
        int result = obj.ascii('a');
        System.out.println(result);
    }
}
