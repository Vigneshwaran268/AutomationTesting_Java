package MethodsWithParameters;

public class PrintVowelOrConsonant {

    public void VowelOrConsonant(char c){
        if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u'){
            System.out.println("Given character is vowel");
        }
        else {
            System.out.println("Given character is consonant");
        }
    }

    public static void main(String[] args) {
        PrintVowelOrConsonant obj = new PrintVowelOrConsonant();
        obj.VowelOrConsonant('r');
    }
}
