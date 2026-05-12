package Switch;

public class PrintVowelOrConsonantBySwitch {

    public static void main(String[] args){

        char letter = 'e';
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is vowel");
                break;

            default:
                System.out.println("It is consonant");
                break;

        }
    }
}
