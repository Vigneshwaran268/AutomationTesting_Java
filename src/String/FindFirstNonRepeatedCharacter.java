package String;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "Programming";

        for(int i = 0; i<=str.length()-1; i++){
           char c =  str.charAt(i);

           if(str.indexOf(c) == str.lastIndexOf(c)){
               System.out.println(c);
               break;
           }
        }
    }
}
