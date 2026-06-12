package Examples;

public class WordOccurrence {

    public static void main(String[] args) {

        String str = "WelcomeToJava@#$,23234";
        int alphabets = 0;
        int vowels = 0;
        int consonants = 0;
        int specialchars = 0;
        int numbers = 0;

        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(Character.isLetter(ch)){
               alphabets++;

               if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                   vowels++;
               }
               else {
                   consonants++;
               }
           }

           else if(Character.isDigit(ch)){
               numbers++;
           }
           else {
               specialchars++;
           }

        }
        System.out.println("Alphabets: "+ alphabets);
        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);
        System.out.println("Numbers: "+ numbers);
        System.out.println("Special Characters: "+ specialchars);
    }
}
