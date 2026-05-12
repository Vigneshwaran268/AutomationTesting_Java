package MethodOverloading;

public class Check {

    public void checkEvenorOdd(int a){
        if(a%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }

    public void vowelOrConsonant(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Check obj = new Check();
        obj.checkEvenorOdd(6);
        obj.vowelOrConsonant('v');

    }
}
