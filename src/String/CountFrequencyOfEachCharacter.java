package String;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "Vikki";

        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            int count = 0;
            
            for(int j=0; j<=str.length()-1; j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+"="+count);
        }

    }
}