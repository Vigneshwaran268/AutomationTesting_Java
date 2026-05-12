package String;

public class ExtractDigitsFromString {

    public static void main(String[] args) {

        String str = "a123b45c6";
        String result = "";

        for(int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if(ch>='0' && ch<='9'){
                result = result+ch;
            }
        }
        System.out.println(result);
    }
}
